package com.example.searchablespinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.github.bkhezry.searchablespinner.SearchableSpinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> mList=new ArrayList<>();
    SearchableSpinner searchableSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchableSpinner=findViewById(R.id.searchable_spinner1);

        for (int i=0;i<20;i++){
            mList.add("Person "+i);
        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,mList);
        searchableSpinner.setAdapter(arrayAdapter);
    }
}