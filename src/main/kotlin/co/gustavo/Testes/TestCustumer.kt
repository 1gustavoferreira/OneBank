package co.gustavo.Testes

import co.gustavo.Client
import co.gustavo.CustomerType

fun main(){
    val jose = Client(
        "Jose",
        "123.456.678-10",
        CustomerType.PP,
        "1234"
    )
    println(jose)

    TestAuthentication().authentication(jose)
}
