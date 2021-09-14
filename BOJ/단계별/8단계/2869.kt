import java.io.InputStreamReader
import java.io.BufferedReader
import java.util.*
 
fun main(args: Array<String>) {
    var usrBufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var usrStringTokenizer = StringTokenizer(usrBufferedReader.readLine())
 
    val ascend = usrStringTokenizer.nextToken().toInt()
    val distancePerDay = ascend - usrStringTokenizer.nextToken().toInt()
    var distanceRemain = (usrStringTokenizer.nextToken().toInt() - ascend)
    var dayTakenExceptLastDays = distanceRemain / distancePerDay
 
    if (distanceRemain % distancePerDay == 0) {
        println(dayTakenExceptLastDays + 1)
    } else {
        println(dayTakenExceptLastDays + 2)
    }
}
