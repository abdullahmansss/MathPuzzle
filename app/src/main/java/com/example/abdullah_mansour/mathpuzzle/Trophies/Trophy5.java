package com.example.abdullah_mansour.mathpuzzle.Trophies;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.abdullah_mansour.mathpuzzle.MainActivity;
import com.example.abdullah_mansour.mathpuzzle.R;
import com.example.abdullah_mansour.mathpuzzle.Stages.Stage2;

public class Trophy5 extends AppCompatActivity {
    private TextView contin,mainmenu;
    private ImageView share,rate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trophy5);

        contin = (TextView) findViewById(R.id.contin_btn);
        mainmenu = (TextView) findViewById(R.id.main_menu_btn);
        share = (ImageView) findViewById(R.id.share_btn);
        rate = (ImageView) findViewById(R.id.rate_btn);

        contin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Stage 6", Snackbar.LENGTH_LONG).show();
            }
        });

        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Trophy5.this, MainActivity.class);
                startActivity(n);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(Intent.ACTION_SEND);
                n.setType("text/plain");
                String sharebody = "I Completed Quiz 5 in Math Quiz Game";
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
}
