package com.example.spacein;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(getApplicationContext(),Login.class);
        startActivity(i);

//        b1 = findViewById(R.id.button);
//        b2 = findViewById(R.id.button2);
//        b3 = findViewById(R.id.button3);
//        b4 = findViewById(R.id.button4);
//        b5 = findViewById(R.id.button5);
//        b6 = findViewById(R.id.button6);
//        b7 = findViewById(R.id.button7);
//        b8 = findViewById(R.id.button8);
//        b9 = findViewById(R.id.button9);
//        b10 = findViewById(R.id.button10);
//        b11 = findViewById(R.id.button11);
//        b12 = findViewById(R.id.button12);
//        b13 = findViewById(R.id.button13);
//        b14 = findViewById(R.id.button14);
//        b15 = findViewById(R.id.button15);
//
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),Login.class);
//                startActivity(i);
//            }
//        });
//
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),Feedback.class);
//                startActivity(i);
//            }
//        });
//
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),Fandq.class);
//                startActivity(i);
//            }
//        });
//
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),Aboutus.class);
//                startActivity(i);
//            }
//        });
//
//        b5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),News.class);
//                startActivity(i);
//            }
//        });
//
//        b6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),Constellations.class);
//                startActivity(i);
//            }
//        });
//
//        b7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),Planets.class);
//                startActivity(i);
//            }
//        });
//
//        b8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),Dwarf.class);
//                startActivity(i);
//            }
//        });
//
//        b9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),Rocky.class);
//                startActivity(i);
//            }
//        });
//
//        b10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),OthersBodies.class);
//                startActivity(i);
//            }
//        });
//
//        b11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),Quiz.class);
//                startActivity(i);
//            }
//        });
//
//        b12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),Menu.class);
//                startActivity(i);
//            }
//        });
//
//        b13.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),Settings.class);
//                startActivity(i);
//            }
//        });
//
//        b14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),Game.class);
//                startActivity(i);
//            }
//        });
//
//        b15.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),live_user.class);
//                startActivity(i);
//            }
//        });
    }

}