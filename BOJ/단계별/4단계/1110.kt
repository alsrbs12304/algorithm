import java.io.BufferedReader
import java.io.InputStreamReader
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    var n = br.readLine().toInt()
    val c = n
    var cnt = 0
    do{
        n = n % 10 * 10 + (n/10 + n%10) % 10
        cnt++
    }while(c != n)
    print(cnt)
}