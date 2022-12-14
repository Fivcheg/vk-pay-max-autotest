import org.junit.Test

import org.junit.Assert.*

class MainKtTest {
    @Test
    fun mainTotalCommissonMax(){
        val amount = 770000000
        val cardType = "VK Pay"
        val commission = 0.0
        val calculateCommission = amount * commission / 10000
        val result = calculateTotalCommisson(cardType, commission, amount)
        assertEquals(calculateCommission, result)
    }
    fun mainTotalCommissonMaxCommission(){
        val amount = 770000000
        val cardType = "MasterCard"
        val commission = 5.0
        val calculateCommission = amount * commission / 10000
        val result = calculateTotalCommisson(cardType, commission, amount)
        assertEquals(calculateCommission, result)
    }
    @Test
    fun mainTotalCommissonMin(){
        val amount = 7700000
        val cardType = "Visa"
        val commission = 0.0
        val result = calculateTotalCommisson(cardType, commission, amount)
        assertEquals(35, result)
    }
    @Test
    fun userTypeCardDiscountMaestroMax() {
        val amount = 7700000
        val lastAmount = 2000
        val cardType = "Maestro"
        val result = userTypeCardDiscount (cardType, amount, lastAmount)
        assertEquals(0.6, result, 0.1)
    }
    @Test
    fun userTypeCardDiscountMaestroMin() {
        val amount = 800
        val lastAmount = 100
        val cardType = "Maestro"
        val result = userTypeCardDiscount (cardType, amount, lastAmount)
        assertEquals(0.0, result, 0.1)
    }
    @Test
    fun userTypeCardDiscountMasterCardMax() {
        val amount = 7700000
        val lastAmount = 2000
        val cardType = "MasterCard"
        val result = userTypeCardDiscount (cardType, amount, lastAmount)
        assertEquals(0.6, result, 0.1)
    }
    @Test
    fun userTypeCardDiscountMasterCardMin() {
        val amount = 800
        val lastAmount = 100
        val cardType = "MasterCard"
        val result = userTypeCardDiscount (cardType, amount, lastAmount)
        assertEquals(0.0, result, 0.1)
    }
    @Test
    fun userTypeCardDiscountVisaMax() {
        val amount = 8000000
        val lastAmount = 200
        val cardType = "Visa"
        val result = userTypeCardDiscount (cardType, amount, lastAmount)
        assertEquals(0.75, result, 0.1)
    }
    @Test
    fun userTypeCardDiscountVisaMin() {
        val amount = 800
        val lastAmount = 100
        val cardType = "Visa"
        val result = userTypeCardDiscount (cardType, amount, lastAmount)
        assertEquals(0.0, result, 0.1)
    }

    @Test
    fun userTypeCardDiscountMirMax() {
        val amount = 8000000
        val lastAmount = 200
        val cardType = "Mir"
        val result = userTypeCardDiscount (cardType, amount, lastAmount)
        assertEquals(0.75, result, 0.1)
    }
    @Test
    fun userTypeCardDiscountMirMin() {
        val amount = 800
        val lastAmount = 100
        val cardType = "Mir"
        val result = userTypeCardDiscount (cardType, amount, lastAmount)
        assertEquals(0.0, result, 0.1)
    }
    @Test
    fun userTypeCardDiscountVkPay() {
        val amount = 800
        val lastAmount = 100
        val cardType = "VK Pay"
        val result = userTypeCardDiscount (cardType, amount, lastAmount)
        assertEquals(0.0, result, 0.1)
    }
    @Test
    fun userTypeCardDiscountElse() {
        val amount = 800
        val lastAmount = 100
        val cardType = "OK Pay"
        val result = userTypeCardDiscount (cardType, amount, lastAmount)
        assertEquals(0.0, result, 0.1)
    }
}