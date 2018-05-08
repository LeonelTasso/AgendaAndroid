package com.example.gabriel.agenda.modelo;

import java.io.Serializable;

public class Aluno implements Serializable{

    private Long id;
    private String nome;
    private String endereco;
    private String site;
    private String telefone;
    private Double nota;

    public Aluno(){}

    public Aluno(Long id, String nome, String endereco, String site, String telefone, Double nota) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.site = site;
        this.telefone = telefone;
        this.nota = nota;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return getId() + " - "+ getNome();
    }
}
