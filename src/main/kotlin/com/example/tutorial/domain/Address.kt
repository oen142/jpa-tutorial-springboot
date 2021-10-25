package com.example.tutorial.domain

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
class Address(
    @Column(nullable = false)
    val city: String,

    @Column(nullable = false)
    val street: String,

    @Column(nullable = false)
    val zipcode: String
)