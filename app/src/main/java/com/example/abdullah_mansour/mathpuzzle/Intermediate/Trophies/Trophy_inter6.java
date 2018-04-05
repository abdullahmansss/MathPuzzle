package com.example.abdullah_mansour.mathpuzzle.Intermediate.Trophies;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Beginners;
import com.example.abdullah_mansour.mathpuzzle.Intermediate.Intermediate;
import com.example.abdullah_mansour.mathpuzzle.MainActivity;
import com.example.abdullah_mansour.mathpuzzle.R;

public class Trophy_inter6 extends AppCompatActivity {
    private Button contin,mainmenu;
    private ImageView share,rate;
    private RelativeLayout trophy;
    private MediaPlayer mp;
    private static int TIME_OUT = 700; //Time to launch the another activity
    Context context = Trophy_inter6.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trophy_inter6);


        contin = (Button) findViewById(R.id.contin_btn);
        mainmenu = (Button) findViewById(R.id.main_menu_btn);
        share = (ImageView) findViewById(R.id.share_btn);
        rate = (ImageView) findViewById(R.id.rate_btn);
        trophy = (RelativeLayout) findViewById(R.id.trophy1);

        SharedPreferences sharedPref = context.getSharedPreferences(getString(R.string.intermediatelevel), Context.MODE_PRIVATE);

        int highScore = sharedPref.getInt(getString(R.string.intermediatehighscore), 0);

        if (highScore < 6)
        {
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putInt(getString(R.string.intermediatehighscore), 6);
            editor.commit();
        }


        releaseMediaPlayer();
        mp = MediaPlayer.create(context, R.raw.clapping);
        mp.start();

        YoYo.with(Techniques.FadeInDown)
                .duration(2500)
                .playOn(findViewById(R.id.trophy1));

        contin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();
                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.contin_btn));

                final View myLayout = findViewById(R.id.trophy1layout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(context, Intermediate.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();
                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.main_menu_btn));

                final View myLayout = findViewById(R.id.trophy1layout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(context, MainActivity.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();
                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

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
                releaseMediaPlayer();
                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

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

    private void releaseMediaPlayer()
    {
        if (mp != null)
        {
            mp.release();
        }
        mp = null;
    }

    @Override
    protected void onStop() {
        mp.stop();
        releaseMediaPlayer();
        super.onStop();
    }

    @Override
    public void onBackPressed() {}

}
