package com.infnet.service;

import org.springframework.stereotype.Service;

@Service
public class EnvioService {

    public void enviar() {
        System.out.println("Enviando...");
    }
    
    public void receber() {
        System.out.println("Recebendo...");
    }
    
    public void processar() {
        System.out.println("Processando...");
    }
    
    public void finalizar() {
        System.out.println("Finalizando...");
    }
    
    public void cancelar() {
        System.out.println("Cancelando...");
    }
    
    public void reenviar() {
        System.out.println("Reenviando...");
    }
    
    public void reprocessar() {
        System.out.println("Reprocessando...");
    }
    
    public void reprocessar(String status) {
        System.out.println("Reprocessando com status: " + status);
    }
    
    public void reprocessar(Long id) {
        System.out.println("Reprocessando com id: " + id);
    }
    
    public void reprocessar(Long id, String status) {
        System.out.println("Reprocessando com id: " + id + " e status: " + status);
    }
    
    public void reprocessar(String nome, Long id, String status) {
        System.out.println("Reprocessando com nome: " + nome + ", id: " + id + " e status: " + status);
    }
    
    public void reprocessar(String nome, String status, Long id) {
        System.out.println("Reprocessando com nome: " + nome + ", status: " + status + " e id: " + id);
    }

}
