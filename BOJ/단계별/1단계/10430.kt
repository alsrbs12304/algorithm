fun main(){
    var input = readLine()!!.split(' ')
    var A = input[0].toInt() 
    var B = input[1].toInt() 
    var C = input[2].toInt()
    
    println((A+B)%C)
    println(((A%C) + (B%C))%C)
    println((A*B)%C)
    println(((A%C)*(B%C))%C)
}