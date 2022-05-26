package co.gustavo

abstract  class Employee(
    name: String,
    cpf: String,
    val wage: Double
) : People(name, cpf) {
    abstract fun AuxiliaryCalculus()
}