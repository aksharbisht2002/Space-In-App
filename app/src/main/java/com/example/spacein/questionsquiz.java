package com.example.spacein;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class questionsquiz extends AppCompatActivity {

    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

    String questions[] = {
            "Who among the following proposed Laws of planetary motion?",
            " Which one of the following planets has largest number of natural satellites or moons?",
            "In order of their distances from the Sun, which of the following planets lie between Mars & Uranus?",
            " What is the average distance (approximate) between the Sun & the Earth?",
            "Among the following which planet takes maximum time for one revolution around?",
            " If the stars are seen to rise perpendicular to the horizon by an observer, he is located on the?",
            "One Astronomical Unit is the average distance between?",
            " What is the approximate mean velocity with which the Earth moves round the Sun in its orbit?",
            " Which one of the following scholars suggests the earth’s origin is from gases and dust particles?",
            "Which is the nearest of the sun?"
    };
    String answers[] = {"Kepler","Saturn","Jupiter and Saturn","150 x 106 km","Jupiter"," Equator",
            "Earth and the Sun"," 30km/s","O Schmidit","Proxima centaury"};
    String opt[] = {
            " Newton","Kepler","Ptolemy","Copernicus",
            "Jupiter","Mars","Saturn","Venus",
            "Earth and Jupiter","Jupiter and Saturn","Saturn and Earth"," Saturn and Neptune",
            "70 x 105 km"," 100 x 105","110 x 106 km","150 x 106 km",
            "Earth","Jupiter","Mars","Venus",
            " Equator","Tropic of Cancer","South Pole"," North Pole",
            "Earth and the Sun","Earth and the Moon","Jupiter and the Sun","Neptune and the Sun",
            " 20km/s"," 30km/s"," 40km/s"," 50km/s",
            "James Jeans","H Alfven","F Hoyle"," O Schmidit",
            " Beta centaury"," Alpha centaury","Gamma centaury","Proxima centaury"
    };
    int flag=0;
    public static int marks=0,correct=0,wrong=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionsquiz);

        final TextView score = (TextView)findViewById(R.id.textView4);
        TextView textView=(TextView)findViewById(R.id.DispName);
        Intent intent = getIntent();
        String name= intent.getStringExtra("myname");


        if (name.trim().equals(""))
            textView.setText("Hello User");
        else
            textView.setText(name);

        submitbutton=(Button)findViewById(R.id.button3);
        quitbutton=(Button)findViewById(R.id.buttonquit);
        tv=(TextView) findViewById(R.id.tvque);

        radio_g=(RadioGroup)findViewById(R.id.answersgrp);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(radio_g.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
//                Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();
                if(ansText.equals(answers[flag])) {
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    wrong++;
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }

                flag++;

                if (score != null)
                    score.setText(""+correct);

                if(flag<questions.length)
                {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag*4]);
                    rb2.setText(opt[flag*4 +1]);
                    rb3.setText(opt[flag*4 +2]);
                    rb4.setText(opt[flag*4 +3]);
                }
                else
                {
                    marks=correct;
                    Intent in = new Intent(getApplicationContext(),result.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),result.class);
                startActivity(intent);
            }
        });
    }

}