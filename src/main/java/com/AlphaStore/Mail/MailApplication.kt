package com.AlphaStore.Mail

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableDiscoveryClient
@EnableAsync
class MailApplication

fun main(args: Array<String>) {
    SpringApplication.run(MailApplication::class.java, *args)
}
