package com.infnet.domain.valueobject;

public class Preco {
    private final double valor;

    public Preco(double valor) {
        if (valor < 0)
            throw new IllegalArgumentException("O valor não pode ser negativo");
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
