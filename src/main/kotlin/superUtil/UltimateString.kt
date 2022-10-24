package superUtil

class UltimateString<T>(var value: T, private val mapper: (String.() -> T)? = null) : CharSequence {

    private var string: String = ""
    internal fun set(charSequence: CharSequence) {
        string = charSequence as String
        value = mapper?.let { string.it() } ?: string as T
    }

    operator fun plus(other: Any?): String {
        return string + other
    }

    override val length: Int = string.length
    override fun get(index: Int): Char {
        return string[index]
    }

    override fun subSequence(startIndex: Int, endIndex: Int): CharSequence {
        return string.subSequence(startIndex, endIndex)
    }

    override fun toString(): String {
        return string
    }

    fun get() = value
}

operator fun String.invoke(): us {
    return us(this)
}

operator fun <T> T.invoke(mapper: (String.() -> T)? = null): UltimateString<T> {
    return UltimateString(this, mapper)
}
//Ultimate Stringの略
typealias us = sus<String>
//Super Ultimate String
typealias sus<T> = UltimateString<T>

