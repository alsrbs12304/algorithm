import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main()= with(BufferedReader(InputStreamReader(System.`in`))) {
    StringTokenizer(readLine()).run { print(this.countTokens()) }
}
