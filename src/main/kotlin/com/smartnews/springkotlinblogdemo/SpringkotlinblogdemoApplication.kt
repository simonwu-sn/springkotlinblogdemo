package com.smartnews.springkotlinblogdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class SpringkotlinblogdemoApplication

fun main(args: Array<String>) {
    runApplication<SpringkotlinblogdemoApplication>(*args)
}
