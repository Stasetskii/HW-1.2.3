fun main() {
    val musicFun = true
    val purchaseAmount = 2000000
    val funDiscount = 1
    val fixDiscount = 10000
    val percentDiscount = 5
    val fixDiscountStart = 100000
    val percentDiscountStart = 1000000
    val itemPrice = 50000
    val result = if (purchaseAmount > percentDiscountStart) {
        itemPrice - itemPrice * percentDiscount / 100
    } else if (purchaseAmount > fixDiscountStart) {
        itemPrice - fixDiscount
    } else itemPrice
    val cost = if (musicFun) {
        result - result * funDiscount / 100
    } else {
        result
    }
    print(cost / 100)
    print(" Руб. ")
    print(cost % 100)
    print(" Коп.")

}