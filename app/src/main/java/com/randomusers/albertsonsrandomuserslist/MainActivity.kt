package com.randomusers.albertsonsrandomuserslist

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.lifecycleScope
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import com.randomusers.albertsonsrandomuserslist.presenter.screens.main.MainScreen
import com.randomusers.albertsonsrandomuserslist.ui.theme.WeatherAppTheme
import com.randomusers.albertsonsrandomuserslist.utils.navigation.AppNavigatorHandler
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var appNavigatorHandler: AppNavigatorHandler

    @SuppressLint("FlowOperatorInvokedInComposition", "CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                Navigator(MainScreen()) { navigator ->
                    appNavigatorHandler.uiNavigator.onEach {
                        it.invoke(navigator)
                    }.launchIn(lifecycleScope)
                    CurrentScreen()
                }
            }
        }
    }
}