package com.tr4n.preunittest1.viewModel

import com.tr4n.preunittest1.repository.Repository
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test

class FavoriteViewModelTest {

    private val repository = mockk<Repository>()

    private val viewModel = FavoriteViewModel(repository)

    @Test
    fun isTheSameMaxValue() {
        every {
            repository.getMax(listOf(1, 5, 2))
        } returns 5
        every {
            repository.getMax(listOf(2, 5))
        } returns 5

        val actual = true
        val expected = viewModel.isTheSameMaxValue(
            firstList = listOf(1, 5, 2),
            secondList = listOf(2, 5)
        )
        assertEquals(expected, actual)
    }
}