package se.nt1dc.notificationserver

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import se.nt1dc.avro.users.NewUsersInfo


@Component
class KafkaMsgConsumer {
    @KafkaListener(id = "consumer1", topics = ["new-users-info-topic"])
    fun listen(orderValue: ConsumerRecord<String, NewUsersInfo>) {
        val ord: NewUsersInfo = orderValue.value()
        println(ord.toString())
    }

}