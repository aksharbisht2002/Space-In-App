package com.example.spacein;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import nl.psdcompany.duonavigationdrawer.views.DuoDrawerLayout;
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    private DuoDrawerLayout drawerLayout;
    TextView t1,t2,t3,t4,t5,t6,t7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        t1 = findViewById(R.id.planets);
        t2 = findViewById(R.id.dwarfplanets);
        t3 = findViewById(R.id.extraplanets);
        t4 = findViewById(R.id.rockyobjects);
        t5 = findViewById(R.id.constellation);
        t6 = findViewById(R.id.galaxy);
        t7 = findViewById(R.id.universe);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent(getApplicationContext(),Planets.class);
                startActivity(i);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Dwarf.class);
                startActivity(i);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),OthersBodies.class);
                startActivity(i);
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Rocky.class);
                startActivity(i);
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Constellations.class);
                startActivity(i);
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Constellations.class);
                startActivity(i);
            }
        });

        init();

    }

    private void init(){

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = (DuoDrawerLayout) findViewById(R.id.drawer);
        DuoDrawerToggle drawerToggle = new DuoDrawerToggle(this, drawerLayout ,toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawerLayout.setDrawerListener(drawerToggle);
        drawerToggle.syncState();


        View contentView = drawerLayout.getContentView();
        View menuView = drawerLayout.getMenuView();

        LinearLayout l_Home = menuView.findViewById(R.id.l_Home);
        LinearLayout l_Profile = menuView.findViewById(R.id.l_Profile);
        LinearLayout l_Setting = menuView.findViewById(R.id.l_Setting);
        LinearLayout l_FAQ = menuView.findViewById(R.id.l_FAQ);
        LinearLayout l_Feedback = menuView.findViewById(R.id.l_Feedback);
        LinearLayout l_Share = menuView.findViewById(R.id.l_Share);
        LinearLayout l_Logout = menuView.findViewById(R.id.l_quit);
        LinearLayout l_News = menuView.findViewById(R.id.l_news);
        LinearLayout l_Game = menuView.findViewById(R.id.l_game);
        LinearLayout l_About = menuView.findViewById(R.id.l_about);
        LinearLayout l_Quiz = menuView.findViewById(R.id.l_quiz);
        LinearLayout l_Facts = menuView.findViewById(R.id.l_facts);

        l_Home.setOnClickListener(this);
        l_Profile.setOnClickListener(this);
        l_Setting.setOnClickListener(this);
        l_FAQ.setOnClickListener(this);
        l_Feedback.setOnClickListener(this);
        l_Share.setOnClickListener(this);
        l_Logout.setOnClickListener(this);
        l_News.setOnClickListener(this);
        l_Game.setOnClickListener(this);
        l_About.setOnClickListener(this);
        l_Quiz.setOnClickListener(this);
        l_Facts.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
         switch (v.getId()){
             case R.id.l_Home:
                 Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                 break;

             case R.id.l_Profile:
                 i = new Intent(getApplicationContext(),live_user.class);
                 startActivity(i);
                 break;

             case R.id.l_Setting:
                 i = new Intent(getApplicationContext(),Settings.class);
                 startActivity(i);

                 break;

             case R.id.l_FAQ:
                 i = new Intent(getApplicationContext(),Fandq.class);
                 startActivity(i);
                 break;

             case R.id.l_Feedback:
                 i = new Intent(getApplicationContext(),Feedback.class);
                 startActivity(i);

                 break;

             case R.id.l_Share:
                 Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                 break;


             case R.id.l_news:
                 i = new Intent(getApplicationContext(),News.class);
                 startActivity(i);
                 break;
             case R.id.l_facts:
                 Toast.makeText(this, "facts", Toast.LENGTH_SHORT).show();
                 break;
             case R.id.l_about:
                 i = new Intent(getApplicationContext(),Aboutus.class);
                 startActivity(i);
                 break;
             case R.id.l_game:
                 i = new Intent(getApplicationContext(),Game.class);
                 startActivity(i);
                 break;
             case R.id.l_quiz:
                 i = new Intent(getApplicationContext(),Quiz.class);
                 startActivity(i);
                 break;
             case R.id.l_quit:
                 finish();
                 System.exit(0);
                 break;




         }
    }
}