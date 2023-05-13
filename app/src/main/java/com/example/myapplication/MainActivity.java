package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = findViewById(R.id.button6);
        Button bt2 = findViewById(R.id.button43);
        Button bt3 = findViewById(R.id.button8);
        Button bt4 = findViewById(R.id.button9);

        Button bt5 = findViewById(R.id.button10);
        Button bt6 = findViewById(R.id.button11);
        Button bt7 = findViewById(R.id.button12);
        Button bt8 = findViewById(R.id.button13);

        Button bt9 = findViewById(R.id.button14);
        Button bt10 = findViewById(R.id.button15);
        Button bt11 = findViewById(R.id.button16);
        Button bt12 = findViewById(R.id.button17);

        Button bt13 = findViewById(R.id.button18);
        Button bt14= findViewById(R.id.button19);
        Button bt15 = findViewById(R.id.button21);
        Button bt16 = findViewById(R.id.button22);

        Button bt17 = findViewById(R.id.button23);
        Button bt18 = findViewById(R.id.button24);
        Button bt19 = findViewById(R.id.button25);
        Button bt20 = findViewById(R.id.button26);

        Button bt21 = findViewById(R.id.button27);
        Button bt22 = findViewById(R.id.button28);
        Button bt23 = findViewById(R.id.button29);
        Button bt24 = findViewById(R.id.button30);

        Button bt25 = findViewById(R.id.button31);
        Button bt26 = findViewById(R.id.button32);
        Button bt27 = findViewById(R.id.button33);
        Button bt28 = findViewById(R.id.button34);

        Button bt29 = findViewById(R.id.button35);
        Button bt30 = findViewById(R.id.button36);
        Button bt31 = findViewById(R.id.button37);
        Button bt32 = findViewById(R.id.button38);

        Button bt33 = findViewById(R.id.button84);
        Button bt34 = findViewById(R.id.button44);
        Button bt35 = findViewById(R.id.button45);
        Button bt36 = findViewById(R.id.button46);

        Button bt37 = findViewById(R.id.button47);
        Button bt38 = findViewById(R.id.button48);
        Button bt39 = findViewById(R.id.button49);
        Button bt40 = findViewById(R.id.button50);


        View.OnClickListener myOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view instanceof Button){
                    Button button = (Button) view;
                    button.getBackground().setTint(Color.GREEN);
                }
            }
        };

        bt1.setOnClickListener(myOnClickListener);
        bt2.setOnClickListener(myOnClickListener);
        bt3.setOnClickListener(myOnClickListener);
        bt4.setOnClickListener(myOnClickListener);
        bt5.setOnClickListener(myOnClickListener);
        bt6.setOnClickListener(myOnClickListener);
        bt7.setOnClickListener(myOnClickListener);
        bt8.setOnClickListener(myOnClickListener);
        bt9.setOnClickListener(myOnClickListener);
        bt10.setOnClickListener(myOnClickListener);
        bt11.setOnClickListener(myOnClickListener);
        bt12.setOnClickListener(myOnClickListener);
        bt13.setOnClickListener(myOnClickListener);
        bt14.setOnClickListener(myOnClickListener);
        bt15.setOnClickListener(myOnClickListener);
        bt16.setOnClickListener(myOnClickListener);
        bt17.setOnClickListener(myOnClickListener);
        bt18.setOnClickListener(myOnClickListener);
        bt19.setOnClickListener(myOnClickListener);
        bt20.setOnClickListener(myOnClickListener);
        bt21.setOnClickListener(myOnClickListener);
        bt22.setOnClickListener(myOnClickListener);
        bt23.setOnClickListener(myOnClickListener);
        bt24.setOnClickListener(myOnClickListener);
        bt25.setOnClickListener(myOnClickListener);
        bt26.setOnClickListener(myOnClickListener);
        bt27.setOnClickListener(myOnClickListener);
        bt28.setOnClickListener(myOnClickListener);
        bt29.setOnClickListener(myOnClickListener);
        bt30.setOnClickListener(myOnClickListener);
        bt31.setOnClickListener(myOnClickListener);
        bt32.setOnClickListener(myOnClickListener);
        bt33.setOnClickListener(myOnClickListener);
        bt34.setOnClickListener(myOnClickListener);
        bt35.setOnClickListener(myOnClickListener);
        bt36.setOnClickListener(myOnClickListener);
        bt37.setOnClickListener(myOnClickListener);
        bt38.setOnClickListener(myOnClickListener);
        bt39.setOnClickListener(myOnClickListener);
        bt40.setOnClickListener(myOnClickListener);




    }}