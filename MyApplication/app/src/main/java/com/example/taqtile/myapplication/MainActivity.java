
package com.example.taqtile.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView phrases;
    TextView family;
    TextView colors;
    TextView numbers;

    private void initFields(){
        phrases = (TextView) findViewById(R.id.phrases);
        family = (TextView) findViewById(R.id.family);
        colors = (TextView) findViewById(R.id.colors);
        numbers = (TextView) findViewById(R.id.numbers);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        initFields();
        redirectToNumberActivity();
        redirectToFamilyActivity();
        redirectToColorsActivity();
        redirectToPhrasesActivity();
    }


        // Set a click listener on that View
        private void redirectToNumberActivity() {
            numbers.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(numbersIntent);
                }
            });
        }

// Criar os outros métodos com os diferentes redirects.

            // Set a click listener on that View

    private void redirectToFamilyActivity() {
        family.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });
    }

    private void redirectToColorsActivity() {

        // Set a click listener on that View
        colors.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });
    }

    private void redirectToPhrasesActivity() {
        // Set a click listener on that View
        phrases.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });
    }
}
