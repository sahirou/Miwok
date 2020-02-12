package com.example.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Add onclickListener to Numbers Category
         */
        // Find the TextView that show Numbers
        TextView numbers = (TextView) findViewById(R.id.numbers);

        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });


        /**
         * Add onclickListener to Family Category
         */
        // Find the TextView that show Family
        TextView family = (TextView) findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                familyIntent.putExtra("background_color", R.color.category_family);
                startActivity(familyIntent);
            }
        });


        /**
         * Add onclickListener to Colors Category
         */
        // Find the TextView that show Colors
        TextView colors = (TextView) findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });


        /**
         * Add onclickListener to Phrases Category
         */
        // Find the TextView that show Phrases
        TextView phrases = (TextView) findViewById(R.id.phrases);

        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }


}
