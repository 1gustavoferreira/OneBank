package co.gustavo

class Analyst(
    name: String,
    cpf: String,
    wage: Double
): Employee(name, cpf, wage) {
    override fun AuxiliaryCalculus(): Double = wage * 0.1
}