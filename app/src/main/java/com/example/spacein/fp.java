package com.example.spacein;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class fp extends AppCompatActivity {
  TextView one;
  EditText two;
  Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fp);
        one=findViewById(R.id.myday);
        two=findViewById(R.id.get);
        b1=findViewById(R.id.btn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail1=two.getText().toString();

                FirebaseAuth.getInstance().sendPasswordResetEmail(mail1).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful())
                            {
                                Toast.makeText(fp.this, "The Mail is Sent to registered id!", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(getApplicationContext(),Login.class);
                                startActivity(i);
                                }else{
                                Toast.makeText(fp.this,"Email not registered",Toast.LENGTH_SHORT).show();
                            }
                            }
                    });
                }

        });


    }
}