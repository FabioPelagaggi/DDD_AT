package com.infnet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infnet.domain.entity.ItemEstoque;

public interface ItemEstoqueRepository extends JpaRepository<ItemEstoque, Long> {
    List<ItemEstoque> findByNomeProduto(String nomeProduto);
}

