import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    while(true){
        val token = StringTokenizer(br.readLine()," ")
        var a = token.nextToken().toInt()
        var b = token.nextToken().toInt()
        if(a==0 && b==0) break
        sb.append(a+b).append('\n')
    }
    println(sb)
}