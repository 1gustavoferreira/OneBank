package co.gustavo

class Pessoa {
    //MEMBROS DA CLASSE
    var name: String = "Gustavo"
    var cpf: String = "123.456.789-10"
    private set

    constructor()

    fun pessoaInfo() = "name: $name \ncpf: $cpf"
}

fun main(){
    val gustavo = Pessoa()

    println(gustavo.pessoaInfo())

}