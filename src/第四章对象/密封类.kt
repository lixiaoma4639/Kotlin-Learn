package 第四章对象

import java.lang.IllegalArgumentException

/**
 * 日期 : 2020/10/21.
 * 创建 : xin.li
 * 描述 :
 */

interface Expr

class Number(val value : Int) : Expr

class Sum(val left : Expr , val right : Expr) : Expr

fun eval(e : Expr) : Int = when(e){
    is Number -> e.value
    is Sum -> eval(e.right) + eval(e.left)
    else -> throw IllegalArgumentException()
}

//sealed封闭类修饰符
sealed class Expr2{
    class Number2(val value : Int) : Expr2()

    class Sum2(val left : Expr2 , val right : Expr2) : Expr2()

    class Expr4 : Expr2()
}

class Expr3 : Expr2(){
    fun aaaa(){

    }
}


fun eval2(e : Expr2) : Int = when(e){
    is Expr2.Number2 -> e.value
    is Expr2.Sum2 -> eval2(e.right) + eval2(e.left)
    is Expr3 -> 3
    is Expr2.Expr4 -> 6
}
