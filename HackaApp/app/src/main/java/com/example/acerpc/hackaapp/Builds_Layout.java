package com.example.acerpc.hackaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by acer pc on 28/10/2017.
 */

public class Builds_Layout extends ArrayAdapter<BuildLoL> {

    private Context context;
    private List<BuildLoL> builds;
    private int cont = 0;

    public Builds_Layout(Context context, List<BuildLoL> builds) {
        super(context, 0, builds);
        this.context = context;
        this.builds = builds;
        cont++;
    }

    @Override
    public View getView(final int position, View view, final ViewGroup parent) {
        final BuildLoL build = builds.get(position);

        if (view == null)
            view = LayoutInflater.from(context).inflate(R.layout.builds_carregadas, null);

        TextView tipoView = (TextView) view.findViewById(R.id.tipo_view);
        tipoView.setText(build.getTipos().toString());

        ImageView item1Image = view.findViewById(R.id.item1);
        //item1Image.setImageDrawable(R.drawable.downloa1d);

        ImageView item2Image = view.findViewById(R.id.item2);
        //item2Image.setImageDrawable(R.drawable.downloa1d);

        ImageView item3Image = view.findViewById(R.id.item3);
        //item3Image.setImageDrawable(R.drawable.downloa1d);

        ImageView item4Image = view.findViewById(R.id.item4);
       //item4Image.setImageDrawable(R.drawable.downloa1d);

        ImageView item5Image = view.findViewById(R.id.item5);
        //item5Image.setImageDrawable(R.drawable.downloa1d);

        ImageView item6Image = view.findViewById(R.id.item6);
        //item6Image.setImageDrawable(R.drawable.carrinho);

        TextView eloView = view.findViewById(R.id.elo_view);
        eloView.setText(build.getElo());

        TextView laneView = view.findViewById(R.id.lane_view);
        laneView.setText(build.getLane());

        return view;
    }

}
