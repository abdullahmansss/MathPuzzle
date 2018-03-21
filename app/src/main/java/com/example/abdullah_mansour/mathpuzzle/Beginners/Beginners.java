package com.example.abdullah_mansour.mathpuzzle.Beginners;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn10;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn11;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn12;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn13;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn14;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn15;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn16;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn17;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn18;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn19;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn20;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn6;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn7;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn8;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn9;
import com.example.abdullah_mansour.mathpuzzle.MainActivity;
import com.example.abdullah_mansour.mathpuzzle.R;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn1;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn2;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn3;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn4;
import com.example.abdullah_mansour.mathpuzzle.Beginners.Quizzes.Quiz_bgn5;

public class Beginners extends AppCompatActivity {
    private Button stage1,
            stage2,
            stage3,
            stage4,
            stage5,
            stage6,
            stage7,
            stage8,
            stage9,
            stage10,
            stage11,
            stage12,
            stage13,
            stage14,
            stage15,
            stage16,
            stage17,
            stage18,
            stage19,
            stage20;
    private MediaPlayer mp;
    private static int TIME_OUT = 700;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginners);

        stage1  = (Button) findViewById(R.id.stage_1);
        stage2  = (Button) findViewById(R.id.stage_2);
        stage3  = (Button) findViewById(R.id.stage_3);
        stage4  = (Button) findViewById(R.id.stage_4);
        stage5  = (Button) findViewById(R.id.stage_5);
        stage6  = (Button) findViewById(R.id.stage_6);
        stage7  = (Button) findViewById(R.id.stage_7);
        stage8  = (Button) findViewById(R.id.stage_8);
        stage9  = (Button) findViewById(R.id.stage_9);
        stage10 = (Button) findViewById(R.id.stage_10);
        stage11 = (Button) findViewById(R.id.stage_11);
        stage12 = (Button) findViewById(R.id.stage_12);
        stage13 = (Button) findViewById(R.id.stage_13);
        stage14 = (Button) findViewById(R.id.stage_14);
        stage15 = (Button) findViewById(R.id.stage_15);
        stage16 = (Button) findViewById(R.id.stage_16);
        stage17 = (Button) findViewById(R.id.stage_17);
        stage18 = (Button) findViewById(R.id.stage_18);
        stage19 = (Button) findViewById(R.id.stage_19);
        stage20 = (Button) findViewById(R.id.stage_20);


        stage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_1));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn1.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_2));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn2.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_3));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn3.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_4));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn4.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_5));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn5.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_6));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn6.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_7));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn7.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_8));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn8.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_9));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn9.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_10));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn10.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_11));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn11.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_12));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn12.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_13));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn13.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_14));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn14.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_15));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn15.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_16));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn16.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_17));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn17.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_18));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn18.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_19));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn19.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Beginners.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_20));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Beginners.this, Quiz_bgn20.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage2.setClickable(false);
        stage3.setClickable(false);
        stage4.setClickable(false);
        stage5.setClickable(false);
        stage6.setClickable(false);
        stage7.setClickable(false);
        stage8.setClickable(false);
        stage9.setClickable(false);
        stage10.setClickable(false);
        stage11.setClickable(false);
        stage12.setClickable(false);
        stage13.setClickable(false);
        stage14.setClickable(false);
        stage15.setClickable(false);
        stage16.setClickable(false);
        stage17.setClickable(false);
        stage18.setClickable(false);
        stage19.setClickable(false);
        stage20.setClickable(false);


        Context context = Beginners.this;
        SharedPreferences sharedPref = context.getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        int highScore = sharedPref.getInt(getString(R.string.saved_high_score_key), 0);


        if (highScore == 1)
        {
            change_quiz2();
            stage2.setClickable(true);
        }

        if (highScore == 2)
        {
            change_quiz2();
            change_quiz3();
            stage2.setClickable(true);
            stage3.setClickable(true);
        }

        if (highScore == 3)
        {
            change_quiz2();
            change_quiz3();
            change_quiz4();
            stage2.setClickable(true);
            stage3.setClickable(true);
            stage4.setClickable(true);
        }

        if (highScore == 4)
        {
            change_quiz2();
            change_quiz3();
            change_quiz4();
            change_quiz5();
            stage2.setClickable(true);
            stage3.setClickable(true);
            stage4.setClickable(true);
            stage5.setClickable(true);
        }

        if (highScore == 5)
        {
            change_quiz2();
            change_quiz3();
            change_quiz4();
            change_quiz5();
            change_quiz6();
            stage2.setClickable(true);
            stage3.setClickable(true);
            stage4.setClickable(true);
            stage5.setClickable(true);
            stage6.setClickable(true);
        }

        if (highScore == 6)
        {
            change_quiz2();
            change_quiz3();
            change_quiz4();
            change_quiz5();
            change_quiz6();
            change_quiz7();
            stage2.setClickable(true);
            stage3.setClickable(true);
            stage4.setClickable(true);
            stage5.setClickable(true);
            stage6.setClickable(true);
            stage7.setClickable(true);
        }

        if (highScore == 7)
        {
            change_quiz2();
            change_quiz3();
            change_quiz4();
            change_quiz5();
            change_quiz6();
            change_quiz7();
            change_quiz8();
            stage2.setClickable(true);
            stage3.setClickable(true);
            stage4.setClickable(true);
            stage5.setClickable(true);
            stage6.setClickable(true);
            stage7.setClickable(true);
            stage8.setClickable(true);
        }

        if (highScore == 8)
        {
            change_quiz2();
            change_quiz3();
            change_quiz4();
            change_quiz5();
            change_quiz6();
            change_quiz7();
            change_quiz8();
            change_quiz9();
            stage2.setClickable(true);
            stage3.setClickable(true);
            stage4.setClickable(true);
            stage5.setClickable(true);
            stage6.setClickable(true);
            stage7.setClickable(true);
            stage8.setClickable(true);
            stage9.setClickable(true);
        }

        if (highScore == 9)
        {
            change_quiz2();
            change_quiz3();
            change_quiz4();
            change_quiz5();
            change_quiz6();
            change_quiz7();
            change_quiz8();
            change_quiz9();
            change_quiz10();
            stage2.setClickable(true);
            stage3.setClickable(true);
            stage4.setClickable(true);
            stage5.setClickable(true);
            stage6.setClickable(true);
            stage7.setClickable(true);
            stage8.setClickable(true);
            stage9.setClickable(true);
            stage10.setClickable(true);
        }

        if (highScore == 10)
        {
            change_quiz2();
            change_quiz3();
            change_quiz4();
            change_quiz5();
            change_quiz6();
            change_quiz7();
            change_quiz8();
            change_quiz9();
            change_quiz10();
            change_quiz11();
            stage2.setClickable(true);
            stage3.setClickable(true);
            stage4.setClickable(true);
            stage5.setClickable(true);
            stage6.setClickable(true);
            stage7.setClickable(true);
            stage8.setClickable(true);
            stage9.setClickable(true);
            stage10.setClickable(true);
            stage11.setClickable(true);
        }

        if (highScore == 11)
        {
            change_quiz2();
            change_quiz3();
            change_quiz4();
            change_quiz5();
            change_quiz6();
            change_quiz7();
            change_quiz8();
            change_quiz9();
            change_quiz10();
            change_quiz11();
            stage2.setClickable(true);
            stage3.setClickable(true);
            stage4.setClickable(true);
            stage5.setClickable(true);
            stage6.setClickable(true);
            stage7.setClickable(true);
            stage8.setClickable(true);
            stage9.setClickable(true);
            stage10.setClickable(true);
            stage11.setClickable(true);
        }
    }

    public void change_quiz2()
    {
        stage2.setText("2");
        stage2.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz3()
    {
        stage3.setText("3");
        stage3.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz4()
    {
        stage4.setText("4");
        stage4.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz5()
    {
        stage5.setText("5");
        stage5.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz6()
    {
        stage6.setText("6");
        stage6.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz7()
    {
        stage7.setText("7");
        stage7.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz8()
    {
        stage8.setText("8");
        stage8.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz9()
    {
        stage9.setText("9");
        stage9.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz10()
    {
        stage10.setText("10");
        stage10.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz11()
    {
        stage11.setText("11");
        stage11.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz12()
    {
        stage12.setText("12");
        stage12.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz13()
    {
        stage13.setText("13");
        stage13.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz14()
    {
        stage14.setText("14");
        stage14.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz15()
    {
        stage15.setText("15");
        stage15.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz16()
    {
        stage16.setText("16");
        stage16.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz17()
    {
        stage17.setText("17");
        stage17.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz18()
    {
        stage18.setText("18");
        stage18.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz19()
    {
        stage19.setText("19");
        stage19.setBackgroundResource(R.drawable.image);
    }

    public void change_quiz20()
    {
        stage20.setText("20");
        stage20.setBackgroundResource(R.drawable.image);
    }

    @Override
    public void onBackPressed() {
        Intent n = new Intent(Beginners.this, MainActivity.class);
        startActivity(n);
    }
}
