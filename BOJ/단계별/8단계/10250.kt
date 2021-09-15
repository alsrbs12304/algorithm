import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    val n = br.readLine().toInt()

    for(i in 1..n){
        val token = StringTokenizer(br.readLine())
        
        val floor = token.nextToken().toInt()
        var room = token.nextToken().toInt()
        val order = token.nextToken().toInt()

        if(order % floor == 0 ){
            println("${floor*100+order/floor}")
        }else{
            println("${order%floor*100 + (order/floor+1)}")
        }

    }
}