import kotlin.system.measureTimeMillis

fun main() {
    val t = measureTimeMillis {
        var a = 0
        var b = 0
        var d = 0
        while ((b * d + 5 * d * 10 + a * d * 100) < 8631) {
            when {
                d < 9 -> {
                    d++
                }

                b < 9 -> {
                    d = 0
                    b++
                }

                a < 9 -> {
                    d = 0
                    b = 0
                    a++
                }
            }

            val Ans_20EF = (b * d + 5 * d * 10 + a * d * 100)
            if (Ans_20EF - (Ans_20EF % 100) == 2000) {
                val abd = listOf(a, b, d)
                val A5B = abd[0] * 100 + 50 + abd[1]
                var c = 0
                while (c <= 9) {
                    val GHIJ = A5B * c
                    val Ans_2012K = Ans_20EF + GHIJ * 10
                    if (Ans_2012K - (Ans_2012K % 10) == 20120) {
                        println(
                            """
            A:${abd[0]}
            B:${abd[1]}
            C:$c
            D:${abd[2]}
            E:${Ans_20EF.toString()[2]}
            F:${Ans_20EF.toString()[3]}
            G:${GHIJ.toString()[0]}
            H:${GHIJ.toString()[1]}
            I:${GHIJ.toString()[2]}
            J:${GHIJ.toString()[3]}
        """.trimIndent()
                        )
                    }
                    c++
                }
            }
        }

    }
    println(t)
}
