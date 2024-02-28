package com.example.listener;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class Reaction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaction);

        String titoloDato = getIntent().getStringExtra("titoloDato");
        String descrizioneData = getIntent().getStringExtra("descrizioneData");
        TextView titoloTextView = findViewById(R.id.titoloTextView);
        TextView descrizioneTextView = findViewById(R.id.descrizioneTextView);
        titoloTextView.setText(titoloDato);
        descrizioneTextView.setText(descrizioneData);
    }
}
