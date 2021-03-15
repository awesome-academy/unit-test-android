package com.tr4n.preunittest1.viewModel

import com.tr4n.preunittest1.repository.Repository
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.*
import org.junit.Test

class FavoriteViewModelTest {
    private val repo = mockk<Repository>()
    private val viewModel = FavoriteViewModel(repo)

    @Test
    fun `return true if max value of two lists is equal`() {
        every { repo.getMax(listOf(1, 3, 5)) } returns 5
        every { repo.getMax(listOf(2, 5, 4)) } returns 5
        val actual = true
        val expect = viewModel.isTheSameMaxValue(listOf(1, 3, 5), listOf(2, 5, 4))
        assertEquals(expect, actual)
    }

    @Test
    fun `return false if max value of two lists is different`() {
        every { repo.getMax(listOf(7, 3, 2)) } returns 7
        every { repo.getMax(listOf(1, 6, 10)) } returns 10
        val actual = false
        val expect = viewModel.isTheSameMaxValue(listOf(7, 3, 2), listOf(1, 6, 10))
        assertEquals(expect, actual)
    }
}
