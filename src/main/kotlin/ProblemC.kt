class ProblemC {

    fun main() {
        val t = readInt()
        val arr = readIntArray(t)
        var result = 0

        arr.sort()

        for (i in 0..t - 1 step 2) {
            if (arr[i] != arr[i + 1]) {
                result += arr[i + 1] - arr[i]
            }
        }
        println(result)
    }
}