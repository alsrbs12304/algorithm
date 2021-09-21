import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

  fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
      val sb = StringBuilder()
      val st = StringTokenizer(readLine(), " ")
      val N = st.nextToken().toInt()
      val M = st.nextToken().toInt()

      val prime = BooleanArray(M + 1)

      for (i in 2..M) {
          if (prime[i]) continue
          if (i >= N) sb.append(i).append('\n')

          var j = i + i
          while (j <= M) {
              prime[j] = true
              j += i
          }
      }
      println(sb)
  }