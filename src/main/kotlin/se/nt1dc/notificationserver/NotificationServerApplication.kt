package se.nt1dc.notificationserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class NotificationServerApplication

fun main(args: Array<String>) {
	runApplication<NotificationServerApplication>(*args)
}
