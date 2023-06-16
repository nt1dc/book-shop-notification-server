package se.nt1dc.notificationserver

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import se.nt1dc.avro.orders.OrderValue


@Component
class KafkaMsgConsumer {
    @KafkaListener(id = "user", topics = ["best-topic"])
    fun listen(orderValue: ConsumerRecord<String, OrderValue>) {
//        println(orderValue.value())
        val ord:OrderValue = orderValue.value()
        println(ord.toString())
    }

}