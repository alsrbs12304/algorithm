import java.io.*
import java.util.*
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val n = br.readLine().toInt()
    val list = ArrayList<Int>(n)
    StringTokenizer(br.readLine()).run{
        for(i in 0..n-1){
            list.add(nextToken().toInt())
        }
    }
    bw.write("${list.minOrNull()} ${list.maxOrNull()}")
    bw.flush()
    bw.close()
    br.close()
}