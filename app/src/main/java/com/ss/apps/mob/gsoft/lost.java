package com.ss.apps.mob.gsoft;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class lost extends Activity {



    public TextView highScore;
    public TextView currentScore;
    public TextView lost;
    public TextView But;
    public TextView awesome;
    private InterstitialAd mInterstitialAd;

    public Button home_btn;
    public Button again_btn;

    public int count = 0;

    public Button again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lost);

        LoadPreferences_language();


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4535591501425706/5189771568");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if(count == 0) {
                    mInterstitialAd.show();
                }
            }
        });


        SharedPreferences prefs = getSharedPreferences("Shared Score", MODE_PRIVATE);

        int restoredScore = prefs.getInt("score", 0);

        highScore = (TextView) findViewById(R.id.highScore);
        currentScore = (TextView) findViewById(R.id.CurrentScore);
        lost = (TextView) findViewById(R.id.lost);
        But = (TextView) findViewById(R.id.but);
        awesome = (TextView) findViewById(R.id.awesome);


        again = (Button) findViewById(R.id.again_btn);


        int score = getIntent().getExtras().getInt("Score", 0);
        currentScore.setText("Score: " + Integer.toString(score));


        if (score > restoredScore) {
            highScore.setText("High Score: " + Integer.toString(score));
            SharedPreferences.Editor editor = getSharedPreferences("Shared Score", MODE_PRIVATE).edit();
            editor.putInt("score", score);
            editor.apply();
        } else {
            highScore.setText("High Score: " + Integer.toString(restoredScore));
        }
        if(score > restoredScore){
            SavePreferences(score);
        }else {
            SavePreferences(restoredScore);
        }



    }

    public void onBackPressed() {
    }

    public void onAgain(View v) {

        startActivity(new Intent(getApplicationContext(), Main.class));
        Main.score = 0;

        count = 1;

    }

    public void on_Home_pressed(View v) {
        startActivity(new Intent(lost.this, mods.class));

        count = 1;
    }

    public void SavePreferences(int value){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("High score Level 1", String.valueOf(value));
        editor.commit();
    }

    private void LoadPreferences_language(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String  language = sharedPreferences.getString("Language", "eng");

        lost = (TextView) findViewById(R.id.lost);
        But = (TextView) findViewById(R.id.but);
        awesome = (TextView) findViewById(R.id.awesome);

        home_btn = (Button) findViewById(R.id.home_btn);
        again_btn = (Button) findViewById(R.id.again_btn);

        switch(language){
            case "eng":
                lost.setText("You lost");
                But.setText("But you played very well");
                awesome.setText("It was really awesome!");

                home_btn.setText("Back");
                again_btn.setText("Again");
                break;
            case "rus":
                lost.setText("Вы проиграли");
                But.setText("Но ты отлично сыграл");
                awesome.setText("Это было потрясающе!");

                home_btn.setText("Назад");
                again_btn.setText("Опять");
                break;
            case "arm":
                lost.setText("Դուք պարտվեցիք");
                But.setText("Բայց դու շատ լավ Խաղացիր");
                awesome.setText("Դա հիասքանչ էր");

                home_btn.setText("Հետ");
                again_btn.setText("Կրկին");
                break;
        }

    }


}
