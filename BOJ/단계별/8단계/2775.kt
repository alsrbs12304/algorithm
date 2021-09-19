import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader((System.`in`)))
    val n = br.readLine().toInt()

    var arr = Array<Array<Int>>(15){Array<Int>(15){i-> 1} }

    for(i in 0..14){
        arr[0][i] = i
    }
    for(i in 1..14){
        for(j in 2..14) {
            arr[i][j] = arr[i][j-1] + arr[i-1][j]
        }
    }

    for(i in 1..n){
        val k = br.readLine().toInt()
        val n = br.readLine().toInt()

        println("${arr[k][n]}")
    }
}