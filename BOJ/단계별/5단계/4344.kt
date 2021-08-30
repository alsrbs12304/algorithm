import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val c = sc.nextInt()

    val results = StringBuffer()

    for(i in 0 until c){
        val n = sc.nextInt()
        val scores = mutableListOf<Int>()
        var sum = 0
        for(j in 0 until n){
            val score = sc.nextInt()
            sum += score
            scores.add(score)
        }
        val avg = sum / n
        var cnt = 0
        for(j in 0 until n){
            if(scores[j] > avg){
                cnt++
            }
        }
        val result = String.format("%.3f", cnt.toDouble()/n * 100)
        results.append("$result%\n")
    }
    print(results.toString())
}