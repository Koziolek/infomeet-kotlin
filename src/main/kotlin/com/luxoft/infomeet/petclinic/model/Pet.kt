package com.luxoft.infomeet.petclinic.model

import java.time.LocalDate

/**
 * Created by BKuczynski on 2016-06-08.
 */
data class PetType(val name:String)

data class Pet(val name: String, val birthDate: LocalDate, val owner: Owner, val type:PetType)