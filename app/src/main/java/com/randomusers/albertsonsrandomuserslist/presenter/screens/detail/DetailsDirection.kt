package com.randomusers.albertsonsrandomuserslist.presenter.screens.detail

import android.util.Log
import com.randomusers.albertsonsrandomuserslist.utils.navigation.AppNavigator
import javax.inject.Inject

interface DetailsDirection {

    suspend fun moveToMain()
}

class DetailsDirectionImpl @Inject constructor(
    private val appNavigator: AppNavigator
): DetailsDirection{
    override suspend fun moveToMain() {
        Log.d("TTT", "moveToMain: worked")
        appNavigator.back()
    }

}