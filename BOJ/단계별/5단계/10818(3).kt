import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val array = IntArray(n)
    for (i in 0 until n){
        array[i] = sc.nextInt()
    }
    print("${min(array)} ${max(array)}")
}
fun min(array : IntArray) : Int{
    var min = array[0]
    for(i in array.indices){
        if(min > array[i]){
            min = array[i]
        }
    }
    return min
}
fun max(array : IntArray) : Int{
    var max = array[0]
    for(i in array.indices){
        if(max < array[i]){
            max = array[i]
        }
    }
    return max
}