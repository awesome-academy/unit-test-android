package com.tr4n.preunittest1.repository

interface Repository {

    fun getMax(numbers: List<Int>): Int?

    fun getMax(first: Int, second: Int): Int
}
