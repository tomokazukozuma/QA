package com.qaservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class QaserviceApplication

fun main(args: Array<String>) {
    SpringApplication.run(QaserviceApplication::class.java, *args)
}
