package com.example.olaf.blogtutorial

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.data.repository.findByIdOrNull

@DataJpaTest
class RepositoriesTests @Autowired constructor(
    val entityManager: TestEntityManager,
    val userRepository: UserRepository,
    val articleRepository: ArticleRepository
) {
    @Test
    fun `When findByIdOrNull then return Article`() {
        val olaf = User("springolaf", "Olaf", "Hong")
        entityManager.persist(olaf)
        val article = Article("Socar release 9.6.0..", "Study Spring hard...!", "IU Love poem", olaf)
        entityManager.persist(article)
        entityManager.flush()
        val found = articleRepository.findByIdOrNull(article.id!!)
        assertThat(found).isEqualTo(article)
    }

    @Test
    fun `When findByLogin then return User`() {
        val olaf = User("springolaf", "Olaf", "Hong")
        entityManager.persist(olaf)
        entityManager.flush()
        val user = userRepository.findByLogin(olaf.login)
        assertThat(user).isEqualTo(olaf)
    }
}
