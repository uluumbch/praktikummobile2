import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    print("Input bilangan: ")
    var angka = input.nextInt()
    var hasil = 0
    var ulang = 1
    while (ulang <= 5) {
        hasil += angka
        if (hasil % 2 == 0 || hasil % 3 == 0) {
            print("$hasil ")
            ulang++
        }

    }
}

