package com.infnet.producer;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infnet.domain.entity.ItemEstoque;

@Component
public class AlmoxarifadoProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public void sendWarning(ItemEstoque itemEstoque) throws JsonProcessingException, AmqpException {
        amqpTemplate.convertAndSend("novo-pedido-exchange", "novo-pedido", objectMapper.writeValueAsString(itemEstoque));
    }

}
