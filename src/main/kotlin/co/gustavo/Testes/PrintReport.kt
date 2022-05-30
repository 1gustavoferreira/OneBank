package co.gustavo.Testes

import co.gustavo.Employee

class PrintReport {
    companion object{
        fun print(employee: Employee){
            println(
                employee.toString()
            )
        }
    }
}