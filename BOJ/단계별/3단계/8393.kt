fun main(){
    var n : Int = readLine()!!.toInt()
    var sum = 0
    for(i in 1..n){
        sum += i
    }
    println("${sum}")
}