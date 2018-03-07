package com.example.abdullah_mansour.mathpuzzle.Trophies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.abdullah_mansour.mathpuzzle.MainActivity;
import com.example.abdullah_mansour.mathpuzzle.R;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage2;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage5;

public class Trophy4 extends AppCompatActivity {
    private TextView contin,mainmenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trophy4);

        contin = (TextView) findViewById(R.id.contin_btn);
        mainmenu = (TextView) findViewById(R.id.main_menu_btn);

        contin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Trophy4.this, Stage5.class);
                startActivity(n);
            }
        });

        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Trophy4.this, MainActivity.class);
                startActivity(n);
            }
        });
    }
}
