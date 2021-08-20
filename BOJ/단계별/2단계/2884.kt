import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    var h = sc.nextInt()
    var m = sc.nextInt()
    
    if(m < 45){
        h--
        m = 60 - (45-m)
        if(h<0){
            h = 23
        }
        println("${h} ${m}")
    }else {
        m = m - 45
        println("${h} ${m}")
    }
}