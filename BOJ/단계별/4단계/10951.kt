import java.io.*
import java.util.*
fun main()= with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var str : String?
    while(readLine().also{str = it} != null){
        val token = StringTokenizer(str)
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        bw.write("${a+b}\n")
    }
    bw.flush()
    bw.close()
}