import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    val list = ArrayList<Int>(n)

    for (i in 0..n-1) {
        val a = sc.nextInt()
        list.add(a)
    }

    print("${list.minOrNull()} ${list.maxOrNull()}")
}