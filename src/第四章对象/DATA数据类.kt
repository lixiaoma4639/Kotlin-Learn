package 第四章对象

/**
 * 日期 : 2020/10/22.
 * 创建 : xin.li
 * 描述 :
 */

data class Client (val name : String, val postalCode : Int) {

//    fun copy(name: String = this.name, postalCode: Int = this.postalCode)
//            = Client(name, postalCode)

}

fun main() {
    val client = Client("李鑫", 123)
    println(client)
    println(client.copy(postalCode = 456))
    println(client == client.copy(postalCode = 123))
    println(client === client.copy(postalCode = 123))
}