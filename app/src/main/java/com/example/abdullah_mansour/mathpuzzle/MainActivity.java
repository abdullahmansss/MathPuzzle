package com.example.abdullah_mansour.mathpuzzle;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage1;
import com.example.abdullah_mansour.mathpuzzle.Trophies.Trophy1;

public class MainActivity extends AppCompatActivity {
    private Button new_btn,puzzles_btn;
    private MediaPlayer mp;
    private static int TIME_OUT = 700; //Time to launch the another activity


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new_btn = (Button) findViewById(R.id.newgame_btn);
        puzzles_btn = (Button) findViewById(R.id.quiz_btn);


        YoYo.with(Techniques.FadeInDown)
                .duration(1500)
                .playOn(findViewById(R.id.appname));

        YoYo.with(Techniques.FadeInDown)
                .duration(3000)
                .playOn(findViewById(R.id.newgame_btn));

        YoYo.with(Techniques.FadeInDown)
                .duration(3000)
                .playOn(findViewById(R.id.quiz_btn));

        puzzles_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.quiz_btn));

                final View myLayout = findViewById(R.id.mainmenulayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(MainActivity.this, Puzzles.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        new_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.newgame_btn));

                final View myLayout = findViewById(R.id.mainmenulayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Snackbar.make(view, "New Game", Snackbar.LENGTH_LONG).show();

                    }
                }, TIME_OUT);
            }
        });
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit game ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                    public void onClick(DialogInterface dialog, int id) {
                        finishAffinity();
                        System.exit(0);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
