package com.example.listener;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;

public class AdapterIterativo extends ArrayAdapter<Iterativo> {

    Context ctx = null;
    public AdapterIterativo(Context context,int resource, ArrayList<Iterativo>itera) {
        super(context, 0, itera);
        ctx = context;
    }

    @NonNull
    @Override
    public View get View (int position, View convertView,@NonNull ViewGroup parent) {
        Iterativo iterativo = getItem(position);
        if(convertView == null) {
            LayoutInflater li = (LayoutInflater) ctx.getSystemService((ctx.LAYOUT_INFLATER_SERVICE));
            convertView = li.inflate(R.layout.contenuto, parent, false);
        }
        TextView titoloTextView = convertView.findViewById(R.id.listView1);
        TextView descrizioneTextView = convertView.findViewById(R.id.listView2);

        if(iterative != null) {
            titoloTextView.setText(iterativo.titolo);
            descrizioneTextView.setText(iterativo.descrizione);
        }
        return convertView;
    }
}
