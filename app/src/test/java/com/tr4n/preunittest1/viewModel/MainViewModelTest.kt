package com.tr4n.preunittest1.viewModel

import com.tr4n.preunittest1.repository.Repository
import io.mockk.every
import io.mockk.mockk
import org.junit.Test

import org.junit.Assert.*

class MainViewModelTest {
    private val repository = mockk<Repository>()
    private val viewModel = MainViewModel(repository)

    @Test
    fun `return true if 2 max value of 2 lists equal`() {
        every {
            repository.getMax(listOf(3, 1, 8))
        } returns 8
        every {
            repository.getMax(listOf(1, 5, 8))
        } returns 8
        val expected = true
        val actual = viewModel.isTheSameMaxValue(listOf(3, 1, 8), listOf(1, 5, 8))
        assertEquals(expected, actual)
    }

    @Test
    fun `return false if 2 max value of 2 lists not equal`() {
        every {
            repository.getMax(listOf(10, 1))
        } returns 10
        every {
            repository.getMax(listOf(2, 8))
        } returns 8
        val expected = false
        val actual = viewModel.isTheSameMaxValue(listOf(10, 1), listOf(2, 8))
        assertEquals(expected, actual)
    }
}
