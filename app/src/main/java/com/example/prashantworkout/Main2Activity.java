package com.example.prashantworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.app.Activity;
public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle items = getIntent().getExtras();
        String val = items.getString("choice");
        TextView[] arr = new TextView[4];
        arr[0] = (TextView) findViewById(R.id.tv1);
        arr[1] = (TextView) findViewById(R.id.tv2);
        arr[2] = (TextView) findViewById(R.id.tv3);
        arr[3] = (TextView) findViewById(R.id.tv4);
        if (val.equals("Push")) {
            arr[0].setText("Decline Pushups and Chest press");
            arr[1].setText("Flat dumbell fly and dumbell crossover");
            arr[2].setText("Triceps Pushdown and Skullcrushers");
            arr[3].setText("Tricep kickbacks and dips");
        } else if (val.equals("Pull")) {
            arr[0].setText("Bicep curls and Hammer curls");
            arr[1].setText("Close grip curls and Bent over curls");
            arr[2].setText("Lat towel pulldown and Back rows");
            arr[3].setText("Rear delt fly and Single arm rows");
        } else {
            arr[0].setText("Single leg chair squat and Front squats");
            arr[1].setText("Lunges and Stiff leg deadlifts");
            arr[2].setText("Arnold presses and upright rows");
            arr[3].setText("Front raises and Lateral Raises");
        }
    }
        public void goBack (View v){
            final Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }

