package com.example.acerpc.hackaapp;


import java.util.ArrayList;

/**
 * Created by acer pc on 28/10/2017.
 */

public class Builds_Armazenamento {
    private ArrayList<BuildLoL> builds;
    private Itens itens = new Itens();

    public Builds_Armazenamento() {
        builds = new ArrayList<>();
    }

    public void addBuild(CharSequence[] tipos, String elo, String lane) {

        if(lane.equalsIgnoreCase("Top")||
                lane.equalsIgnoreCase("Mid")){
            if (tipos[0].equals("Assassino")) {
                itens.addItem(new itemLol("Força da Trindade", "AD"));
                itens.addItem(new itemLol("A Sedenta por Sangue", "AD"));
                itens.addItem(new itemLol("Lâmina da Fúria de Guinsoo", "AD"));
                itens.addItem(new itemLol("Dança da Morte", "AD"));
                itens.addItem(new itemLol("Hidra Raivosa", "AD"));
                itens.addItem(new itemLol("Gume do Infinito", "AD"));
                itens.addItem(new itemLol("Mandíbula de Malmortius", "AD"));
                itens.addItem(new itemLol("Limiar da Noite", "AD"));
                itens.addItem(new itemLol("O Cutelo Negro", "AD"));
                itens.addItem(new itemLol("Crepúsculo de Dartharr", "AD"));
                itens.addItem(new itemLol("Lâmina Fantasma de Yomuu", "AD"));
                itens.addItem(new itemLol("Lembranças do Lorde Dominik", "AD"));
                itens.addItem(new itemLol("Lembrete Mortal", "AD"));
                itens.addItem(new itemLol("Anjo Guardião", "AD"));
                itens.addItem((new itemLol("Faca Sttikk", "Acerto Crítico")));
                itens.addItem(new itemLol("Pistola Laminar Hextek", "AP"));
                itens.addItem(new itemLol("Capuz da Morte de Rabadon", "AP"));
                itens.addItem(new itemLol("Eco de Luden", "AP"));
                itens.addItem(new itemLol("Perdição de Lich", "AP"));
                itens.addItem(new itemLol("Tormento de Liandry", "AP"));
                itens.addItem(new itemLol("Cajado do Arcanjo", "AP"));
                itens.addItem(new itemLol("Véu da Banshee", "AP"));
                itens.addItem(new itemLol("Morellonomicon", "AP"));
                itens.addItem(new itemLol("Cajado do Vazio", "AP"));
                itens.addItem(new itemLol("Protocinturão-01 Hextec", "AP"));
                itens.addItem(new itemLol("Ladrão de Almas de Mejai", "AP"));
                itens.addItem(new itemLol("Botas da Rapidez", "Bota"));
                itens.addItem(new itemLol("Botas da Mobilidade", "Bota"));
                itens.addItem(new itemLol("Botas Ionianas da Lucidez", "Bota"));
                itens.addItem(new itemLol("Tabi Ninja", "Bota"));
                itens.addItem(new itemLol("Passos de Mercúrio", "Bota"));
                itens.addItem(new itemLol("Sapatos do Feiticeiro", "Bota"));
                BuildLoL build = new BuildLoL(tipos, elo, lane, itens);
                builds.add(build);
            } else if (tipos[0].equals("Lutador")) {

            } else if (tipos[0].equals("Mago")) {

            } else if (tipos[0].equals("Atirador")) {

            } else if(tipos[0].equals("Tanque")){

            } else if(tipos[0].equals("Suporte")){
                
            }
        }
        else if(lane.equalsIgnoreCase("jungle")){

        }


    }

    public ArrayList<BuildLoL> getBuilds() {
        return builds;
    }
}
