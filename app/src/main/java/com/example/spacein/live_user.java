package com.example.spacein;


import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.spacein.Models.record;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class live_user extends AppCompatActivity {

    DatabaseReference mDatabase;
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_user);

        t1 = findViewById(R.id.item1);
        t2 = findViewById(R.id.emailprofile);
        t3 = findViewById(R.id.phoneprofile);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("UserInfo");

        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
               for(DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                   record rec = postSnapshot.getValue(record.class);
                   String name = rec.getFirstname() + " " + rec.getLastname();
                   String email = rec.getEmail();
                   String phone = rec.getPhonenumber();

                   t1.setText(name);
                   t2.setText(email);
                   t3.setText(phone);
               }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}