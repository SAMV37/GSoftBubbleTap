package com.ss.apps.mob.gsoft;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

public class start extends Activity {

    public Button start_btn;
    public Button share_btn;
    public Button rate_btn;
    public Button mod_btn;
    public Button lang_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        LoadPreferences_language();

    }
    public void onStart(View v){
        startActivity(new Intent(getApplicationContext(), mods.class));
    }
    public void onShare(View v){


        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        share.putExtra(Intent.EXTRA_SUBJECT, "Bubble Tap");
        String applink = "https://play.google.com/store/apps/details?id=com.ss.apps.mob.gsoft&hl=en";
        share.putExtra(Intent.EXTRA_TEXT, "Try new app: " + applink);
        startActivity(Intent.createChooser(share, "Share via"));
    }
    public void onRate(View v){
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market//details?id=com.ss.apps.mob.gsoft&hl=en")));

        }catch(ActivityNotFoundException ae){
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=com.ss.apps.mob.gsoft&hl=en")));
        }

    }
    public void on_mods(View v) {
        startActivity(new Intent(getApplicationContext(), mods.class));
    }
    public void onBackPressed(){}
    public void on_lang(View v){
        startActivity(new Intent(getApplicationContext(), language.class));
    }
    private void LoadPreferences_language(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String  language = sharedPreferences.getString("Language", "eng");
        start_btn = (Button) findViewById(R.id.start_btn);
        share_btn = (Button) findViewById(R.id.share_btn);
        rate_btn = (Button) findViewById(R.id.rate_btn);
        lang_btn = (Button) findViewById(R.id.lang_btn);

        switch(language){
            case "eng":
                start_btn.setText("Start");
                share_btn.setText("Share");
                rate_btn.setText("Rate");
                lang_btn.setText("Language");
                break;
            case "rus":
                start_btn.setText("Начать");
                share_btn.setText("Поделиться");
                rate_btn.setText("Оценить");
                lang_btn.setText("Язык");
                break;
            case "arm":
                start_btn.setText("Սկսել");
                share_btn.setText("Կիսվել");
                rate_btn.setText("Գնահատել");
                lang_btn.setText("Լեզու");
                break;
        }

    }
}