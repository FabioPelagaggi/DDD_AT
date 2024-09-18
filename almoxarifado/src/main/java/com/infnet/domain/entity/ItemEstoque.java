package com.infnet.domain.entity;

import com.infnet.domain.valueobject.CategoriaProduto;
import com.infnet.domain.valueobject.Preco;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ItemEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeProduto;
    private int quantidadeDisponivel;
    private double precoUnitario;

    @Embedded
    private CategoriaProduto categoriaProduto;

    @Embedded
    private Preco preco;

}
