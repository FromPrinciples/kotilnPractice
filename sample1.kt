package com.example.jooheyongkotilnpractice

fun main(){
    checkNumber(1)

    //String Template

    val name = "JoohyeongKim"
    println("Hello. I am $name who self-taught programmer.")

    println("here are 2\$ dollars")


}


//Conditional expression 조건식, 삼항연산자

fun maxBy(a: Int, b: Int) : Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maxByTernaryOperator(a:Int,b: Int) : Int = if(a>b) a else b

fun checkNumber(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b :Int = when(score){
        1->1
        2->2
        else -> 0
    }

    println("b : $b")

    when(score){
        in 90..100 -> println("Great")
        in 10..80 -> println("Not bad")
        else -> println("Okay")
    }
}

// Expression vs Statement

// Array(Mutable) and List
// ImmutableList, MutableList

fun array(){
    val array: Array<Int> = arrayOf(1,2,3)
    val list = listOf(1,2,3)
    val arrayMultiple:Array<Any> = arrayOf(1,"String",3.14f)
    val listMultiple:List<Any> = listOf(1,"String",3.14f)

    array[0] = 3
    val result = list.get(0)

    val arrayList :ArrayList<Int> = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}


fun helloWorld()  {
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int{
    return a+b
}

fun hi(){
    val a: Int = 10 // value, 상수, cannot be resigned
    var b: Int = 9 // variable, 변수

    var nameAbbreviation : String = "kjh" // String 자동 추론
}