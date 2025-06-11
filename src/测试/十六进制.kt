package 测试

fun main() {

    println(0x05FFEB9C)
    println(0x80EBB95C)
    println(0x80EBB95D)

    val i = (0x80EBB95C - 0x05FFEB9C) / 6
    println(i.toString())
}