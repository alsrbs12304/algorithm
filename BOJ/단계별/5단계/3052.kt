import java.io.BufferedReader
import java.io.InputStreamReader
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    // set : 중복된 값을 갖지 않는 Collection, set안에는 고유 값을만 존재
    val list = mutableSetOf<Int>()
    for(i in 0..9){
        list.add(br.readLine().toInt() % 42)
    }
    print(list.size)
}