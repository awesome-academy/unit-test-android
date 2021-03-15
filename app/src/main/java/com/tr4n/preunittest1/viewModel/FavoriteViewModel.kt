package com.tr4n.preunittest1.viewModel

import com.tr4n.preunittest1.repository.Repository

class FavoriteViewModel(
    private val repository: Repository
) {

    fun isTheSameMaxValue(firstList: List<Int>, secondList: List<Int>): Boolean {
            val firstMax = repository.getMax(firstList)
        val secondMax = repository.getMax(secondList)

        if (firstMax == secondMax) return true

        return false
    }
}
