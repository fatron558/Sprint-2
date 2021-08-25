class ProblemA {

    fun main() {
        val t = readInt()

        for (i in 1..t) {
            val arr = readLongArray(3)
            val result = if (arr[2] % 2 == 0L) {
                (arr[0] - arr[1]) * arr[2] / 2
            } else {
                arr[0] * (arr[2] + 1) / 2 - arr[1] * (arr[2] - 1) / 2
            }
            println(result)
        }
    }

}