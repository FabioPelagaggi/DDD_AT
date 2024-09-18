package com.infnet.comsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infnet.payload.PedidoPayload;
import com.infnet.service.PedidoService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PedidoComsumer {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final PedidoService pedidoService;

    @RabbitListener(queues = { "fila.envio" })
    public void getMessange(@Payload Message<String> message) {

        String messageBody = message.getPayload();
        PedidoPayload pedidoPayload = new PedidoPayload();

        try {
            pedidoPayload = objectMapper.readValue(messageBody, PedidoPayload.class);

            System.out.println("Pedido Received: " + pedidoPayload.toString());

            pedidoService.processarPedido(pedidoPayload);

        } catch (JsonProcessingException e) {
            System.out.println("Error processing JSON: " + e.getMessage());
        }

    }
}
