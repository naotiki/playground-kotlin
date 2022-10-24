import java.math.BigDecimal

fun main() {
    println(1.1 * 1.5)
    println(BigDecimal(1.1) * BigDecimal(1.5))
    println(1.1.toBigDecimal() *1.5.toBigDecimal())
}