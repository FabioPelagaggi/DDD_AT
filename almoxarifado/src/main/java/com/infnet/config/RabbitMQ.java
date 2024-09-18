package com.infnet.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQ {
    @Bean
    public Queue filaPedido() {
        return new Queue("fila.pedido", true);
    }

    @Bean
    public TopicExchange trocaPedidos() {
        return new TopicExchange("troca.pedidos");
    }

    @Bean
    public Binding binding(Queue filaPedido, TopicExchange trocaPedidos) {
        return BindingBuilder.bind(filaPedido).to(trocaPedidos).with("pedido.#");
    }
}
