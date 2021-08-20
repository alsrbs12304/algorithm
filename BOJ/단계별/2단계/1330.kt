import java.util.*
fun main(){
	val sc:Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
//    var a = readLine()!!.toInt()
//    var b = readLine()!!.toInt()
    
    if(a>b) println(">")
    else if(a<b) println("<")
    else println("==")
}