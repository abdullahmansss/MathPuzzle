package com.example.abdullah_mansour.mathpuzzle.Trophies;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.*;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.*;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.abdullah_mansour.mathpuzzle.MainActivity;
import com.example.abdullah_mansour.mathpuzzle.Puzzles;
import com.example.abdullah_mansour.mathpuzzle.R;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage2;


public class Trophy1 extends AppCompatActivity {
    private TextView contin,mainmenu;
    private ImageView share,rate,continu,main;
    private RelativeLayout trophy;
    private MediaPlayer mp;
    private static int TIME_OUT = 700; //Time to launch the another activity



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trophy1);

        contin = (TextView) findViewById(R.id.contin_btn);
        mainmenu = (TextView) findViewById(R.id.main_menu_btn);
        share = (ImageView) findViewById(R.id.share_btn);
        rate = (ImageView) findViewById(R.id.rate_btn);
        trophy = (RelativeLayout) findViewById(R.id.trophy1);
        continu = (ImageView) findViewById(R.id.contin_image);
        main = (ImageView) findViewById(R.id.main_menu_image);

        mp = MediaPlayer.create(Trophy1.this, R.raw.clapping);
        mp.start();

        YoYo.with(Techniques.FadeInDown)
                .duration(2500)
                .playOn(findViewById(R.id.trophy1));

        contin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.continlayout));

                final View myLayout = findViewById(R.id.trophy1layout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Trophy1.this, Stage2.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        continu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.continlayout));

                final View myLayout = findViewById(R.id.trophy1layout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Trophy1.this, Stage2.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.trophy1mainmenu));

                final View myLayout = findViewById(R.id.trophy1layout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Trophy1.this, MainActivity.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.trophy1mainmenu));

                final View myLayout = findViewById(R.id.trophy1layout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Trophy1.this, MainActivity.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Intent.ACTION_SEND);
                n.setType("text/plain");
                String sharebody = "I Completed Quiz 1 in Math Quiz Game";
                n.putExtra(Intent.EXTRA_TEXT, sharebody);
                startActivity(Intent.createChooser(n, "Share Using"));
            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/abdullahmanss")));
                }
                catch (ActivityNotFoundException e)
                {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/abdullahmanss")));
                }
            }
        });

    }

    @Override
    protected void onStop() {
        mp.stop();
        super.onStop();
    }

    @Override
    public void onBackPressed() {}

}
