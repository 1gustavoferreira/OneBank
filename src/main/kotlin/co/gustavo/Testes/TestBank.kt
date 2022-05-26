package co.gustavo.Testes

import co.gustavo.Bank

fun main(){
    val oneBank = Bank(name = "OneBank", number = 12)

    println(oneBank.name)
    println(oneBank.number )

    val bank2 = oneBank.copy(name = "TwoBank")

    println(bank2.info())
}