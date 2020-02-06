package com.example.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addNumbersList(View view) {
        Intent numbers = new Intent(this, NumbersActivity.class);
        startActivity(numbers);
    }

    public void addColorsList(View view) {
        Intent colors = new Intent(this, ColorsActivity.class);
        startActivity(colors);
    }

    public void addPhrasesList(View view) {
        Intent phrases = new Intent(this, PhrasesActivity.class);
        startActivity(phrases);
    }

    public void addFamilyList(View view) {
        Intent family = new Intent(this, FamilyActivity.class);
        startActivity(family);
    }
}
