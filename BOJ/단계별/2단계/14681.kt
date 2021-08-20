import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    var x = sc.nextInt()
    var y = sc.nextInt()
    
    if(x>0 && y>0) println("1")
    else if(x<0 && y>0)println("2")
    else if(x<0 && y<0)println("3")
    else if(x>0 && y<0)println("4")
}