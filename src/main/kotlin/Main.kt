fun main() {
    val amount = 8000000
    val lastAmount = 5000
    val cardType = "VK Pay"
    val commission: Double = userTypeCardDiscount(cardType, amount, lastAmount)
    val totalCommisson = calculateTotalCommisson(cardType, commission, amount)
    println("$totalCommisson  рублей составляет комиссия")
}
fun userTypeCardDiscount (cardType: String, amount: Int, lastAmount: Int): Double{
    val resultDiscount: Double = when (cardType){
        "Maestro" -> if (amount < 7500000 - lastAmount){0.0} else {0.6}
        "MasterCard" -> if (amount < 7500000 - lastAmount){0.0} else {0.6}
        "Visa" -> if ((amount / 100 * 0.75) < 3500){0.0} else {0.75}
        "Mir" -> if ((amount / 100 * 0.75) < 3500){0.0} else {0.75}
        "VK Pay" -> 0.0
        else -> 0.0
    }
    return resultDiscount
}

fun calculateTotalCommisson(cardType: String, commission: Double, amount: Int): Number {
    return if (cardType == "Visa" && commission == 0.0 || cardType == "Mir" && commission == 0.0) {
        35
    } else {
        amount * commission / 10000
    }
}

