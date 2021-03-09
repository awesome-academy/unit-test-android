package com.tr4n.preunittest1.repository

import com.tr4n.preunittest1.repository.NumberRepository
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertArrayEquals as assertArrayEquals1

class NumberRepositoryTest {

    private val repository = NumberRepository()

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun `return first number if first number less than second number`() {
        val expected = 2
        val actual = repository.getMax(2, 1)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `return second if first number less than second number`() {
        val expected = 2
        val actual = repository.getMax(1, 2)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `return null if array is null`() {
        val exepcted = null
        val actual = repository.getMax(listOf())
        Assert.assertEquals(exepcted, actual)
    }

    @Test
    fun `return first number if it's greatest number`() {
        val exepcted = 3
        val actual = repository.getMax(listOf(3,1,2))
        Assert.assertEquals(exepcted, actual)
    }

    @Test
    fun `return middle or last number if it's greatest number`() {
        val excepcted = 4
        val actual = repository.getMax(listOf(1,4,2,3))
        Assert.assertEquals(excepcted, actual)
    }


}