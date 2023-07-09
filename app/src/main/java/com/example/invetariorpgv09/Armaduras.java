package com.example.invetariorpgv09;

public class Armaduras extends Itens {
    private byte defesaArmadura;
    private String tipoArmadura;
    private boolean conjuntoArmadura;
    private String slotsArmaduras;

    public Armaduras(String nome, int valor, int quantidade, String categoria, String subcategoria, String descricao, byte defesaArmadura, String tipoArmadura, boolean conjuntoArmadura, String slotsArmaduras) {
        super(nome, valor, quantidade, categoria, subcategoria, descricao);
        this.defesaArmadura = defesaArmadura;
        this.tipoArmadura = tipoArmadura;
        this.conjuntoArmadura = conjuntoArmadura;
        this.slotsArmaduras = slotsArmaduras;
    }

    // Métodos getters e setters

    public byte getDefesaArmadura() {
        return defesaArmadura;
    }

    public void setDefesaArmadura(byte defesaArmadura) {
        this.defesaArmadura = defesaArmadura;
    }

    public String getTipoArmadura() {
        return tipoArmadura;
    }

    public void setTipoArmadura(String tipoArmadura) {
        this.tipoArmadura = tipoArmadura;
    }

    public boolean isConjuntoArmadura() {
        return conjuntoArmadura;
    }

    public void setConjuntoArmadura(boolean conjuntoArmadura) {
        this.conjuntoArmadura = conjuntoArmadura;
    }

    public String getSlotsArmaduras() {
        return slotsArmaduras;
    }

    public void setSlotsArmaduras(String slotsArmaduras) {
        this.slotsArmaduras = slotsArmaduras;
    }
}