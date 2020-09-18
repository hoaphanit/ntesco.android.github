package com.vn.ntesco.adapter

import android.content.Context
import android.graphics.Typeface
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.tasks.RuntimeExecutionException
import com.google.android.gms.tasks.Tasks
import com.google.android.libraries.places.api.model.AutocompleteSessionToken
import com.google.android.libraries.places.api.model.RectangularBounds
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse
import com.google.android.libraries.places.api.net.PlacesClient
import com.vn.ntesco.R
import com.vn.ntesco.utils.WriteLog
import java.util.ArrayList
import java.util.concurrent.ExecutionException
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException

class PlaceAutocompleteAdapter(val mContext: Context, val layout: Int, val placesClient: PlacesClient
                               , val mListener: PlaceAutoCompleteInterface) : androidx.recyclerview.widget.RecyclerView.Adapter<PlaceAutocompleteAdapter.PlaceViewHolder>(), Filterable {

    interface PlaceAutoCompleteInterface {
        fun onPlaceClick(place: PlaceAutocomplete)
    }

    private val TAG = "PlaceAutocompleteAdapter"
    private val STYLE_BOLD = StyleSpan(Typeface.BOLD)
    internal var mResultList: MutableList<PlaceAutocomplete>? = ArrayList<PlaceAutocomplete>()
    var positionSelected = -1


//    private lateinit var mGoogleApiClient: GoogleApiClient
//
//    private var mBounds: RectangularBounds? = null


//    private var mPlaceFilter: AutocompleteFilter


    /*
    Clear List items
     */
    fun clearList() {
        if (mResultList != null && mResultList!!.size > 0) {
            mResultList!!.clear()
            notifyDataSetChanged()
        }
    }


    override fun getFilter(): Filter {
        positionSelected =-1
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence): FilterResults {
                val results = FilterResults()
                WriteLog.e("fillllllllllll", constraint.toString())
                // Skip the autocomplete query if no constraints are given.
                if (constraint != null) {
                    // Query the autocomplete API for the (constraint) search string.
                    mResultList = getAutocomplete(constraint)
                    if (mResultList != null) {
                        // The API successfully returned results.
                        results.values = mResultList
                        results.count = mResultList!!.size
                    }
                }
                WriteLog.e("result", results.count.toString() + "")
                return results
            }

            override fun publishResults(constraint: CharSequence, results: FilterResults?) {
                if (results != null && results.count > 0) {
                    // The API returned at least one result, update the data.
                    notifyDataSetChanged()
                } else {
                    // The API did not return any results, invalidate the data set.
                    //notifyDataSetInvalidated();
                }
            }
        }
    }

    private fun getAutocomplete(constraint: CharSequence): MutableList<PlaceAutocomplete>? {
        val token = AutocompleteSessionToken.newInstance()

        val request = FindAutocompletePredictionsRequest.builder()
                // Call either setLocationBias() OR setLocationRestriction().
                //                .setLocationBias(mBounds)
                //.setLocationRestriction(bounds)
                .setCountry("vn")
                //                .setTypeFilter(TypeFilter.ADDRESS)
                .setSessionToken(token)
                .setQuery(constraint.toString())
                .build()
        //        synchronized (this){
        val findAutocompletePredictionsResponse = placesClient.findAutocompletePredictions(request)
        try {
            Tasks.await<FindAutocompletePredictionsResponse>(findAutocompletePredictionsResponse, 60, TimeUnit.SECONDS)
        } catch (e: ExecutionException) {
            e.printStackTrace()
        } catch (e: InterruptedException) {
            e.printStackTrace()
        } catch (e: TimeoutException) {
            e.printStackTrace()
        }

        try {
            val autocompletePredictions = findAutocompletePredictionsResponse.getResult()
            if (!findAutocompletePredictionsResponse.isSuccessful()) {
                return null
            } else {
                val resultList = ArrayList<PlaceAutocomplete>()
                //                List<AutocompletePrediction> iterator = findAutocompletePredictionsResponse.getResult().getAutocompletePredictions();
                for (prediction in autocompletePredictions?.getAutocompletePredictions()!!) {
                    resultList.add(
                            PlaceAutocomplete(
                                    prediction.getPlaceId(),
                                    prediction.getFullText(null),
                                    false
                            )
                    )
                }
                return resultList

            }
        } catch (e: RuntimeExecutionException) {
            return null
        }


    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): PlaceViewHolder {
        val layoutInflater = mContext?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val convertView = layoutInflater.inflate(layout, viewGroup, false)
        return PlaceViewHolder(convertView)
    }


    override fun onBindViewHolder(mPredictionHolder: PlaceViewHolder, i: Int) {
        mPredictionHolder.mAddress.setText(mResultList!![i].description)
        if(mResultList!![i]?.isSelected){
            mPredictionHolder.mAddress.setTextColor(ContextCompat.getColor(mContext,R.color.blue))
            positionSelected= i
        }else{
            mPredictionHolder.mAddress.setTextColor(ContextCompat.getColor(mContext,R.color.black_light))
        }
        mPredictionHolder.itemView.setOnClickListener(View.OnClickListener {
            if (positionSelected == -1) {
                mResultList!![i].isSelected= true
                notifyDataSetChanged()
            }else{
                if(positionSelected!=i){
                    mResultList!![positionSelected].isSelected= false
                    mResultList!![i].isSelected= true
                    notifyDataSetChanged()
                }
            }
            if (i < mResultList!!.size)
                mListener.onPlaceClick(mResultList!![i])
        })
        /*mPredictionHolder.itemView.setOnClickListener(new_process View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clickFinnish !=null ){
                    clickFinnish.ClickAddress();
                }

            }
        });*/

    }

    override fun getItemCount(): Int {
        return if (mResultList != null)
            mResultList!!.size
        else
            0
    }

    fun getItem(position: Int): PlaceAutocomplete {
        return mResultList!![position]
    }

    /*
    View Holder For Trip History
     */
    inner class PlaceViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
        //        CardView mCardView;
        var mAddress: TextView

        init {
            mAddress = itemView.findViewById(R.id.address) as TextView
        }

    }

    /**
     * Holder for Places Geo Data Autocomplete API results.
     */
    inner class PlaceAutocomplete internal constructor(var placeId: CharSequence, var description: CharSequence, var isSelected: Boolean) {

        override fun toString(): String {
            return description.toString()
        }
    }


}