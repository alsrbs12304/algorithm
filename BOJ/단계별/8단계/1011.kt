import java.io.*
import java.util.*
import kotlin.math.round
import kotlin.math.sqrt

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    // val bw = BufferedWriter(OutputStreamWriter((System.out)))
    val n = br.readLine().toInt()

    for(i in 1..n){
        val token = StringTokenizer(br.readLine())
        val x = token.nextToken().toInt()
        val y = token.nextToken().toInt()
        var distance = y-x
        var zeGop = sqrt(distance.toDouble())
        var roundUp = round(zeGop)
        
        /*
        when{
            distance <= 3 -> bw.write("$distance")
            zeGop > roundUp -> bw.write("${roundUp.toInt()*2}\n")
            zeGop <= roundUp -> bw.write("${roundUp.toInt()*2-1}\n")
        }
        bw.flush()
        */
        if(distance <= 3){
            println("${distance}")
        }else if(zeGop > roundUp){
            println("${roundUp.toInt()*2}")
        }else{
            println("${roundUp.toInt()*2-1}")
        }
    }
    br.close()
    //bw.close()
}