class ProblemD {

    fun main() {
        val t = readInt()

        for (n in 1..t) {
            var price = 0L
            val allClients = readInt()
            val money = readLongArray(allClients)
            money.sort()
            var client = 0

            for (i in money) {
                val newPrice = i * (allClients - client)
                client++
                if (newPrice > price) {
                    price = newPrice
                }
            }
            println(price)
        }
    }

}