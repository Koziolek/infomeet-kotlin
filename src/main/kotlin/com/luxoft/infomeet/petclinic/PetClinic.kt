package com.luxoft.infomeet.petclinic

import com.luxoft.infomeet.petclinic.model.*
import java.time.LocalDate.of
import java.time.Month.JUNE

/**
 * Created by BKuczynski on 2016-06-08.
 */
fun main(args: Array<String>) {
    val ala = Owner("Ala")
    val kot = Pet("Filemon", of(2016, JUNE, 18), PetType("Kot"))
    ala + kot

    val vet: Vet = Vet("Dr Dolittle")

    kot visit vet;
}

infix fun Pet.visit(vet: Vet) {
    vet.clients.add(this)
}

