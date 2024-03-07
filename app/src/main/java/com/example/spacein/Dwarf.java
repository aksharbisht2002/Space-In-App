package com.example.spacein;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Dwarf extends AppCompatActivity {

    ItemAdapterDwarf adapter ;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwarf);

        recyclerView = findViewById(R.id.recycler_view);


        ArrayList<ItemsDwarf> itemsArrayList = new ArrayList<>();
        itemsArrayList.add(new ItemsDwarf("Pluto" , R.drawable.p11));
        itemsArrayList.add(new ItemsDwarf("Ceres" , R.drawable.p12));
        itemsArrayList.add(new ItemsDwarf("Makemake" ,R.drawable.p13));
        itemsArrayList.add(new ItemsDwarf("Haumea" , R.drawable.p14));
        itemsArrayList.add(new ItemsDwarf("Eris" , R.drawable.p15));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ItemAdapterDwarf(itemsArrayList, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
    }
