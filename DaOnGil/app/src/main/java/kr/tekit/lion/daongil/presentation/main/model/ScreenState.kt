package kr.tekit.lion.daongil.presentation.main.model

sealed class ScreenState {
    data object List : ScreenState()
    data object Map : ScreenState()
}