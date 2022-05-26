package co.gustavo.Testes

import co.gustavo.Employee

fun main(){
    val gustavo = Employee("Gustavo","123.456.789-10", 2000.0)
    println(gustavo.name)
    println(gustavo.cpf)
    println(gustavo.wage)

}