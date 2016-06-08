package com.luxoft.infomeet.petclinic.model

/**
 * Created by BKuczynski on 2016-06-08.
 */
data class Owner(val name:String, val pets:MutableList<Pet> = mutableListOf())