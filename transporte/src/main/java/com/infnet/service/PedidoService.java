package com.infnet.service;

import com.infnet.payload.PedidoPayload;

public class PedidoService {

    public void processarPedido(PedidoPayload pedidoPayload) {
        System.out.println("Pedido processado");
    }

    public void enviarPedido(PedidoPayload pedidoPayload) {
        System.out.println("Pedido enviado");
    }

    public void receberPedido(PedidoPayload pedidoPayload) {
        System.out.println("Pedido recebido");
    }

    public void cancelarPedido(PedidoPayload pedidoPayload) {
        System.out.println("Pedido cancelado");
    }

    public void finalizarPedido(PedidoPayload pedidoPayload) {
        System.out.println("Pedido finalizado");
    }

    public void atualizarPedido(PedidoPayload pedidoPayload) {
        System.out.println("Pedido atualizado");
    }

    public void consultarPedido(PedidoPayload pedidoPayload) {
        System.out.println("Pedido consultado");
    }

    public void criarPedido(PedidoPayload pedidoPayload) {
        System.out.println("Pedido criado");
    }

    public void deletarPedido(PedidoPayload pedidoPayload) {
        System.out.println("Pedido deletado");
    }

    public void listarPedidos() {
        System.out.println("Pedidos listados");
    }

    
}
