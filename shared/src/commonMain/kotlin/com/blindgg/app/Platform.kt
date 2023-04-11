package com.blindgg.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform