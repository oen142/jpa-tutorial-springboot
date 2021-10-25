package com.example.tutorial.controller

data class MemberForm(

    @NotEmpty()
    var name: String,
    var city: String,
    var street: String,
    var zipcode: String
) {
}