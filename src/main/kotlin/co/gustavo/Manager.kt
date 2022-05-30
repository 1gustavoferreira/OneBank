package co.gustavo

class Manager(
    name: String,
    cpf: String,
    wage: Double,
    val password: String
):Employee (name = name,cpf = cpf,wage = wage), Logable {

    override fun AuxiliaryCalculus(): Double = wage * 0.4

    override fun login(): Boolean = "1234" == password
}