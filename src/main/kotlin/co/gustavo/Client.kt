package co.gustavo

class Client(
    name: String,
    cpf: String,
    val CustumerType: CustomerType,
    val password: String
): People(name, cpf), Logable {
    override fun login(): Boolean = "1234" == password

    override fun toString(): String = """
    Name: $name
    Cpf: $cpf
    Type: ${CustumerType.description}
    """.trimIndent()
}