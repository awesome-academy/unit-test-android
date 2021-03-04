package com.tr4n.preunittest1.repository

class NumberRepository : Repository {

    override fun getMax(numbers: List<Int>): Int? {
        if (numbers.isEmpty()) return null
        var max = numbers[0]
        for (number in numbers) {
            if (number > max) {
                max = number
            }
        }
        return max
    }

    override fun getMax(first: Int, second: Int): Int {
        if (first > second) return first
        return second
    }
}