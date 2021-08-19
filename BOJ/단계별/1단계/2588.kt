import java.util.*
fun main() = with(Scanner(System.`in`)){
    val a = nextInt()
    val b = nextInt()
    
    println(a*(b%10))
    println(a*(b%100/10))
    println(a*(b/100))
    println(a*b)
}
