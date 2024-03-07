package com.example.spacein;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Rocky extends AppCompatActivity {

    ItemAdapterRocky adapter ;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocky);


        recyclerView = findViewById(R.id.recycler_view);


        ArrayList<ItemsRocky> itemsArrayList = new ArrayList<>();
        itemsArrayList.add(new ItemsRocky("  Meteorites" , R.drawable.metori));
        itemsArrayList.add(new ItemsRocky("Asteroids" , R.drawable.asteroid));
        itemsArrayList.add(new ItemsRocky("Comets" ,R.drawable.comet));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ItemAdapterRocky(itemsArrayList, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
    }
