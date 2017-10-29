package com.example.acerpc.hackaapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by acer pc on 28/10/2017.
 */

public class Campeoes_Activity extends Fragment {
    Context context;

    public Campeoes_Activity(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.campeoes_main, container, false);
    }
}

