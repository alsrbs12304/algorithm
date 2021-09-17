import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    val token = StringTokenizer(br.readLine())
    val a= token.nextToken().toBigDecimal() // toInt() 하면 오류남
    val b = token.nextToken().toBigDecimal()
    println(a+b)
}