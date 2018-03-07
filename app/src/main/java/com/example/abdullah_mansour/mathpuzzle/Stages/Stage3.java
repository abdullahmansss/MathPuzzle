package com.example.abdullah_mansour.mathpuzzle.Stages;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.abdullah_mansour.mathpuzzle.R;
import com.example.abdullah_mansour.mathpuzzle.Trophies.Trophy2;
import com.example.abdullah_mansour.mathpuzzle.Trophies.Trophy3;

public class Stage3 extends AppCompatActivity {
    private TextView numberstext;
    private ImageView delete,idea;
    private TextView submit;
    private ImageView number0,number1,number2,number3,number4,number5,number6,number7,number8,number9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage_3);

        numberstext = (TextView) findViewById(R.id.numberstext);
        number0 = (ImageView) findViewById(R.id.number0);
        number1 = (ImageView) findViewById(R.id.number1);
        number2 = (ImageView) findViewById(R.id.number2);
        number3 = (ImageView) findViewById(R.id.number3);
        number4 = (ImageView) findViewById(R.id.number4);
        number5 = (ImageView) findViewById(R.id.number5);
        number6 = (ImageView) findViewById(R.id.number6);
        number7 = (ImageView) findViewById(R.id.number7);
        number8 = (ImageView) findViewById(R.id.number8);
        number9 = (ImageView) findViewById(R.id.number9);
        delete = (ImageView) findViewById(R.id.deletetext);
        submit = (TextView) findViewById(R.id.submit_btn);
        idea = (ImageView) findViewById(R.id.idea_btn);


        numberstext.setText(" ");

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberstext.setText(" ");
            }
        });

        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberstext.setText(numberstext.getText() + "0");
            }
        });

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberstext.setText(numberstext.getText() + "1");
            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberstext.setText(numberstext.getText() + "2");
            }
        });

        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberstext.setText(numberstext.getText() + "3");
            }
        });

        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberstext.setText(numberstext.getText() + "4");
            }
        });

        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberstext.setText(numberstext.getText() + "5");
            }
        });

        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberstext.setText(numberstext.getText() + "6");
            }
        });

        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberstext.setText(numberstext.getText() + "7");
            }
        });

        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberstext.setText(numberstext.getText() + "8");
            }
        });

        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberstext.setText(numberstext.getText() + "9");
            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numberstext.getText().toString().equals(" 16"))
                {
                    Intent n = new Intent(Stage3.this, Trophy3.class);
                    startActivity(n);                }
                else
                {
                    Snackbar.make(view, "Wrong Answer, Please Try Again", Snackbar.LENGTH_LONG).show();
                    numberstext.setText(" ");
                }
            }
        });

        idea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "+ numbers then x", Snackbar.LENGTH_LONG).show();

            }
        });

    }
}
