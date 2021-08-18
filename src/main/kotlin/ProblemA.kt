class ProblemA {

    fun main() {
        val t = readInt()

        for (i in 1..t) {
            val arr = readLongArray(3)
            if (arr[2] % 2 == 0L) {
                val result = (arr[0] - arr[1]) * arr[2] / 2
                println(result)
            } else {
                val result = arr[0] * (arr[2] + 1) / 2 - arr[1] * (arr[2] - 1) / 2
                println(result)
            }
        }
    }

}