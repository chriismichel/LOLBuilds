package com.example.acerpc.hackaapp;


import java.util.ArrayList;

/**
 * Created by acer pc on 28/10/2017.
 */

class Itens {
    private ArrayList<itemLol> itens;

    public Itens() {
        itens = new ArrayList<>();
    }

    public void addItem(itemLol item) {
        itens.add(item);
    }

    public ArrayList<itemLol> getItens() {
        return itens;
    }
}
