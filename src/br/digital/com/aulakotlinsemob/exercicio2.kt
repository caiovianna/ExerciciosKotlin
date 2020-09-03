package br.digital.com.aulakotlinsemob

fun main()
{
    println(comparaString("Maria", "Maria"))
}

fun comparaString(txt1: String, txt2: String) :Boolean
{
    return txt1 != txt2
}