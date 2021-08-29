import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()

    repeat(n) {
        val ox = readLine()
        var result = 0
        var count = 1

        ox.forEach {
            if (it == 'O') result += count++
            else count = 1
        }
        println(result)
    }
}