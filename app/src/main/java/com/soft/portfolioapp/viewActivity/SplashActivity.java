package com.soft.portfolioapp.viewActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.soft.portfolioapp.R;

public class SplashActivity extends AppCompatActivity {

    // Time da splash
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        StartAnimations();
        //getSupportActionBar().hide();
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            /*
             * Exibindo splash com um timer.
             */
            @Override
            public void run() {
                // Esse método será executado sempre que o timer acabar
                // E inicia a activity principal

                Intent intent = new Intent(SplashActivity.this, WelcomeActivity.class);
                startActivity(intent);

                //fecha esta activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        LinearLayout l = findViewById(R.id.drawer);
        if (l != null) {
            l.clearAnimation();
            l.startAnimation(anim);
        }

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        LinearLayout iv = findViewById(R.id.LinearLayoutPrincipal);
        if (iv != null) {
            iv.clearAnimation();
            iv.startAnimation(anim);
        }
    }
}