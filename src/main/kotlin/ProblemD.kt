class ProblemD {

    fun main() {
        val t = readInt()

        for (n in 1..t) {
            var price = 0L
            val client = readInt()
            val money = readLongArray(client)
            money.sort()
            var n = 0

            for (i in money) {
                val newPrice = i * (client - n)
                n++
                if (newPrice > price) {
                    price = newPrice.toLong()
                }
            }
            println(price)
        }
    }

}