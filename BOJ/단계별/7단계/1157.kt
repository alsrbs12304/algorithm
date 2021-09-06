import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine()
    var map = mutableMapOf<Char,Int>()

    str.forEach {
        val char = it.lowercaseChar()

        if(map.containsKey(char)){
            map[char] = map[char]!!.plus(1)
        }else{
            map.set(char,1)
        }
    }
    val max = map.maxByOrNull { it.value }

    if(map.filter { it.value == max!!.value }.count() > 1){
        print("?")
    }
    else{ 
        print(max!!.key.uppercase())
    }
}