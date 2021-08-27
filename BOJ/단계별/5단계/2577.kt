import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    var result = a*b*c
    val arr = IntArray(10)

    while (result != 0) {
        arr[result % 10]++
        result /= 10
    }

    for (i in arr.indices) {
        println(arr[i])
    }
}