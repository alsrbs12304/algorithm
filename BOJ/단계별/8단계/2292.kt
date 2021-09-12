import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine().toInt()
    var cnt = 1 // 겹 수
    var roomNumbers = 1
    
    if(n == 1){
        println(1)
    }else{
        while(roomNumbers < n){
            roomNumbers += (cnt * 6)
            cnt++
        }
        println(cnt)
    }
}