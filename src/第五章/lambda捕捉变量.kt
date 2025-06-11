package 第五章

/**
 * 日期 : 2020/10/28.
 * 创建 : xin.li
 * 描述 :
 */

fun printProblemCounts(response: Collection<String>){
    //如果有异步或者时间处理之后的lambda则不能修改这些var值
    var appErrors = 0
    var serverErrors = 0
    response.forEach {
        if (it.startsWith("4")){
            appErrors++
        } else if (it.startsWith("5")){
            serverErrors++
        }
    }
    println("客户端出错 $appErrors 次, 服务端出错 $serverErrors 次...")

}

fun main(args: Array<String>) {
    val listOf = listOf<String>("404", "444", "500")
    printProblemCounts(listOf)
}