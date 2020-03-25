package com.example.olaf.blogtutorial

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConiguration {
    @Bean
    fun databaseInitializer(userRepository: UserRepository, articleRepository: ArticleRepository) =
        ApplicationRunner {
            val gaonasi = userRepository.save(User("gaonasi", "jow", "Hong"))
            articleRepository.save(Article(
                title = "IU Concert",
                headline = "Uaena notice",
                content = "Concert is at the end of year",
                author = gaonasi
            ))
            articleRepository.save(Article(
                title = "when is complete tut",
                headline = "Socar olaf",
                content = "tutorial is loooong",
                author = gaonasi
            ))
        }
}
