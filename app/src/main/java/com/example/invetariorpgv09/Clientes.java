package com.example.invetariorpgv09;

public class Clientes {
    private String nome;
    private String senha;

    public Clientes(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    // Métodos getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
