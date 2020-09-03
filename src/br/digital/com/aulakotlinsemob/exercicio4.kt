package br.digital.com.aulakotlinsemob

fun main()
{
    var x = 0
    for(x in 0..200)
    {
        if(x % 2 != 0)
        {
            println(x)
        }
    }
}

//or
//        for(num in 1..200 step 2){
//            println(num)
//}