import java.util.*
import kotlin.system.exitProcess

fun main() {
    val input = Scanner(System.`in`)
    print("Waktu sekarang: ")
    var waktu = input.nextLine().lowercase()
    if (!(waktu in arrayOf("pagi","siang","sore","malam"))){
        println("Anda memasukkan format waktu yang salah, silakan coba lagi!!!")
        exitProcess(1)
    }
    println("")
    print("Nama anda: ")
    var nama = input.nextLine()
    println("")
    print("Umur anda : ")
    var umur: Int = input.nextInt()
    println("")
    print("Suhu tubuh anda: ")
    var suhu = input.nextFloat()
    println("")

    println("Selamat $waktu $nama.")
    println("Umur Anda : $umur")
    println("Suhu tubuh anda $suhu derajat celcius")
}