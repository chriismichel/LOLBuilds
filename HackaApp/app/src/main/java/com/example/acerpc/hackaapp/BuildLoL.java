package com.example.acerpc.hackaapp;

import java.util.Arrays;

/**
 * Created by acer pc on 28/10/2017.
 */

public class BuildLoL {

    private CharSequence[] tipos;
    private String elo;
    private String lane;
    private Itens itens;

    public BuildLoL(CharSequence[] tipos, String elo, String lane, Itens itens) {
        this.tipos = tipos;
        this.elo = elo;
        this.lane = lane;
        this.itens = itens;
    }

    public CharSequence[] getTipos() {
        return tipos;
    }

    public Itens getItem() {
        return itens;
    }

    public void setTipos(CharSequence[] tipos) {
        this.tipos = tipos;
    }

    public String getElo() {
        return elo;
    }

    public void setElo(String elo) {
        this.elo = elo;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    @Override
    public String toString() {
        return "tipos=" + Arrays.toString(tipos) + "\n" +
                "elo=" + elo + "\n" +
                "lane=" + lane;
    }
}
