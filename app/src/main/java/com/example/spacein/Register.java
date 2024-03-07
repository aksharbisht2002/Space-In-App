package com.example.spacein;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.spacein.Models.record;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {
    Button b1;
    EditText name,lname,email,phone,pass,confpass;
    FirebaseAuth auth;
    FirebaseDatabase database;
    DatabaseReference reference;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        
        
        b1 = findViewById(R.id.button);
        name = findViewById(R.id.editTextTextPersonName);
        lname = findViewById(R.id.editTextTextPersonName3);
        email = findViewById(R.id.editTextTextEmailAddress);
        phone = findViewById(R.id.editTextPhone);
        pass = findViewById(R.id.editTextTextPassword);
        confpass = findViewById(R.id.editTextTextPassword2);

        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("UserInfo");
        

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = name.getText().toString();
                String lastname = lname.getText().toString();
                String emailid = email.getText().toString();
                String phoneno = phone.getText().toString();
                String fpass = pass.getText().toString();
                String cnfpass = confpass.getText().toString();

                if (fname.isEmpty()) {
                    Toast.makeText(Register.this, "Enter First Name", Toast.LENGTH_SHORT).show();
                } else if (lastname.isEmpty()) {
                    Toast.makeText(Register.this, "Enter Last Name", Toast.LENGTH_SHORT).show();
                } else if (emailid.isEmpty()) {
                    Toast.makeText(Register.this, "Enter Email-Id", Toast.LENGTH_SHORT).show();
                } else if (phoneno.isEmpty()) {
                    Toast.makeText(Register.this, "Enter First Name", Toast.LENGTH_SHORT).show();
                } else if (fpass.isEmpty()) {
                    Toast.makeText(Register.this, "Enter Password", Toast.LENGTH_SHORT).show();
                } else if (cnfpass.isEmpty() || !cnfpass.equals(fpass)) {
                    Toast.makeText(Register.this, "Password does not match", Toast.LENGTH_SHORT).show();
                } else {

                    record rec = new record(fname, lastname, emailid, phoneno, fpass, cnfpass);
                    String childId = reference.push().getKey();
                    reference.child(childId).setValue(rec).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(Register.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });

                    auth.createUserWithEmailAndPassword(emailid, fpass).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            Toast.makeText(Register.this, "Account Created!", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(Register.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });

                    startActivity(new Intent(Register.this,Login.class));
                }
            }
        });
    }
}