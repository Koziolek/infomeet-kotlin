package com.luxoft.infomeet.petclinic.services

import com.luxoft.infomeet.petclinic.repository.Repository

/**
 * Created by BKuczynski on 2016-06-08.
 */
open class GenericService<T, ID>(val repository: Repository<T, ID>) {

    open fun byId(id: ID) = repository.byId(id)

}