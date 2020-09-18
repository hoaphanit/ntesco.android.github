package com.vn.ntesco.network

import com.vn.ntesco.model.Request.*
import com.vn.ntesco.model.Response.*
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.*
import rx.Observable


interface NTescoService {
    companion object {
        const val path: String = "/api/"
        const val report: String = "/api/report/"
    }

    @GET(path + "chemicals")
    fun getChemicals(): Observable<ChemicalsResponse>

    @POST(path + "calculation/calculator-powder")
    fun calculatorPowderChemicals(@Body nTescoRequestPOST: NTescoRequestPOST): Observable<CalculatorChemicalsResponse>

    @POST(path + "calculation/calculator-liquid")
    fun calculatorLiquidChemicals(@Body nTescoRequestPOST: NTescoRequestPOST): Observable<CalculatorChemicalsResponse>

    @GET(path + "pages/get-page")
    fun getAboutUs(@QueryMap nTescoRequestGET: NTescoRequestGET): Observable<AboutUsResponse>


    @POST(path + "login")
    fun login(@Body loginRequest: LoginRequest): Observable<UserResponse>

    @POST(path + "signup")
    fun signup(@Body signupRequest: SignupRequest): Observable<UserResponse>

    @GET(path + "offices")
    fun getOffices(@QueryMap nTescoRequestGET: NTescoRequestGET): Observable<OfficesResponse>


    @GET(path + "customer/index")
    fun getReport(@QueryMap nTescoRequestGET: NTescoRequestGET): Observable<ReportResponse>

    @GET(path + "employee/list-work")
    fun getAllListWork(@QueryMap nTescoRequestGET: NTescoRequestGET): Observable<ReportResponse>

    @GET(path + "employee/my-list-work")
    fun getMyListWork(@QueryMap nTescoRequestGET: NTescoRequestGET): Observable<ReportResponse>

    @GET(path + "option-raw-water-types")
    fun getRawWaterType(@QueryMap nTescoRequestGET: NTescoRequestGET): Observable<RawWaterTypeResponse>

    @GET(path + "option-products")
    fun getProduct(@QueryMap nTescoRequestGET: NTescoRequestGET): Observable<RawWaterTypeResponse>

    @GET(path + "detail-report/{report}")
    fun getDetailReport(@Path("report") report: String, @QueryMap nTescoRequestGET: NTescoRequestGET): Observable<ReportDetailReponse>

    @GET(path + "notifications")
    fun getNotifications(@QueryMap nTescoRequestGET: NTescoRequestGET): Observable<NotificationResponse>

    @GET(path + "notifications/{notificationId}")
    fun getDetailNotification(@Path("notificationId") id: Int): Observable<DetailNotificationResponse>

    @GET(path + "posts")
    fun getPost(@QueryMap nTescoRequestGET: NTescoRequestGET): Observable<PostResponse>

    @GET(path + "posts/{Id}")
    fun getDetailPost(@Path("Id") id: Int): Observable<DetailPostResponse>

    @GET(path + "categories")
    fun getCategoriesSolution(): Observable<CategoryResponse>

    @GET(path + "products/{product}")
    fun getProductDetail(@Path("product") id: Int): Observable<ProductDetailResponse>


    @GET(path + "products")
    fun getSolutionProducts(@QueryMap nTescoRequestGET: NTescoRequestGET): Observable<SolutionProductResponse>

    @GET(path + "schedules")
    fun getSchedules(@QueryMap nTescoRequestGET: NTescoRequestGET): Observable<ScheduleResponse>

    @GET(path + "get-profile")
    fun getProfile(): Observable<UserResponse>

    @PUT(path + "update-profile")
    fun updateProfile(@Body signupRequest: SignupRequest): Observable<UserResponse>

    @PUT(path + "change-password")
    fun changePassword(@Body signupRequest: SignupRequest): Observable<UserResponse>

    @PUT(report + "confirm/{reportId}")
    fun confirmReport(@Path("reportId") id: Int?): Observable<NTescoResponse>

    @POST(report + "completed/{reportId}")
    fun completeReport(@Path("reportId") id: Int?, @Body nTescoRequestPOST: NTescoRequestPOST): Observable<NTescoResponse>

    @GET(path + "banners")
    fun getBanners(@QueryMap nTescoRequestGET: NTescoRequestGET): Observable<BannerResponse>

    @POST(path + "reset-password")
    fun resetPassword(@Body signupRequest: SignupRequest): Observable<NTescoResponse>

    @POST(path + "send-contact")
    fun sendContact(@Body signupRequest: SignupRequest): Observable<NTescoResponse>

    @PUT(path + "switch-language")
    fun switchLanguage(): Observable<NTescoResponse>

    @GET(path + "notifications/count-unread")
    fun getTotalNotifyUnread(): Observable<TotalNotifyUnreadResponse>

    @POST(path + "logout")
    fun logOut(): Observable<NTescoResponse>

    @POST(path + "messages")
    fun sendMessage(@Body messageRequest: MessageRequest): Observable<NTescoResponse>

    @GET(path + "social-networks")
    fun getSocialNetworks(): Observable<SocialResponse>

    @GET(path + "handle-formalities")
    fun getFormsProcessing(): Observable<RawWaterTypeResponse>

    @GET(path + "technicals")
    fun getListTechnicals(): Observable<ListTechnicalResponse>

    @PUT(report + "assigned/{reportId}")
    fun assignReport(@Path("reportId") id: Int?, @Body assignRequest: AssignRequest): Observable<NTescoResponse>


    @GET(path + "check-version")
    fun checkVersion(@QueryMap nTescoRequestGET: NTescoRequestGET): Observable<CheckVersionResponse>

    @DELETE(path + "notifications/{notificationId}")
    fun deleteNotification(@Path("notificationId") notificationId: Int): Observable<NTescoResponse>

    @Multipart
    @POST(report + "send")
    fun createReport(@PartMap params: Map<String, @JvmSuppressWildcards RequestBody>, @Part imgList: MutableList<MultipartBody.Part>, @Part("raw_water_type[]") rawWaterTypes: List<@JvmSuppressWildcards RequestBody>, @Part("products[]") products: List<@JvmSuppressWildcards RequestBody>): Observable<NTescoResponse>

    @Multipart
    @POST(report + "processing-status/{reportId}")
    fun processingStatusReport(@Path("reportId") reportId: Int, @PartMap params: Map<String, @JvmSuppressWildcards RequestBody>, @Part imgList: MutableList<MultipartBody.Part>): Observable<NTescoResponse>

    @Multipart
    @POST(report + "processed/{reportId}")
    fun processedReport(@Path("reportId") reportId: Int, @PartMap params: Map<String, @JvmSuppressWildcards RequestBody>, @Part imgList: MutableList<MultipartBody.Part>): Observable<NTescoResponse>

    @Multipart
    @POST(path + "change-avatar")
    fun changeAvatar(@Part image: MultipartBody.Part): Observable<NTescoResponse>

    @GET(path + "checklists")
    fun getCheckLists(): Observable<CheckListResponse>

    @POST(path + "checklists")
    fun checkList(@Body checkListRequest: CheckListRequest): Observable<NTescoResponse>

    @GET(path + "guarantees")
    fun getGuarantees(): Observable<RawWaterTypeResponse>
}


