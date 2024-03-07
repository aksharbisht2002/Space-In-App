package com.example.spacein;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {
     TextView head,forgot_head;
     TextView new_users;
     EditText email,password;
     Button submit;
     CheckBox checkBox;

     String email_pattern="[a-zA-Z0-9._]+@[a-z]+\\.+[a-z]+";
     Boolean saveLogin;

     SharedPreferences loginPreferences;
     SharedPreferences.Editor loginPrefsEditor;

     FirebaseAuth Fauth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        head=findViewById(R.id.heading);
        forgot_head=findViewById(R.id.forgot);
        email=findViewById(R.id.enter_email);
        password=findViewById(R.id.enter_pass);
        submit=findViewById(R.id.login);
        new_users=findViewById(R.id.new_user);
        Fauth= FirebaseAuth.getInstance();
        checkBox = findViewById(R.id.checkBox);

        loginPreferences = getSharedPreferences("loginPrefs", MODE_PRIVATE);
        loginPrefsEditor = loginPreferences.edit();

        saveLogin = loginPreferences.getBoolean("saveLogin", false);
        if (saveLogin == true) {
            email.setText(loginPreferences.getString("username", ""));
            password.setText(loginPreferences.getString("password", ""));
            checkBox.setChecked(true);
        }


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String mail=email.getText().toString();
              String pass=password.getText().toString();

                if (checkBox.isChecked()) {
                    loginPrefsEditor.putBoolean("saveLogin", true);
                    loginPrefsEditor.putString("username", mail);
                    loginPrefsEditor.putString("password", pass);
                    loginPrefsEditor.commit();
                } else {
                    loginPrefsEditor.clear();
                    loginPrefsEditor.commit();
                }

                Fauth.signInWithEmailAndPassword(mail,pass).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Toast.makeText(Login.this,"Success",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Login.this,Menu.class));

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Login.this,"Failed",Toast.LENGTH_SHORT).show();

                    }
                });

              //validation for blank text
                //email
                if (mail.isEmpty()) {
                    email.setError("Email is required!");
                    return;
                }
                //password
                if(pass.isEmpty()||pass.length()<6){
                    password.setError("Password is required");
                    return;
                }
                //check whether email is correct or not
                if(!mail.matches(email_pattern)){
                    email.setError("Email doesn't match");
                }
                }
        });

        //if user clicked on new user then redirects to registration page

       new_users.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(Login.this,"Redirecting to Register Page",Toast.LENGTH_SHORT).show();
               startActivity(new Intent(Login.this,Register.class));
           }
       });

        //code for forgot password
        forgot_head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this,"Forgot Password",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Login.this,fp.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed(){
        finishAffinity();
    }

}