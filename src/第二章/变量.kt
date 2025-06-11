package 第二章

/**
 * 日期 : 2020/10/17.
 * 创建 : xin.li
 * 描述 :
 */
fun main(args: Array<String>) {
    val name = 111
    println("我是 $name")
    println("我是 \$name")
    if (args.size > 0){
        println("helle , ${args[0]}")
    }
    val `in` = 123
    println( `in`)
}

// ``反引号可以将不能正常使用的字符转换为可以使用的字符
class `-KotlinTest`{

}