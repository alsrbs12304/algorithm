// 윤년이면 1 아니면 0
// 윤년은 4의 배수이면서, 100의 배수가 아닐 때 or 400의 배수
import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    var year = sc.nextInt()
    
    if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) println("1")
    else println("0")
}