package com.vn.ntesco.listener

interface ItemClickListener {
    fun <T : Any> onItemClick(item: T, position: Int)
}
interface ItemButtonClickListener {
    fun <T : Any> onDeleteClick(item: T, position: Int)
}