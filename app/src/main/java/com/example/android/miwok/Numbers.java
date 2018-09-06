package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create an array of words
        ArrayList<String> words = new ArrayList<>();
        new Word("one", "lutti");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        words.add("eleven");
        words.add("twelve");
        words.add("thirteen");
        words.add("fourteen");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>
                (this, R.layout.list_item, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
