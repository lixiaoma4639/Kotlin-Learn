package 测试

import 第二章.createRectangle

/**
 * 日期 : 2020/10/17.
 * 创建 : xin.li
 * 描述 :
 */
fun main(args: Array<String>) {

//    println(createRectangle().isRectangle)

    var aa : String? = "fff"
    aa = null
    when(aa?.length){
        0 -> println("0")
        1 -> println("a")
        2 -> println("gg")
        3 -> println("ggg")
    }
    println("这里...")
}