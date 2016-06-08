package com.luxoft.infomeet.petclinic.model

/**
 * Created by BKuczynski on 2016-06-08.
 */
data class Owner(val name: String, val pets: MutableList<Pet> = mutableListOf()){
    override fun toString(): String {
        return "Owner(name=$name)"
    }
}

operator fun Owner.plus(pet: Pet) {
    this.pets.add(pet)
    pet.owner = this
}

