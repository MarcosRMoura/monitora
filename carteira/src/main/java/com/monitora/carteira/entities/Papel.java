package com.monitora.carteira.entities;

import java.io.Serializable;

public class Papel implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String sigla;

    public Papel() {
    }

    public Papel(Long id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Papel papel = (Papel) o;

        return id != null ? id.equals(papel.id) : papel.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
