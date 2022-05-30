package co.gustavo.Testes

import co.gustavo.Manager

fun main(){
    val gustavo = Manager("Gustavo","123.456.789-10", 5000.0, "1234" +
            "")

    PrintReport.print(gustavo)

    TestAuthentication().authentication(gustavo)
}
