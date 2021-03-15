package com.tr4n.preunittest1.viewModel

import com.tr4n.preunittest1.repository.NumberRepository
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class HomeViewModelTest {
    private val repository = mockk<NumberRepository>()
    private val viewModel = HomeViewModel()

    @Test
    fun `return true if 2 max value of 2 lists equal`() {
        every {
            repository.getMax(listOf(2, 3, 15))
        } returns 15
        every {
            repository.getMax(listOf(10, 5, 15))
        } returns 15
        val expected = true
        val actual = viewModel.isTheSameMaxValue(listOf(2, 3, 15), listOf(10, 5, 15))
        assertEquals(expected, actual)
    }

    @Test
    fun `return false if 2 max value of 2 lists not equal`() {
        every {
            repository.getMax(listOf(1, 3))
        } returns 3
        every {
            repository.getMax(listOf(2, 5))
        } returns 5
        val expected = false
        val actual = viewModel.isTheSameMaxValue(listOf(1, 3), listOf(2, 5))
        Assert.assertEquals(expected, actual)
    }
}
