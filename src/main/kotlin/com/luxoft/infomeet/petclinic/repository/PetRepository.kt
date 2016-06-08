package com.luxoft.infomeet.petclinic.repository

import com.luxoft.infomeet.petclinic.model.Pet

/**
 * Created by BKuczynski on 2016-06-08.
 */
class PetRepository : Repository<Pet, Long> {

    override fun byId(id: Long): Pet {
        throw UnsupportedOperationException()
    }

    override fun save(t: Pet): Pet {
        throw UnsupportedOperationException()
    }


}