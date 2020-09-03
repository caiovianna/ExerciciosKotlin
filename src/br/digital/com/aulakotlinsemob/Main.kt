package br.digital.com.aulakotlinsemob

fun main()
{
    println("Hello World")
    println(meuNome("Caio ", "Vianna"))

    var lista = arrayListOf<String>()
    lista.add("THE KING")
    println(lista.get(0)) //or lista[0]


}

fun meuNome(nome: String, sobrenome: String) :String
{
    return nome + sobrenome
}
