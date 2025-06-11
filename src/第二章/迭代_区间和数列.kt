package 第二章

/**
 * 日期 : 2020/10/18.
 * 创建 : xin.li
 * 描述 :
 */

val list = arrayListOf<String>("A" , "b" , "c")

fun fizzBuzz(i : Int) = when{
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
    //.. 闭合区间 , 包含右边值
    for (i in 1..10){
        print(fizzBuzz(i))
    }
    println()
    //downTo 闭合区间 , 包含右边值
    for (i in 10 downTo 1 step 2){
        print(fizzBuzz(i))
    }
    println()

    //until 半闭合区间 , 不包含右边值
    for (i in 0 until 10){
        print(fizzBuzz(i))
    }

    println()
    for ((index , element) in list.withIndex()){
        print("$index = $element ")
    }
}