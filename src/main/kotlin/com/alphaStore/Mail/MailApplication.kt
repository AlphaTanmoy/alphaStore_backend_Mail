package com.alphaStore.Mail

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableDiscoveryClient
@EnableAsync
class MailApplication

fun main(args: Array<String>) {
	runApplication<MailApplication>(*args)
}
