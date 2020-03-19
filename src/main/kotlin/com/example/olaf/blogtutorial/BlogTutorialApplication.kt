package com.example.olaf.blogtutorial

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogTutorialApplication

fun main(args: Array<String>) {
    runApplication<BlogTutorialApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
