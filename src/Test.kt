fun main() {
    var a: AA? = null
//    a = AA();

    if (1 == a?.age) {
        println(1 == a?.age)
    } else {
        println("else")
    }


}

class AA {
    val age = 2;
}