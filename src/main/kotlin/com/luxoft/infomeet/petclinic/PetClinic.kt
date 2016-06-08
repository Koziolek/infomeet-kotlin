package com.luxoft.infomeet.petclinic

import com.luxoft.infomeet.petclinic.model.Owner
import com.luxoft.infomeet.petclinic.model.Pet
import com.luxoft.infomeet.petclinic.model.PetType
import java.time.LocalDate.of
import java.time.Month

/**
 * Created by BKuczynski on 2016-06-08.
 */


fun main(args: Array<String>) {
    val ala = Owner("Ala")
    val kot = Pet("Filemon", of(2016, Month.JUNE, 18), ala, PetType("Kot"))

    println("$ala ma ${kot}a")
}