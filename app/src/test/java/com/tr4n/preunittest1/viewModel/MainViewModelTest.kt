package com.tr4n.preunittest1.viewModel

import com.tr4n.preunittest1.repository.MockNumberRepository
import org.junit.Assert
import org.junit.Test

class MainViewModelTest {

    private val repository = MockNumberRepository()
    private val viewModel = MainViewModel(repository)

    @Test
    fun isTheSameMaxValue() {
        val actual = true
        val expected = viewModel.isTheSameMaxValue(
            firstList = listOf(2, 5, 3),
            secondList = listOf(2, 5)
        )
        Assert.assertEquals(expected, actual)
    }
}
