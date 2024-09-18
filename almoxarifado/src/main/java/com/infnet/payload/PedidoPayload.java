package com.infnet.payload;

public class PedidoPayload {

    private String id;
    private String nome;
    private String descricao;
    private String valor;
    private String quantidade;

    public PedidoPayload() {
    }

    public PedidoPayload(String id, String nome, String descricao, String valor, String quantidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getValor() {
        return valor;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "PedidoPayload [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor
                + ", quantidade=" + quantidade + "]";
    }
    
}
