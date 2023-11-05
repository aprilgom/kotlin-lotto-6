package lotto

import lotto.Constants.LOTTO_COUNT

class Lotto(private val numbers: List<Int>) {

    private val numbersSet = numbers.toSet()
    init {
        require(numbers.size == LOTTO_COUNT)
        require(numbersSet.size == LOTTO_COUNT)
    }
    private fun sorted() = numbers.sorted()
    override fun toString(): String {
        return sorted().joinToString(", ", "[", "]")
    }
    companion object {
        fun getHowMuchNumbersIntersect(a: Lotto, b: Lotto): Int {
            val aSet = a.numbersSet
            val bSet = b.numbersSet
            return (aSet intersect bSet).size
        }
    }
}
