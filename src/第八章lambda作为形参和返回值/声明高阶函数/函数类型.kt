package 第八章lambda作为形参和返回值.声明高阶函数

/**
 * 日期 : 2020/11/7.
 * 创建 : xin.li
 * 描述 :
 */
fun main() {
    val sum = { x : Int , y : Int -> x + y}
    //显示声明
    val sum2 : (Int , Int) -> Int = { x , y -> x + y}

    val action = { println(42) }
    //显示声明
    val action2 : () -> Unit = { println(33) }

    performRequest(url = "https://www.baidu.com") {
        code, json -> println("code = $code , json = $json")
    }
}

fun performRequest(url : String , callback : (code : Int, json : String) -> Unit){
    //执行网络请求动作
    //...
    //请求成功
    callback(200 , "成功了...")
}