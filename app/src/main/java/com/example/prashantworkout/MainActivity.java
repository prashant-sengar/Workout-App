package com.example.prashantworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View;
import android.widget.EditText;
import android.graphics.Color;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button)findViewById(R.id.submit);
        final Intent i=new Intent(this,Main2Activity.class);
        b.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                //Intent i=new Intent(this,Main2Activity.class);
                Spinner sp=(Spinner)findViewById(R.id.mymenu);
                String val=String.valueOf(sp.getSelectedItem());
                i.putExtra("choice",val);
                startActivity(i);

            }
        });


    }
}
