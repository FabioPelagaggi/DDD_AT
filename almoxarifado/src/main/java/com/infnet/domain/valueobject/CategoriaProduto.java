package com.infnet.domain.valueobject;

public class CategoriaProduto {
    private final String nomeCategoria;
    private final String codigoCategoria;

    public CategoriaProduto(String nomeCategoria, String codigoCategoria) {
        if (nomeCategoria == null || nomeCategoria.isEmpty()) {
            throw new IllegalArgumentException("O nome da categoria não pode ser nulo ou vazio");
        }
        if (codigoCategoria == null || codigoCategoria.isEmpty()) {
            throw new IllegalArgumentException("O código da categoria não pode ser nulo ou vazio");
        }
        this.nomeCategoria = nomeCategoria;
        this.codigoCategoria = codigoCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public String getCodigoCategoria() {
        return codigoCategoria;
    }

    @Override
    public String toString() {
        return "CategoriaProduto{" +
                "nomeCategoria='" + nomeCategoria + '\'' +
                ", codigoCategoria='" + codigoCategoria + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        CategoriaProduto that = (CategoriaProduto) o;

        if (!nomeCategoria.equals(that.nomeCategoria))
            return false;
        return codigoCategoria.equals(that.codigoCategoria);
    }

    @Override
    public int hashCode() {
        int result = nomeCategoria.hashCode();
        result = 31 * result + codigoCategoria.hashCode();
        return result;
    }
}
