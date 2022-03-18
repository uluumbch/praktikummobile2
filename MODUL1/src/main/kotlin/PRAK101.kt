import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    print("Waktu sekarang: ")
    var waktu = input.next()
    println("")
    print("Nama anda: ")
    var nama = input.next()
    println("")
    print("Umur anda")
    var umur = input.nextInt()
    println("")
    print("Suhu tubuh anda: ")
    var suhu = input.nextFloat()
    println("")

    println("Selamat $waktu $nama.")
    println("Umur Anda : $umur")
    println("Suhu tubuh anda $suhu derajat celcius")
}