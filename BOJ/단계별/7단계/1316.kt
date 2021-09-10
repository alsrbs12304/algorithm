fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var count = 0

    repeat(readLine().toInt()) {
        val set = mutableSetOf<Char>()
        val str = readLine()
        var prev = ' '
        var duplicated = false

        for (c in str) {
            if (prev != c) {
                if (!set.add(c)) {
                    duplicated = true
                    break
                }
            }
            prev = c
        }

        if (!duplicated) count++
    }

    println(count)
}