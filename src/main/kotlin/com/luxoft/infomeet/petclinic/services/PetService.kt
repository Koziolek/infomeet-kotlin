package com.luxoft.infomeet.petclinic.services

import com.luxoft.infomeet.petclinic.model.Pet
import com.luxoft.infomeet.petclinic.repository.PetRepository

/**
 * Created by BKuczynski on 2016-06-08.
 */
class PetService : GenericService<Pet, Long>(PetRepository()){

    override fun byId(id: Long): Pet {
        println("Selecting pet with $id")
        return super.byId(id)
    }
}