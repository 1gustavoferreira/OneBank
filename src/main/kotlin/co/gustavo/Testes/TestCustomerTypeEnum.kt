package co.gustavo.Testes

import co.gustavo.CustomerType

fun main(){
    CustomerType.values().forEach {
        println("${it.name} - ${it.description }")
    }

    val pp = CustomerType.PP
    println("${pp.name} - ${pp.description}")

    val lp = CustomerType.LP
    println("${lp.name} - ${lp.description}")
}