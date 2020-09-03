package br.digital.com.aulakotlinsemob

fun main()
{
    println(maiorNumero(3, 4, 9))
}

fun maiorNumero (num1: Int, num2: Int, num3: Int) :Int
{
    return maxOf(num1, num2, num3)
}