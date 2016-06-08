package com.luxoft.infomeet.petclinic.repository

/**
 * Created by BKuczynski on 2016-06-08.
 */
interface Repository<T, ID> {

    abstract fun byId(id: ID): T

    abstract fun save(t: T): T

    open fun delete(t:T){

    }

}