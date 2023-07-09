package com.example.invetariorpgv09;
import java.util.ArrayList;
import java.util.List;

public class CRUDItens {
    private final List<Itens> inventario;

    public CRUDItens() {
        inventario = new ArrayList<>();
    }

    public void adicionarItem(Itens item) {
        inventario.add(item);
    }

    public void editarItem(int indice, Itens item) {
        inventario.set(indice, item);
    }

    public void removerItem(int indice) {
        inventario.remove(indice);
    }

    public void exibirItens() {
        for (Itens item : inventario) {
            System.out.println(item.getNome());
        }
    }
}

