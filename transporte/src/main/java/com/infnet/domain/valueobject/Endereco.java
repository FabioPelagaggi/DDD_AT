package com.infnet.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Endereco {
    private final String rua;
    private final String cidade;
    private final String estado;
    private final String cep;
}
