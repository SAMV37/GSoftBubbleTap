package com.ss.apps.mob.gsoft;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class language extends Activity{

    public String language = "eng";

    public Button arm;
    public Button rus;
    public Button eng;

    public TextView choose_lang;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_activity);

        arm = (Button) findViewById(R.id.arm);
        rus = (Button) findViewById(R.id.rus);
        eng = (Button) findViewById(R.id.eng);

        LoadPreferences_language();

    }
    public void on_arm(View v){
        arm.setBackground(this.getResources().getDrawable(R.drawable.language_button_clicked));
        rus.setBackground(this.getResources().getDrawable(R.drawable.language_button_style));
        eng.setBackground(this.getResources().getDrawable(R.drawable.language_button_style));
        if(language != "arm") {
            Context context = getApplicationContext();
            CharSequence text = "Language set to Armenian!!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        language = "arm";
        SavePreferences("arm");
        startActivity(new Intent(getApplicationContext(), start.class));
    }
    public void on_rus(View v){
        rus.setBackground(this.getResources().getDrawable(R.drawable.language_button_clicked));
        arm.setBackground(this.getResources().getDrawable(R.drawable.language_button_style));
        eng.setBackground(this.getResources().getDrawable(R.drawable.language_button_style));
        if (language != "rus") {
            Context context = getApplicationContext();
            CharSequence text = "Language set to Russian!!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        language = "rus";
        SavePreferences("rus");
        startActivity(new Intent(getApplicationContext(), start.class));
    }
    public void on_eng(View v){
        eng.setBackground(this.getResources().getDrawable(R.drawable.language_button_clicked));
        rus.setBackground(this.getResources().getDrawable(R.drawable.language_button_style));
        arm.setBackground(this.getResources().getDrawable(R.drawable.language_button_style));

        if(language != "eng") {
            Context context = getApplicationContext();
            CharSequence text = "Language set to English!!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        language = "eng";
        SavePreferences("eng");
        startActivity(new Intent(getApplicationContext(), start.class));
    }
    public void SavePreferences(String value){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Language", value);
        editor.commit();
    }
    private void LoadPreferences_language(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String  language = sharedPreferences.getString("Language", "eng");

        choose_lang = (TextView) findViewById(R.id.choose_lang);
        switch(language){
            case "eng":
                eng.setBackground(this.getResources().getDrawable(R.drawable.language_button_clicked));
                choose_lang.setText("Choose Language");
                arm.setText("Armenian");
                rus.setText("Russian");
                eng.setText("English");
                break;
            case "rus":
                rus.setBackground(this.getResources().getDrawable(R.drawable.language_button_clicked));
                choose_lang.setText("Выбрать язык");
                arm.setText("Армянский");
                rus.setText("Русский");
                eng.setText("Англиский");
                break;
            case "arm":
                arm.setBackground(this.getResources().getDrawable(R.drawable.language_button_clicked));
                choose_lang.setText("Ընտրել լեզուն");
                arm.setText("Հայերեն");
                rus.setText("Ռուսերեն");
                eng.setText("Անգլերեն");
                break;
        }
    }
    public void onBackPressed(){}
}
