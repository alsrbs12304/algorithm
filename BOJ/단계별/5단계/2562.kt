import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    val list = ArrayList<Int>()
    var maxCnt = 0
    var maxNum = 0
    // 0 ~ 9까지 반복(9번)
    for(i in 0 until 9){
        val n = sc.nextInt()
        list.add(n)
        if(maxNum < list[i]){
            maxNum = list[i]
            maxCnt = i
        }
    }
    println("$maxNum")
    println("${maxCnt + 1}")
}