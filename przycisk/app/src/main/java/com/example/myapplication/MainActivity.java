package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonDisable;
    private Button buttonOn;
    private TextView liczba;
    private int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonDisable = findViewById(R.id.buttonDisable);
        liczba = findViewById(R.id.liczba);
        buttonDisable.setOnClickListener(new View.OnClickListener() {
                                             public void onClick(View v) {
                                                 buttonDisable.setEnabled(false);
                                                 a++;
                                                 liczba.setText("Count: "+ a);
                                             }

                                         }

        );
        buttonOn = findViewById(R.id.a);


        buttonOn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            buttonDisable.setEnabled(true);

            }

            ;
        });
    }
}