package com.example.invetariorpgv09;

 class Armas extends Itens {
    private int danoFisico;
    private String tipoDano;

    public Armas(String nome, int valor, int quantidade, String categoria, String subcategoria, String descricao, int danoFisico, String tipoDano) {
        super(nome, valor, quantidade, categoria, subcategoria, descricao);
        this.danoFisico = danoFisico;
        this.tipoDano = tipoDano;
    }

    // Métodos getters e setters

    public int getDanoFisico() {
        return danoFisico;
    }

    public void setDanoFisico(int danoFisico) {
        this.danoFisico = danoFisico;
    }

    public String getTipoDano() {
        return tipoDano;
    }

    public void setTipoDano(String tipoDano) {
        this.tipoDano = tipoDano;
    }
}

