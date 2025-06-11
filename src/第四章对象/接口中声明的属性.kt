package 第四章对象

/**
 * 日期 : 2020/10/22.
 * 创建 : xin.li
 * 描述 :
 */

interface User{
    val nickname : String
    val emailName : String
        get() = nickname + "默认"
}

class Private(override val nickname: String) : User

class SubscribingUser(val email : String) : User{
    override val nickname: String
        get() {
            println("1")
            return email.substringBefore("@")
        }
}

class FacebookUser(val accountId : Int) : User{
    override val nickname: String = getAccountName(accountId)

    private fun getAccountName(accountId: Int) : String = when(accountId){
        1 -> "111"
        else -> "2222"
    }
}

fun main() {
    println(Private("lixin2").nickname)
    val subscribingUser = SubscribingUser("LiXin@4629.com")
    println(subscribingUser.nickname)
    println(subscribingUser.nickname)
    println(subscribingUser.emailName)
    println(FacebookUser(3).nickname)
}