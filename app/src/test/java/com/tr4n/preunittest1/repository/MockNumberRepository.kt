package com.tr4n.preunittest1.repository

class MockNumberRepository : Repository {

    override fun getMax(numbers: List<Int>): Int? {
        if (numbers == listOf(2, 5, 3)) return 5
        if (numbers == listOf(2, 5)) return 5
        return 3
    }

    override fun getMax(first: Int, second: Int): Int {
        return 0
    }

}