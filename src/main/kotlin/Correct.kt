


class SpecialScope{
    fun build(block: SpecialScope.()->Unit){
        block()
    }
    operator fun minus(b:SpecialScope):SpecialScope{
         return b
     }
    operator fun dec():SpecialScope{
        return this
    }
}

fun entry(){
    SpecialScope().build {
    }
}