/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows each category
        TextView numbers = findViewById(R.id.numbers);
        TextView family = findViewById(R.id.family);
        TextView phrases = findViewById(R.id.phrases);
        TextView colors = findViewById(R.id.colors);

        //Set the onClick listener for each view
        numbers.setOnClickListener(new View.OnClickListener() {
            //This code will be executed when the numbers view is clicked
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
                startActivity(numbersIntent);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            //This code will be executed when the family view is clicked
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, Family.class);
                startActivity(familyIntent);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            //This code will be executed when the phrases view is clicked
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, Phrases.class);
                startActivity(phrasesIntent);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            //This code will be executed when the colors view is clicked
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this, Colors.class);
                startActivity(colorIntent);
            }
        });
    }
}
