package com.sanat.kotlinpractise

import java.io.Serializable

data class PersonModel (val name: String,
                        val age: Int,
                        val country: String) : Serializable