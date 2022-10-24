package superUtil

object cout {
    fun add(charSequence: CharSequence) {
        print(charSequence)
    }
    fun add(value: Any?) {
        print(value)
    }
    const val endl = "\n"
}
infix fun cout.shl(charSequence: CharSequence): cout {
    add(charSequence)
    return this
}
infix fun cout.shl(value: Any?): cout {
    add(value)
    return this
}