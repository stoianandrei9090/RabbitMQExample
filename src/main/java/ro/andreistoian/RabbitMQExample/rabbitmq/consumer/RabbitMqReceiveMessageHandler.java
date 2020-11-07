package ro.andreistoian.RabbitMQExample.rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMqReceiveMessageHandler {

    public void handleMessage(String message) {

        log.info(message);

    }

}
