package 第六章系统类型._6_1可控性

/**
 * 日期 : 2020/10/31.
 * 创建 : xin.li
 * 描述 :
 */

fun sendEmail(email : String){
    println(email)
}

fun main() {
    val email = "lixin4@123.com";
    //let 接收者对象不为null则执行lambda, 为null则什么也不执行
    email?.let{
        email -> sendEmail(email)
    }
    //
    email?.let{ sendEmail(it) }

    email.let { sendEmail(it) }
}