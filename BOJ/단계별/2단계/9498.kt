import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    val score = sc.nextInt()
    
    print(
        when{
            score >= 90 -> "A"
            score >= 80 -> "B"
            score >= 70 -> "C"
            score >= 60 -> "D"
            else -> "F"
        }
    )
}