fun main() {
    val check = BooleanArray(10001)
    for (i in 1..10000) {
        val n = d(i)
        if (n < 10001) {
            check[n] = true
        }
    }
    val sb = StringBuilder()
    for (i in 1..10000) {
        if (!check[i]) {
            sb.append(i).append('\n')
        } 
    }
    println(sb)
}

fun d(number: Int): Int {
    var number = number
    var sum = number
    while (number != 0) {
        sum = sum + number % 10
        number = number / 10
    }
    return sum
}