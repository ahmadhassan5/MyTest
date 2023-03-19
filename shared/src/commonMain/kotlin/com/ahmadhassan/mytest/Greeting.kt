package com.ahmadhassan.mytest

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}

@Composable
internal fun App(){
    Text(Greeting().greet())
}