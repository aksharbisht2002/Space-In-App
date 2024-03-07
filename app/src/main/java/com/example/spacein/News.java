package com.example.spacein;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.spacein.Models.NewsApiResponse;
import com.example.spacein.Models.NewsHeadlines;

import java.util.List;

public class News extends AppCompatActivity implements SelectListener , View.OnClickListener{
  RecyclerView recyclerView ;
  CustomAdapter adapter ;
  ProgressDialog dialog;
  Button  btn ;
  SearchView searchView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        searchView = findViewById(R.id.search_View);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                dialog.setTitle("Fetching news articles of " + query);
                dialog.show();
                RequestManager manager = new RequestManager(News.this);
                manager.getNewsHeadlines(listener , "science" , query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        dialog = new ProgressDialog(this);
        dialog.setTitle("Fetching news articles");
        dialog.show();


        btn = findViewById(R.id.btn1);
        btn.setOnClickListener(this);


        RequestManager manager = new RequestManager(this);
        manager.getNewsHeadlines(listener , "science" , null);

    }
    private final OnFetchDataListener<NewsApiResponse>listener = new OnFetchDataListener<NewsApiResponse>() {
        @Override
        public void onFetchData(List<NewsHeadlines> list, String message) {
            if (list.isEmpty()){
                Toast.makeText(News.this, "No Data Found !!!!!!", Toast.LENGTH_SHORT).show();
            }
            else {
                showsNews(list);
                dialog.dismiss();
            }
        }

        @Override
        public void onError(String message) {
            Toast.makeText(News.this, "A Error Ocurred!!!!!!", Toast.LENGTH_SHORT).show();
        }
    };

    private void showsNews(List<NewsHeadlines> list) {
        recyclerView = findViewById(R.id.recycler_main);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this , 1));
        adapter  =  new CustomAdapter(this , list , this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void OnNewsClicked(NewsHeadlines headlines) {
          startActivity(new Intent(News.this ,DetailsActivity.class).putExtra("data", headlines));
    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        String category = button.getText().toString();

        dialog.setTitle("Fetching news articles of " + category);
        dialog.show();
        RequestManager manager = new RequestManager(this);
        manager.getNewsHeadlines(listener , category , null);
    }
}