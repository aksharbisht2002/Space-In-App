package com.example.spacein;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Planets extends AppCompatActivity {

    ItemAdapterPlanets adapter ;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets);

        recyclerView = findViewById(R.id.recycler_view);

        ArrayList<ItemsPlanets> itemsArrayList = new ArrayList<>();
        itemsArrayList.add(new ItemsPlanets("Mercury" , R.drawable.p1));
        itemsArrayList.add(new ItemsPlanets("Neptune" , R.drawable.p2));
        itemsArrayList.add(new ItemsPlanets("Venus" , R.drawable.p3));
        itemsArrayList.add(new ItemsPlanets("Earth" , R.drawable.p4));
        itemsArrayList.add(new ItemsPlanets("Jupiter" , R.drawable.p5));
        itemsArrayList.add(new ItemsPlanets("Saturn" , R.drawable.p6));
        itemsArrayList.add(new ItemsPlanets("Uranus" , R.drawable.p7));
        itemsArrayList.add(new ItemsPlanets("Mars" , R.drawable.p8));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ItemAdapterPlanets(itemsArrayList, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}