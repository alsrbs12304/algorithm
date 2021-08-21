import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    
    for(i in 1..9){
        println("${n} * ${i} = ${n*i}")
    }
}