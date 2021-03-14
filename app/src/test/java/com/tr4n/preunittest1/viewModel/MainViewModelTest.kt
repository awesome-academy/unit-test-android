package com.tr4n.preunittest1.viewModel

import com.tr4n.preunittest1.repository.Repository
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert
import org.junit.Test

class MainViewModelTest {
    private val repository = mockk<Repository>()
    private val mViewModel = MainViewModel(repository)

    @Test
    fun `return true if max value of two list is the same`() {
        every { repository.getMax(listOf(1, 3)) } returns 3
        every { repository.getMax(listOf(1, 2, 3)) } returns 3
        val expected = true
        val actual = mViewModel.isTheSameMaxValue(listOf(1, 3), listOf(1, 2, 3))
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `return false if max value of two list is not same`() {
        every { repository.getMax(listOf(1, 2)) } returns 2
        every { repository.getMax(listOf(1, 2, 3)) } returns 3
        val expected = false
        val actual = mViewModel.isTheSameMaxValue(listOf(1, 2 ,3), listOf(1, 2))
        Assert.assertEquals(expected, actual)
    }
}