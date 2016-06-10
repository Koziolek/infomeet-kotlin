package com.luxoft.infomeet.petclinic.model

/**
 * Created by BKuczynski on 2016-06-10.
 */
data class Vet(val name: String, val clients: MutableList<Pet> = mutableListOf()) {
}



