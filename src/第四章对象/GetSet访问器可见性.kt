package 第四章对象

class LengthCounter{
    var counter : Int = 0
        private set

    fun addWord(word: String){
        counter += word.length
    }
}

fun main() {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("hello")
    //lengthCounter.conunt == 20
    println(lengthCounter.counter)
}