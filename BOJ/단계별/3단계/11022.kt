import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    
    for (i in 1..n){
        val token = StringTokenizer(br.readLine()," ")
        val a = (Integer.parseInt(token.nextToken()))
        val b = (Integer.parseInt(token.nextToken()))
        bw.write("Case #${i}: ${a} + ${b} = ${a+b}\n")
    }
    br.close()
    bw.flush()
    bw.close()
}