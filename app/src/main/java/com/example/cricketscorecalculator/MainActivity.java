package com.example.cricketscorecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
int score=0;
double overs=0.0;
Boolean clicked=false;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button resetScore=(Button)findViewById(R.id.resetscore);
        resetScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            score=0;
            overs=0.0;
            displayOvers(overs);
            display(score);
            }
    });
        Button noBall=(Button) findViewById(R.id.noballscore);
        noBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked=true;
                Toast.makeText(getApplicationContext(),"It's a No Ball",Toast.LENGTH_SHORT).show();
                score=score+1;
             display(score);
            }
        });

    }
    public void displayOvers(double n){
    TextView d=(TextView)findViewById(R.id.oversdisplay);
    if (Math.abs((overs % 1)-.6) < .0000001){
        overs += .4;
    }
    d.setText(String.format("%.1f",overs));
}
public void sixRun(View v){
    score=score+6;
    overs=overs+0.1;
    if(clicked){
     overs=overs-0.1;
    }
    clicked=false;
    displayOvers(overs);
    display(score);
}

    public void fourRun(View v){
        score=score+4;
        overs=overs+0.1;
        if(clicked){
            overs=overs-0.1;
        }
        clicked=false;
        displayOvers(overs);
        display(score);
    }
    public void wideRun(View v){
        score=score+1;
        clicked=false;
        display(score);
    }

    public void oneRun(View v){
        score=score+1;
        overs=overs+0.1;
        if(clicked){
            overs=overs-0.1;
        }
        clicked=false;
        displayOvers(overs);
        display(score);
    }
    public void twoRun(View v){
        score=score+2;
        overs=overs+0.1;
        if(clicked){
            overs=overs-0.1;
        }
        clicked=false;
        displayOvers(overs);
        display(score);
    }
    public void threeRun(View v){
        score=score+3;
        overs=overs+0.1;
        if(clicked){
            overs=overs-0.1;
        }
        clicked=false;
        displayOvers(overs);
        display(score);
    }
    public void dotRun(View v){
        Toast.makeText(getApplicationContext(),"No Run!",Toast.LENGTH_SHORT).show();
        overs=overs+0.1;
        if(clicked){
            overs=overs-0.1;
        }
        clicked=false;
        displayOvers(overs);
    }

    public void display(int num){
        TextView t=(TextView)findViewById(R.id.scoredisplay);
        t.setText(String.valueOf(num));
    }
}
