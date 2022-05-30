package co.gustavo

abstract  class Employee(
    name: String,
    cpf: String,
    val wage: Double
) : People(name, cpf) {
    protected abstract fun AuxiliaryCalculus(): Double

    override fun toString(): String = """
        Name: $name
        CPF: $cpf
        Wage: $wage
        Help: ${AuxiliaryCalculus()}
    """.trimIndent()

}