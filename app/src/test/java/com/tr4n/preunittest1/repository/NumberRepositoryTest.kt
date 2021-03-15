package com.tr4n.preunittest1.repository

import org.junit.Test

import org.junit.Assert.*

class NumberRepositoryTest {
    private val repository = NumberRepository()

    @Test
    fun `return second number if first number is less`() {
        val actual = 2
        val expect = repository.getMax(1,2)
        assertEquals(actual,expect)
    }
    @Test
    fun `return first number if first number is greater`() {
        val actual = 3
        val expect = repository.getMax(3,2)
        assertEquals(actual,expect)
    }

    @Test
    fun `list is empty return null`() {
        val actual = null
        val expectation =  repository.getMax(emptyList())
        assertEquals(actual,expectation)
    }
    @Test
    fun `list is not empty return max number in list`() {
        val list = listOf(1,10)
        val actual = 10
        val expectation =  repository.getMax(list)
        assertEquals(actual,expectation)
    }
}
