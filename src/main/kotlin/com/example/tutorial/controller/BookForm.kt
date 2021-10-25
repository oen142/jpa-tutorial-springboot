package com.example.tutorial.controller

data class BookForm(

    var id: Long,
    var name: String,
    var price: Int,
    var stockQuantity: Int,
    var author: String,
    var isbn: String
)