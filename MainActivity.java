package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows Adele's album
        ImageView artistAdele = (ImageView) findViewById(R.id.artistAdele);

        // Set a click listener on that View
        artistAdele.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent adeleIntent = new Intent(MainActivity.this, AdeleActivity.class);

                // Start the new activity
                startActivity(adeleIntent);
            }
        });

        // Find the View that shows Bowie's album
        ImageView artistBowie = (ImageView) findViewById(R.id.artistBowie);

        // Set a click listener on that View
        artistAdele.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent bowieIntent = new Intent(MainActivity.this, BowieActivity.class);

                // Start the new activity
                startActivity(bowieIntent);
            }
        });

    }


}


