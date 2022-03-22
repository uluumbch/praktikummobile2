import java.util.*

fun main() {
val input = Scanner(System.`in`)
    print("Nilai x = ")
    var x = input.nextInt()
    println(rumus(x))
}

fun rumus(x: Int): Int{
    return 2*(Math.pow(x.toDouble(),2.0).toInt())+(5*x) - 8
}