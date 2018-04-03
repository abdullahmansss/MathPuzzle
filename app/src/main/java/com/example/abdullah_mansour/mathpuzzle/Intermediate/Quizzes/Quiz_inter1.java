package com.example.abdullah_mansour.mathpuzzle.Intermediate.Quizzes;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Beginners;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn12;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Trophies.Trophy_bgn12;
import com.example.abdullah_mansour.mathpuzzle.Intermediate.Trophies.Trophy_inter1;
import com.example.abdullah_mansour.mathpuzzle.R;

public class Quiz_inter1 extends AppCompatActivity {
    private TextView numberstext,hinttext,coinstext;
    private ImageView idea;
    private Button submit,delete;
    private Button number0,number1,number2,number3,number4,number5,number6,number7,number8,number9,minus,dot;
    private MediaPlayer mp;
    private static int TIME_OUT = 500;

    boolean isFabOpen = false;

    final Context context = Quiz_inter1.this;

    // By Abdullah-Mansour 3/4/2018


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_inter1);


        numberstext = (TextView) findViewById(R.id.numberstext);
        number0 = (Button) findViewById(R.id.number0);
        number1 = (Button) findViewById(R.id.number1);
        number2 = (Button) findViewById(R.id.number2);
        number3 = (Button) findViewById(R.id.number3);
        number4 = (Button) findViewById(R.id.number4);
        number5 = (Button) findViewById(R.id.number5);
        number6 = (Button) findViewById(R.id.number6);
        number7 = (Button) findViewById(R.id.number7);
        number8 = (Button) findViewById(R.id.number8);
        number9 = (Button) findViewById(R.id.number9);
        minus = (Button) findViewById(R.id.minus);
        dot = (Button) findViewById(R.id.dot);

        delete = (Button) findViewById(R.id.deletetext);
        submit = (Button) findViewById(R.id.submit_btn);

        idea = (ImageView) findViewById(R.id.idea_btn);
        hinttext = (TextView) findViewById(R.id.hinttext);
        coinstext = (TextView) findViewById(R.id.coins);


        final SharedPreferences sharedPref = context.getSharedPreferences(getString(R.string.intermediatecoins), Context.MODE_PRIVATE);

        final int highScore = sharedPref.getInt(getString(R.string.intermediatecoinscore), 0);

        final SharedPreferences.Editor editor = sharedPref.edit();


        coinstext.setText("" + highScore);

        numberstext.setText(" ");

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(findViewById(R.id.deletetext));
                numberstext.setText(" ");
            }
        });

        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(findViewById(R.id.number0));
                numberstext.setText(numberstext.getText() + "0");
            }
        });

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(findViewById(R.id.number1));
                numberstext.setText(numberstext.getText() + "1");
            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(findViewById(R.id.number2));
                numberstext.setText(numberstext.getText() + "2");
            }
        });

        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(findViewById(R.id.number3));
                numberstext.setText(numberstext.getText() + "3");
            }
        });

        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(findViewById(R.id.number4));
                numberstext.setText(numberstext.getText() + "4");
            }
        });

        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(findViewById(R.id.number5));
                numberstext.setText(numberstext.getText() + "5");
            }
        });

        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(findViewById(R.id.number6));
                numberstext.setText(numberstext.getText() + "6");
            }
        });

        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(findViewById(R.id.number7));
                numberstext.setText(numberstext.getText() + "7");
            }
        });

        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(findViewById(R.id.number8));
                numberstext.setText(numberstext.getText() + "8");
            }
        });

        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(findViewById(R.id.number9));
                numberstext.setText(numberstext.getText() + "9");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(findViewById(R.id.minus));
                numberstext.setText(numberstext.getText() + "-");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mp = MediaPlayer.create(context, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .playOn(findViewById(R.id.dot));
                numberstext.setText(numberstext.getText() + ".");
            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numberstext.getText().toString().equals(" 7"))
                {
                    if (highScore <= 1)
                    {
                        final int highScore4 = sharedPref.getInt(getString(R.string.intermediatecoinscore), 0);

                        editor.putInt(getString(R.string.intermediatecoinscore), highScore4 + 1);
                        editor.commit();
                    }

                    releaseMediaPlayer();

                    mp = MediaPlayer.create(context, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(500)
                            .playOn(findViewById(R.id.submit_btn));

                    final View myLayout = findViewById(R.id.insidestage1);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(context, Trophy_inter1.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
                else
                {
                    releaseMediaPlayer();

                    mp = MediaPlayer.create(context, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(500)
                            .playOn(findViewById(R.id.submit_btn));

                    Snackbar.make(view, "Wrong Answer, Please Try Again", Snackbar.LENGTH_LONG).show();
                    numberstext.setText(" ");
                }
            }
        });

        idea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.open);
                Animation fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.close);

                if (highScore >= 2) {
                    int id = view.getId();
                    switch (id) {
                        case R.id.idea_btn:

                            if (isFabOpen) {

                                YoYo.with(Techniques.Bounce)
                                        .duration(1000)
                                        .playOn(findViewById(R.id.idea_btn));
                                hinttext.startAnimation(fab_close);

                                hinttext.setClickable(false);

                                isFabOpen = false;
                                Log.d("Raj", "close");

                            } else {
                                // Flash, Pulse, RubberBand, Shake, Swing, Wobble, Bounce, Tada, StandUp, Wave
                                YoYo.with(Techniques.Bounce)
                                        .duration(1000)
                                        .repeat(1)
                                        .playOn(findViewById(R.id.idea_btn));

                                releaseMediaPlayer();

                                mp = MediaPlayer.create(context, R.raw.idea);
                                mp.start();

                                editor.putInt(getString(R.string.intermediatecoinscore), highScore - 2);
                                editor.commit();

                                final int highScore3 = sharedPref.getInt(getString(R.string.intermediatecoinscore), 0);

                                coinstext.setText("" + highScore3);

                                hinttext.startAnimation(fab_open);
                                hinttext.setClickable(true);

                                isFabOpen = true;
                                Log.d("Raj", "open");

                            }
                            break;
                    }}
                else
                {
                    YoYo.with(Techniques.Bounce)
                            .duration(1000)
                            .repeat(1)
                            .playOn(findViewById(R.id.idea_btn));

                    releaseMediaPlayer();

                    mp = MediaPlayer.create(context, R.raw.idea);
                    mp.start();

                    Snackbar.make(view, "You Don't Have Enough Coins", Snackbar.LENGTH_LONG).show();
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
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit quiz ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent n = new Intent(context, Beginners.class);
                        startActivity(n);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}