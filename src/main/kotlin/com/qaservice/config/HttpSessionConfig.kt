package com.qaservice.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory
import org.springframework.session.data.redis.config.ConfigureRedisAction
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

@Configuration
@ConfigurationProperties(prefix = "redis")
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400)
class HttpSessionConfig {

    var host: String = ""

    var port: Int = 0

    @Bean
    fun connectionFactory(): JedisConnectionFactory {
        val factory = JedisConnectionFactory()
        factory.hostName = host
        factory.port = port
        return factory
    }

    @Bean
    fun configureRedisAction(): ConfigureRedisAction {
        return ConfigureRedisAction.NO_OP;
    }
}