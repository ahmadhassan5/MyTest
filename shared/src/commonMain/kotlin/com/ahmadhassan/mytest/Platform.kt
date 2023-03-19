package com.ahmadhassan.mytest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform