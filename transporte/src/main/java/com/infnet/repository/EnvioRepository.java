package com.infnet.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.infnet.domain.entity.Envio;

public interface EnvioRepository extends JpaRepository<Envio, Long> {
    List<Envio> findByStatus(String status);
}