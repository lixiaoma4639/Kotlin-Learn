package 第八章lambda作为形参和返回值.高级函数的控制流

/**
 * 日期 : 2020/11/8.
 * 创建 : xin.li
 * 描述 :
 */

data class PersonReturn(val name : String , val age : Int)

fun main() {
    val listOf = listOf(PersonReturn("李鑫", 18), PersonReturn("杂费", 39))
    listOf.forEach {
        if (it.age > 20){
            println("找到20岁上的人了...")
            //只可以在inline的的函数中使用return
            return@forEach
        }
    }
    println("没找到20岁上的人了...")

}

fun main1() {
    hhhh label@{
        println("进来了1...")
        return@label
        println("进来了11...")
    }
    hhhh {
        println("进来了2...")
        return@hhhh
        println("进来了22...")
    }
    println("测试lambda return")
}

fun hhhh(aaa : () -> Unit){
    aaa()
}


fun main2() {
    val sb = StringBuilder().apply sb@{
        listOf(1, 2 ,3).apply {
            this@sb.append(this.toString())
        }
    }
    println(sb)
}