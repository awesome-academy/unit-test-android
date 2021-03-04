package com.tr4n.preunittest1.viewModel

import com.tr4n.preunittest1.viewModel.HomeViewModel
import org.junit.Assert
import org.junit.Test

class HomeViewModelTest {

    private val viewModel = HomeViewModel()

    @Test
    fun isTheSameMaxValue() {
        val actual = true
        val expected = viewModel.isTheSameMaxValue(
            firstList = listOf(1, 5, 2),
            secondList = listOf(2, 5)
        )
        Assert.assertEquals(expected, actual)
    }
}