package com.example.abdullah_mansour.mathpuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.abdullah_mansour.mathpuzzle.Stages.Stage1;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage2;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage3;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage4;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage5;

public class Puzzles extends AppCompatActivity {
    private TextView stage1,stage2,stage3,stage4,stage5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzles);

        stage1 = (TextView) findViewById(R.id.stage_1);
        stage2 = (TextView) findViewById(R.id.stage_2);
        stage3 = (TextView) findViewById(R.id.stage_3);
        stage4 = (TextView) findViewById(R.id.stage_4);
        stage5 = (TextView) findViewById(R.id.stage_5);

        stage2.setVisibility(View.GONE);
        stage3.setVisibility(View.GONE);
        stage4.setVisibility(View.GONE);
        stage5.setVisibility(View.GONE);

        stage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Puzzles.this, Stage1.class);
                startActivity(n);
            }
        });

        stage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Puzzles.this, Stage2.class);
                startActivity(n);
            }
        });

        stage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Puzzles.this, Stage3.class);
                startActivity(n);
            }
        });

        stage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Puzzles.this, Stage4.class);
                startActivity(n);
            }
        });

        stage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Puzzles.this, Stage5.class);
                startActivity(n);
            }
        });
    }

}
