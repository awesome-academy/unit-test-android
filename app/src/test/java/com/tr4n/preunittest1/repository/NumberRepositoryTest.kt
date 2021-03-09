package com.tr4n.preunittest1.repository

import org.junit.Test

import org.junit.Assert.*

class NumberRepositoryTest {
    private val repository = NumberRepository()

    @Test
    fun `getMax should return first number if greater than second number`() {
        val expected = 2
        val actual = repository.getMax(2, 1)
        assertEquals(expected, actual)
    }

    @Test
    fun `getMax should return second number if greater than first number`() {
        val expected = 2
        val actual = repository.getMax(1, 2)
        assertEquals(expected, actual)
    }

    @Test
    fun `getMax should return null if list is empty`() {
        val list = listOf<Int>()
        val expected = null
        val actual = repository.getMax(list)
        assertEquals(expected, actual)
    }

    @Test
    fun `getMax should return max number of list if list is not empty`() {
        val list = listOf(1,5)
        val expected = 5
        val actual = repository.getMax(list)
        assertEquals(expected, actual)
    }
}
