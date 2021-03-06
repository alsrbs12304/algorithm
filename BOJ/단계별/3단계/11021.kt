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
        bw.write("Case #${i}: ${(token.nextToken().toInt()+token.nextToken().toInt())}\n")
    }
    br.close()
    bw.flush()
    bw.close()
}