package com.tr4n.preunittest1.viewModel

import com.tr4n.preunittest1.repository.NumberRepository
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert
import org.junit.Test

class HomeViewModelTest {
    private val repository = mockk<NumberRepository>()
    private val viewModel = HomeViewModel()

    @Test
    fun `isTheSameMaxValue should return true if 2 max value of 2 lists equal`() {
        every {
            repository.getMax(listOf(1, 3, 5))
        } returns 5
        every {
            repository.getMax(listOf(2, 5))
        } returns 5
        val expected = true
        val actual = viewModel.isTheSameMaxValue(listOf(1, 3, 5), listOf(2, 5))
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `isTheSameMaxValue should return false if 2 max value of 2 lists not equal`() {
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
