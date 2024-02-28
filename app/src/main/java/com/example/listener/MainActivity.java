package com.example.listener;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Iterativo> itera = new ArrayList<>();
        for (int i = 1; i <= 100; i++){
            String titolo = "Titolo " + i;
            String descrizione = "Descrizione " + i;
            Iterativo iterativo = new Iterativo(titolo, descrizione);
            itera.add(iterativo);
        }

        AdapterIterativo adapater = new AdapterIterativo(this,R.layout.contenuto, itera);

        ListView listView = findViewById(R.id.principale);
        listView.setAdapter(adapater);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Iterativo selectedIterativo = itera.get(position);
                Intent intent = new Intent(MainActivity.this, Reaction.class);
                intent.putExtra("titoloDato", selectedIterativo.titolo);
                intent.putExtra("descrizioneData", selectedIterativo.descrizione);
                startActivity(intent);
            }
        });
    }
}
