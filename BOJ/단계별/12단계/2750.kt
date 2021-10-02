import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val list = mutableListOf<Int>()

    repeat(n) {
        list.add(readLine().toInt())
    }

    list.sorted()
        .forEach { println(it) }
}