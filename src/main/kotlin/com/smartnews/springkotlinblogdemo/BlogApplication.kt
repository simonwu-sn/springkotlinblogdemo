package com.smartnews.springkotlinblogdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class BlogApplication {
    // ...
}