package com.example.olaf.blogtutorial

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class BlogTutorialApplication

fun main(args: Array<String>) {
    runApplication<BlogTutorialApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
