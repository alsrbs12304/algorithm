import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*
fun main() {
      val br = BufferedReader(InputStreamReader(System.`in`))
      val input: Int = br.readLine().toInt()
      val fibonacci = IntArray(input + 1)

      for (i in fibonacci.indices) {
          when (i) {
              0 -> fibonacci[0] = 0
              1 -> fibonacci[1] = 1
              else -> fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
          }
      }
      print(fibonacci[input])
}