package com.example.abdullah_mansour.mathpuzzle;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Beginners;
import com.example.abdullah_mansour.mathpuzzle.Intermediate.Intermediate;

public class MainActivity extends AppCompatActivity {
    private Button beginners,intermediate;
    private TextView advanced,expert;
    private MediaPlayer mp;
    private ImageView exit,info,interlock,expertlock;
    private static int TIME_OUT = 700; //Time to launch the another activity


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beginners = (Button) findViewById(R.id.beginners_btn);
        intermediate = (Button) findViewById(R.id.intermediate_btn);
        advanced = (TextView) findViewById(R.id.advanced_btn);
        expert = (TextView) findViewById(R.id.expert_btn);
        exit = (ImageView) findViewById(R.id.exit_btn);
        info = (ImageView) findViewById(R.id.info_btn);
        interlock = (ImageView) findViewById(R.id.interlock);
        expertlock = (ImageView) findViewById(R.id.expertlock);

        //advanced.setPaintFlags(advanced.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        //expert.setPaintFlags(expert.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);



        Context context = MainActivity.this;
        SharedPreferences sharedPref = context.getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        int highScore = sharedPref.getInt(getString(R.string.saved_high_score_key), 0);

        SharedPreferences sharedPref2 = context.getSharedPreferences(getString(R.string.intermediatelevel), Context.MODE_PRIVATE);

        int highScore2 = sharedPref2.getInt(getString(R.string.intermediatehighscore), 0);

        YoYo.with(Techniques.FadeInDown)
                .duration(1500)
                .playOn(findViewById(R.id.appname));

        YoYo.with(Techniques.FadeInDown)
                .duration(2500)
                .playOn(findViewById(R.id.beginners_btn));

        YoYo.with(Techniques.FadeInDown)
                .duration(3500)
                .playOn(findViewById(R.id.intermediate_btn));

        YoYo.with(Techniques.FadeInDown)
                .duration(4500)
                .playOn(findViewById(R.id.advanced_btn));

        YoYo.with(Techniques.FadeInDown)
                .duration(4500)
                .playOn(findViewById(R.id.interlock));

        YoYo.with(Techniques.FadeInDown)
                .duration(5500)
                .playOn(findViewById(R.id.expert_btn));

        YoYo.with(Techniques.FadeInDown)
                .duration(5500)
                .playOn(findViewById(R.id.expertlock));

        YoYo.with(Techniques.FadeInDown)
                .duration(5500)
                .playOn(findViewById(R.id.exit_btn));

        YoYo.with(Techniques.FadeInDown)
                .duration(5500)
                .playOn(findViewById(R.id.info_btn));

        if (highScore == 0)
        {
            beginners.setText(R.string.beggin0);
        }

        if (highScore == 1)
        {
            beginners.setText(R.string.beggin1);
        }

        if (highScore == 2)
        {
            beginners.setText(R.string.beggin2);
        }

        if (highScore == 3)
        {
            beginners.setText(R.string.beggin3);
        }

        if (highScore == 4)
        {
            beginners.setText(R.string.beggin4);
        }

        if (highScore == 5)
        {
            beginners.setText(R.string.beggin5);
        }

        if (highScore == 6)
        {
            beginners.setText(R.string.beggin6);
        }

        if (highScore == 7)
        {
            beginners.setText(R.string.beggin7);
        }

        if (highScore == 8)
        {
            beginners.setText(R.string.beggin8);
        }

        if (highScore == 9)
        {
            beginners.setText(R.string.beggin9);
        }

        if (highScore == 10)
        {
            beginners.setText(R.string.beggin10);
        }

        if (highScore == 11)
        {
            beginners.setText(R.string.beggin11);
        }

        if (highScore == 12)
        {
            beginners.setText(R.string.beggin12);
        }

        if (highScore == 13)
        {
            beginners.setText(R.string.beggin13);
        }

        if (highScore == 14)
        {
            beginners.setText(R.string.beggin14);
        }

        if (highScore == 15)
        {
            beginners.setText(R.string.beggin15);
        }

