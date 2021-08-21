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
        val token = StringTokenizer(br.readLine())
        val sum = token.nextToken().toInt()+token.nextToken().toInt()
        bw.write(sum.toString()+"\n");
    }
    bw.flush()
    br.close()
    bw.close()
}