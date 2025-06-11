package 第四章对象.伴生对象

/**
 * 日期 : 2020/10/24.
 * 创建 : xin.li
 * 描述 :
 */

class A {
    companion object {
        fun bar() {
            println("我是A.class的伴生对象..")
        }
    }
}

/**
 * 普通的多个从构造方法创建对象
 */
class CUser {
    val nickName : String

    constructor(email : String){
        nickName = email.substringBefore("@")
    }

    constructor(id : Int){
        nickName = "我的身份证是:$id"
    }
}

/**
 * 工厂模式中使用伴生对象创建对象
 */
class CUser2 private constructor(val nickName : String){
    companion object{
        fun substringBefore(email : String) =
            CUser2(email.substringBefore("@"))

        fun getNameId(id : Int) =
            CUser2("我的身份证是:$id")
    }
}

fun main(args: Array<String>) {
//    val user = CUser2.substringBefore("lixin@163.com")
//    val user2 = CUser2.getNameId(610502199)
//    println(user.nickName)
//    println(user2.nickName)
    println(CUser2.substringBefore("lixin@163.com"))
    println(CUser2.substringBefore("lixin@163.com"))
}
