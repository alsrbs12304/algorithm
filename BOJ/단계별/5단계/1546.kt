import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val token = StringTokenizer(br.readLine()," ")
    var max = 0
    var sum = 0.0
    for(i in 0 until n){
        val score = token.nextToken().toInt()
        if(score > max){
            max = score
        }
        sum+=score
    }
    println("${(sum/max*100.0)/n}")
}