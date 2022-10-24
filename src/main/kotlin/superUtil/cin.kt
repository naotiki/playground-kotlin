package superUtil

import kotlin.reflect.KMutableProperty

class cin {
    private val readArray: Array<String> = readln().split(" ").toTypedArray()
    private val iterator = readArray.iterator()
    fun nextRead(): String = iterator.next()
}
infix fun <T> cin.shr(value: UltimateString<T>): cin {
    value.set(this.nextRead())
    return this
}

infix fun <T:CharSequence> cin.shr(value: KMutableProperty<T>): cin {
    value.setter.call(this.nextRead() as T)
    return this
}
