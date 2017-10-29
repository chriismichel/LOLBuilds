package com.example.acerpc.hackaapp;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RadioButton[] tiposRadioButtons;
    private RadioButton[] lanesRadioButtons;
    private RadioButton[] elosRadioButtons;
    private String laneNome;
    private CharSequence[] tiposNome;
    private String eloNome;
    private Builds_Armazenamento builds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        RadioButton radio1 = (RadioButton) findViewById(R.id.Top_Button);
        RadioButton radio2 = (RadioButton) findViewById(R.id.Mid_Button);
        RadioButton radio3 = (RadioButton) findViewById(R.id.Suporte_Button);
        RadioButton radio4 = (RadioButton) findViewById(R.id.ADC_Button);
        RadioButton radio5 = (RadioButton) findViewById(R.id.Jungle_Button);
        lanesRadioButtons = new RadioButton[5];
        lanesRadioButtons[0] = radio1;
        lanesRadioButtons[1] = radio2;
        lanesRadioButtons[2] = radio3;
        lanesRadioButtons[3] = radio4;
        lanesRadioButtons[4] = radio5;

        RadioButton radio6 = (RadioButton) findViewById(R.id.tipo_assassino);
        RadioButton radio7 = (RadioButton) findViewById(R.id.tipo_lutador);
        RadioButton radio8 = (RadioButton) findViewById(R.id.tipo_mago);
        RadioButton radio9 = (RadioButton) findViewById(R.id.tipo_suporte);
        RadioButton radio10 = (RadioButton) findViewById(R.id.tipo_tanque);
        RadioButton radio11 = (RadioButton) findViewById(R.id.atirador);
        tiposRadioButtons = new RadioButton[6];
        tiposRadioButtons[0] = radio6;
        tiposRadioButtons[1] = radio7;
        tiposRadioButtons[2] = radio8;
        tiposRadioButtons[3] = radio9;
        tiposRadioButtons[4] = radio10;
        tiposRadioButtons[5] = radio11;

        RadioButton radio12 = (RadioButton) findViewById(R.id.bronze);
        RadioButton radio13 = (RadioButton) findViewById(R.id.prata);
        RadioButton radio14 = (RadioButton) findViewById(R.id.ouro);
        RadioButton radio15 = (RadioButton) findViewById(R.id.superior);
        elosRadioButtons = new RadioButton[4];
        elosRadioButtons[0] = radio12;
        elosRadioButtons[1] = radio13;
        elosRadioButtons[2] = radio14;
        elosRadioButtons[3] = radio15;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_builds) {
            Builds_Procurar_Inflater fragment = new Builds_Procurar_Inflater();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.nav_champions) {
            Campeoes_Activity fragment = new Campeoes_Activity();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.nav_itens) {
            Itens_Activity fragment = new Itens_Activity();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void selecionaLane(RadioButton[] lanes, RadioButton[] tipos, RadioButton[] elos) { //
        boolean lanesbool = false;
        int lanescont = 0;

        while (lanesbool == false) {
            lanesbool = lanes[lanescont].isSelected();
            lanescont++;
            if (lanescont == lanes.length) {
                break;
            }
        }

        if (lanesbool == true) {
            if (lanes[lanescont].getText().equals("Top")) {
                setLaneNome("Top");
            } else if (lanes[lanescont].getText().equals("Mid")) {
                setLaneNome("Mid");
            } else if (lanes[lanescont].getText().equals("Jungle")) {
                setLaneNome("Jungle");
            } else if (lanes[lanescont].getText().equals("Suporte")) {
                setLaneNome("Suporte");
            } else if (lanes[lanescont].getText().equals("ADC")) {
                setLaneNome("ADC");
            }
            selecionaTipo(tipos, elos);
        }
    }


    public void carregaButtons(View view) {
        selecionaLane(lanesRadioButtons, tiposRadioButtons, elosRadioButtons);
    }

    public void selecionaTipo(RadioButton[] tipos, RadioButton[] elos) {
        boolean[] tiposbool = new boolean[6];
        int[] postipos = new int[6];
        int a = 0;

        for(int i =0;i<tipos.length;i++){
            tiposbool[i] = tipos[i].isSelected();
        }

        if (tiposbool[0] == true ||
                tiposbool[1] == true || tiposbool[2] == true ||
                tiposbool[3] == true || tiposbool[4] == true ||
                tiposbool[5] == true || tiposbool[6] == true) {
            for (int j = 0; j < tiposbool.length; j++) {
                if (tiposbool[j] == true) {
                    postipos[a] = j;
                    a++;
                }
            }
            for (int i = 0; i < postipos.length; i++) {
                int aux = postipos[i];
                tiposNome[i] = tipos[aux].getText();
            }
            selecionaElo(elos);
        }
    }

    public void selecionaElo(RadioButton[] elos) {
        boolean elobool = false;
        int eloscont = 0;

        while (elobool == false) {
            elobool = elos[eloscont].isSelected();
            eloscont++;
            if (eloscont == elos.length) {
                break;
            }
        }
        if (elobool == true) {
            if (elos[eloscont].getText().equals("Bronze")) {
                setEloNome("Bronze");
            } else if (elos[eloscont].getText().equals("Prata")) {
                setEloNome("Prata");
            } else if (elos[eloscont].getText().equals("Ouro")) {
                setEloNome("Ouro");
            } else if (elos[eloscont].getText().equals("Superior")) {
                setEloNome("Superior");
            }
            builds.addBuild(tiposNome, eloNome, laneNome);

        }
    }

    public String getLaneNome() {
        return laneNome;
    }

    public CharSequence[] getTiposNome() {
        return tiposNome;
    }

    public void setTiposNome(CharSequence[] tiposNome) {
        this.tiposNome = tiposNome;
    }

    public String getEloNome() {
        return eloNome;
    }

    public void setEloNome(String elo) {
        this.eloNome = elo;
    }

    public void setLaneNome(String lane) {
        this.laneNome = lane;
    }

    public void setTiposNome(String[] tipos) {
        this.tiposNome = tipos;
    }

}
