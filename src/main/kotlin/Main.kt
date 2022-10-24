import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import superUtil.*
import superUtil.cout.endl

var a = ""

fun main() {
    val b = 0{toInt()}
    cin() shr ::a shr b
    cout shl a shl "+" shl b shl "=" shl a.toInt() + b.get() shl endl
}


public class Main {

}

fun maybeString(): String? {
    return null
}


fun maiwen() {
    /*
        val item=Item()
        item.name="Kotlin"
        item.description="世界一すごいプログラミング言語"
        item.price=999999
        println(item)



        println(Item().apply {
            name="Kotlin"
            description="世界一すごいプログラミング言語"
            price=999999
        })*/
    runBlocking {
        async {
            delay(1000)
            println("非同期")
        }
        println("同期")
    }
    try {
        throw Exception()
    } catch (e: Exception) {
    }
}

class Item {
    var name: String? = null
    var description: String? = null
    var price: Int? = null
    override fun toString(): String {
        return "名前：$name 説明：$description 値段：$price"
    }
}