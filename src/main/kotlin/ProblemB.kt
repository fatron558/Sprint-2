class ProblemB {

    fun main() {
        val t = readInt()

        for (n in 1..t) {
            val arr = readIntArray(2)
            var result = ""
            var j = 0
            for (i in 0 until arr[0]) {
                result += (j + 97).toChar()
                j++
                if (j == arr[1]) {
                    j = 0
                }
            }
            println(result)
        }
    }

}