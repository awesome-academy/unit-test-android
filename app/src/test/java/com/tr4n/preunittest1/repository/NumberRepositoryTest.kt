package com.tr4n.preunittest1.repository

import com.tr4n.preunittest1.repository.NumberRepository
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class NumberRepositoryTest {

    private val repository = NumberRepository()

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun `should get last number if pass increased array`() {
        val expected = 5
        val actual = repository.getMax(listOf(1, 2, 3, 4, 5))
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `should get first number if decreased array`() {
        val expected = 5
        val actual = repository.getMax(listOf(5, 4, 3, 2, 1))
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `should get null if empty array`() {
        val expected = null
        val actual = repository.getMax(emptyList())
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `should get first if first number less than second number`() {
        val expected = 3
        val actual = repository.getMax(2, 3)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `should get second if first number less than second number`() {
        val expected = 3
        val actual = repository.getMax(2, 3)
        Assert.assertEquals(expected, actual)
    }
}
