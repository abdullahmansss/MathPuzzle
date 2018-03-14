package com.example.abdullah_mansour.mathpuzzle;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage1;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage2;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage3;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage4;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage5;
import com.example.abdullah_mansour.mathpuzzle.Trophies.Trophy1;

public class Puzzles extends AppCompatActivity {
    private Button stage1,stage2,stage3,stage4,stage5;
    private MediaPlayer mp;
    private static int TIME_OUT = 700;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzles);

        stage1 = (Button) findViewById(R.id.stage_1);
        stage2 = (Button) findViewById(R.id.stage_2);
        stage3 = (Button) findViewById(R.id.stage_3);
        stage4 = (Button) findViewById(R.id.stage_4);
        stage5 = (Button) findViewById(R.id.stage_5);

        Context context = Puzzles.this;
        SharedPreferences sharedPref = context.getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        int highScore = sharedPref.getInt(getString(R.string.saved_high_score_key), 0);

        if (highScore == 1)
        {
            stage2.setText("2");
            stage2.setBackgroundResource(R.drawable.image);
            stage2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_2));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage2.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });
        }

        if (highScore == 2)
        {
            stage2.setText("2");
            stage2.setBackgroundResource(R.drawable.image);
            stage2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_2));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage2.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });

            stage3.setText("3");
            stage3.setBackgroundResource(R.drawable.image);
            stage3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_3));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage3.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });
        }

        if (highScore == 3)
        {
            stage2.setText("2");
            stage2.setBackgroundResource(R.drawable.image);
            stage2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_2));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage2.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });

            stage3.setText("3");
            stage3.setBackgroundResource(R.drawable.image);
            stage3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_3));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage3.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });

            stage4.setText("4");
            stage4.setBackgroundResource(R.drawable.image);
            stage4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_4));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage4.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });
        }

        if (highScore == 4)
        {
            stage2.setText("2");
            stage2.setBackgroundResource(R.drawable.image);
            stage2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_2));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage2.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });

            stage3.setText("3");
            stage3.setBackgroundResource(R.drawable.image);
            stage3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_3));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage3.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });

            stage4.setText("4");
            stage4.setBackgroundResource(R.drawable.image);
            stage4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_4));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage4.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });

            stage5.setText("4");
            stage5.setBackgroundResource(R.drawable.image);
            stage5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_5));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage5.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });
        }

        if (highScore == 4)
        {
            stage2.setText("2");
            stage2.setBackgroundResource(R.drawable.image);
            stage2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_2));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage2.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });

            stage3.setText("3");
            stage3.setBackgroundResource(R.drawable.image);
            stage3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_3));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage3.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });

            stage4.setText("4");
            stage4.setBackgroundResource(R.drawable.image);
            stage4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_4));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage4.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });

            stage5.setText("5");
            stage5.setBackgroundResource(R.drawable.image);
            stage5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_5));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage5.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });
        }

        if (highScore == 5)
        {
            stage2.setText("2");
            stage2.setBackgroundResource(R.drawable.image);
            stage2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_2));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage2.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });

            stage3.setText("3");
            stage3.setBackgroundResource(R.drawable.image);
            stage3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_3));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage3.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });

            stage4.setText("4");
            stage4.setBackgroundResource(R.drawable.image);
            stage4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_4));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage4.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });

            stage5.setText("5");
            stage5.setBackgroundResource(R.drawable.image);
            stage5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_5));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage5.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });

            stage5.setText("5");
            stage5.setBackgroundResource(R.drawable.image);
            stage5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                    mp.start();

                    YoYo.with(Techniques.Tada)
                            .duration(1000)
                            .playOn(findViewById(R.id.stage_5));

                    final View myLayout = findViewById(R.id.puzzleslayout);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent i = new Intent(Puzzles.this, Stage5.class);
                            startActivity(i);
                        }
                    }, TIME_OUT);
                }
            });
        }




        stage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_1));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Puzzles.this, Stage1.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        /*stage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_2));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Puzzles.this, Stage2.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_3));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Puzzles.this, Stage3.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_4));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Puzzles.this, Stage4.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });

        stage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(Puzzles.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.stage_5));

                final View myLayout = findViewById(R.id.puzzleslayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(Puzzles.this, Stage5.class);
                        startActivity(i);
                    }
                }, TIME_OUT);
            }
        });*/
    }

    @Override
    public void onBackPressed() {
        Intent n = new Intent(Puzzles.this, MainActivity.class);
        startActivity(n);
    }
}
