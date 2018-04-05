package com.example.abdullah_mansour.mathpuzzle;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class AboutUs extends AppCompatActivity {
    private ImageView facebook,mail;
    private static int TIME_OUT = 700; //Time to launch the another activity
    private MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        facebook = (ImageView) findViewById(R.id.facebook);
        mail = (ImageView) findViewById(R.id.mail);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp = MediaPlayer.create(AboutUs.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.facebook));
                final View myLayout = findViewById(R.id.mainmenulayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/abdullahmanss")));
                        }
                        catch (ActivityNotFoundException e)
                        {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/abdullahmanss")));
                        }
                    }
                }, TIME_OUT);

            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp = MediaPlayer.create(AboutUs.this, R.raw.click);
                mp.start();

                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .playOn(findViewById(R.id.mail));
                final View myLayout = findViewById(R.id.mainmenulayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        String subject = "Explain About App (Einstein World)";

                        Intent i = new Intent(Intent.ACTION_SEND);
                        i.setType("message/rfc822");
                        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"abdallahmansss@gmail.com"});
                        i.putExtra(Intent.EXTRA_SUBJECT, subject);
                        //i.putExtra(Intent.EXTRA_TEXT   , "body of email");
                        try {
                            startActivity(Intent.createChooser(i, "Send mail ..."));
                        } catch (android.content.ActivityNotFoundException ex) {
                            Toast.makeText(AboutUs.this, "There are no email clients installed", Toast.LENGTH_SHORT).show();
                        }
                    }
                }, TIME_OUT);
            }
        });
    }
}
