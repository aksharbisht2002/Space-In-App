package com.example.spacein;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OthersBodies extends AppCompatActivity {

    ItemAdapterExtra adapter ;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otherbodies);


        recyclerView = findViewById(R.id.recycler_view);


        ArrayList<ItemsExtra> itemsArrayList = new ArrayList<>();
        itemsArrayList.add(new ItemsExtra("Sun" , R.drawable.sun));
        itemsArrayList.add(new ItemsExtra("Moon" , R.drawable.moon));
        itemsArrayList.add(new ItemsExtra("Planet X" ,R.drawable.black));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ItemAdapterExtra(itemsArrayList, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
    }
