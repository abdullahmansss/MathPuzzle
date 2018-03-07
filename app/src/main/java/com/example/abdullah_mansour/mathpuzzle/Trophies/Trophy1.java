package com.example.abdullah_mansour.mathpuzzle.Trophies;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView.*;
import android.widget.TextView;
import android.widget.TextView.*;

import com.example.abdullah_mansour.mathpuzzle.MainActivity;
import com.example.abdullah_mansour.mathpuzzle.Puzzles;
import com.example.abdullah_mansour.mathpuzzle.R;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage2;


public class Trophy1 extends AppCompatActivity {
    private TextView contin,mainmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trophy1);

        contin = (TextView) findViewById(R.id.contin_btn);
        mainmenu = (TextView) findViewById(R.id.main_menu_btn);

        contin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Trophy1.this, Stage2.class);
                startActivity(n);
            }
        });

        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Trophy1.this, MainActivity.class);
                startActivity(n);
            }
        });

    }

}
