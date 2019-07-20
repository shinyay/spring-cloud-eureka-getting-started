package io.pivotal.shinyay.discovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DiscoveryServiceApplication

fun main(args: Array<String>) {
	runApplication<DiscoveryServiceApplication>(*args)
}
