package com.qaservice.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter
import org.springframework.stereotype.Component
import javax.persistence.EntityManagerFactory
import javax.sql.DataSource

/**
 * MySQL Database Config
 */
@Component
@ConfigurationProperties(prefix = "spring.datasource")
@EnableJpaRepositories(
        basePackages= ["com.mercury.repository"],
        entityManagerFactoryRef="mysqlEntityManagerFactory",
        transactionManagerRef="mysqlTransactionManager"
)
class MySqlDatabaseConfig {

    @Bean("mysqlEntityManagerFactory")
    fun entityManagerFactory(dataSource: DataSource): EntityManagerFactory {
        val factory: LocalContainerEntityManagerFactoryBean = LocalContainerEntityManagerFactoryBean()
        factory.dataSource = dataSource
        factory.setPackagesToScan("com.mercury.entity.mysql")

        val vendorAdapter: HibernateJpaVendorAdapter = HibernateJpaVendorAdapter()
        factory.jpaVendorAdapter = vendorAdapter
        factory.afterPropertiesSet()

        return factory.getObject()
    }

    @Bean("mysqlTransactionManager")
    fun transactionManager(entityManagerFactory: EntityManagerFactory) : JpaTransactionManager {
        val transactionManager: JpaTransactionManager = JpaTransactionManager()
        transactionManager.entityManagerFactory = entityManagerFactory
        return transactionManager
    }
}