        if (highScore == 16)
        {
            beginners.setText(R.string.beggin16);
        }

        if (highScore == 17)
        {
            beginners.setText(R.string.beggin17);
        }

        if (highScore == 18)
        {
            beginners.setText(R.string.beggin18);
        }

        if (highScore == 19)
        {
            beginners.setText(R.string.beggin19);
        }

        if (highScore == 20)
        {
            beginners.setText(R.string.beggin20);
        }

        // intermediate
        if (highScore2 == 0)
        {
            intermediate.setText(R.string.inter0);
        }

        if (highScore2 == 1)
        {
            intermediate.setText(R.string.inter1);
        }

        if (highScore2 == 2)
        {
            intermediate.setText(R.string.inter2);
        }

        if (highScore2 == 3)
        {
            intermediate.setText(R.string.inter3);
        }

        if (highScore2 == 4)
        {
            intermediate.setText(R.string.inter4);
        }

        if (highScore2 == 5)
        {
            intermediate.setText(R.string.inter5);
        }

        if (highScore2 == 6)
        {
            intermediate.setText(R.string.inter6);
        }

        if (highScore2 == 7)
        {
            intermediate.setText(R.string.inter7);
        }

        if (highScore2 == 8)
        {
            intermediate.setText(R.string.inter8);
        }

        if (highScore2 == 9)
        {
            intermediate.setText(R.string.inter9);
        }

        if (highScore2 == 10)
        {
            intermediate.setText(R.string.inter10);
        }

        if (highScore2 == 11)
        {
            intermediate.setText(R.string.inter11);
        }

        if (highScore2 == 12)
        {
            intermediate.setText(R.string.inter12);
        }

        if (highScore2 == 13)
        {
            intermediate.setText(R.string.inter13);
        }

        if (highScore2 == 14)
        {
            intermediate.setText(R.string.inter14);
        }

        if (highScore2 == 15)
        {
            intermediate.setText(R.string.inter15);
        }

        if (highScore2 == 16)
        {
            intermediate.setText(R.string.inter16);
        }

        if (highScore2 == 17)
        {
            intermediate.setText(R.string.inter17);
        }

        if (highScore2 == 18)
        {
            intermediate.setText(R.string.inter18);
        }

        if (highScore2 == 19)
        {
            intermediate.setText(R.string.inter19);
        }

        if (highScore2 == 20)
        {
            intermediate.setText(R.string.inter20);
        }

        beginners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.beginners_btn));

                final View myLayout = findViewById(R.id.mainmenulayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(MainActivity.this, Beginners.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.intermediate_btn));

                final View myLayout = findViewById(R.id.mainmenulayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(MainActivity.this, Intermediate.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                mp = MediaPlayer.create(MainActivity.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.exit_btn));

                final View myLayout = findViewById(R.id.mainmenulayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        new AlertDialog.Builder(MainActivity.this)
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
                }, TIME_OUT);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                mp = MediaPlayer.create(MainActivity.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.info_btn));
                final View myLayout = findViewById(R.id.mainmenulayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        /*String subject = "Explain About App (Einstein World)";

                        Intent i = new Intent(Intent.ACTION_SEND);
                        i.setType("message/rfc822");
                        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"abdallahmansss@gmail.com"});
                        i.putExtra(Intent.EXTRA_SUBJECT, subject);
                        //i.putExtra(Intent.EXTRA_TEXT   , "body of email");
                        try {
                            startActivity(Intent.createChooser(i, "Send mail ..."));
                        } catch (android.content.ActivityNotFoundException ex) {
                            Toast.makeText(MainActivity.this, "There are no email clients installed", Toast.LENGTH_SHORT).show();
                        }*/

                        Intent n = new Intent(MainActivity.this, AboutUs.class);
                        startActivity(n);
                    }
                }, TIME_OUT);
            }
        });




        /*puzzles_btn.setOnClickListener(new View.OnClickListener() {
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
                        Intent i = new Intent(MainActivity.this, Beginners.class);
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
        });*/
    }

    @Override
    public void onBackPressed() {
        /*new AlertDialog.Builder(this)
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
                .show();*/
    }
}
