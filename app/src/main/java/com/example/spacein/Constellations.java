package com.example.spacein;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Constellations extends AppCompatActivity {

    ItemAdapter adapter ;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constellations);


        recyclerView = findViewById(R.id.recycler_view);


        ArrayList<Items> itemsArrayList = new ArrayList<>();
        itemsArrayList.add(new Items("Orion" , R.drawable.orion));
        itemsArrayList.add(new Items("Caris" , R.drawable.caris));
        itemsArrayList.add(new Items("Ursa" ,R.drawable.ursa));
        itemsArrayList.add(new Items("Cassiopeia" , R.drawable.cassiopeia));
        itemsArrayList.add(new Items("Taurus" ,R.drawable.taurus));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ItemAdapter(itemsArrayList, getApplicationContext());
        recyclerView.setAdapter(adapter);

    }
}