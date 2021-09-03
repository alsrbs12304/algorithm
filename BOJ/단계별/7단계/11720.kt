import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var arr = br.readLine()
    var sum = 0

    for (i in 0 until n){
        sum += (arr[i]-'0')
    }
    println("${sum}")
}