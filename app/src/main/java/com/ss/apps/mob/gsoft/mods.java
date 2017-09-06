package com.ss.apps.mob.gsoft;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class mods extends Activity{

    public TextView not_four_score;
    public TextView not_red_score;
    public TextView not_level_3_score;
    public TextView not_level_2_score;
    public TextView mod_text;


    public TextView level_0;
    public TextView level_1;
    public TextView level_2;
    public TextView level_3;
    public TextView level_4;
    public TextView level_5;

    public String l2_lock_text;
    public String l3_lock_text;
    public String l4_lock_text;
    public String l5_lock_text;
    public String l6_lock_text;

    public boolean l2block = true;
    public boolean l3block = true;
    public boolean l4block = true;
    public boolean l5block = true;
    public boolean l6block = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mod_activity);

        LoadPreferences_level5();
        LoadPreferences_level0();
        LoadPreferences_level1();
        LoadPreferences_level4();
        LoadPreferences_level3();
        LoadPreferences_level2();
        LoadPreferences_language();
        level_2_block();
    }
    private void LoadPreferences_level5(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String  data = sharedPreferences.getString("High score Level 4", String.valueOf(0)) ;
        not_four_score = (TextView) findViewById(R.id.level_5_score);
        not_four_score.setText("High Score: " + data);
    }
    private void LoadPreferences_level4(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String  data = sharedPreferences.getString("High score Level 5", String.valueOf(0)) ;
        not_red_score = (TextView) findViewById(R.id.level_4_score);
        not_red_score.setText("High Score: " + data);
        int l4_score = Integer.parseInt(data);
        if(l4_score >= 80){
            l6block = false;
        }
    }
    private void LoadPreferences_level3(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String  data = sharedPreferences.getString("High score Level 3", String.valueOf(0)) ;
        not_level_3_score = (TextView) findViewById(R.id.level_3_score);
        not_level_3_score.setText("High Score: " + data);
        int l3_score = Integer.parseInt(data);
        if(l3_score >= 70){
            l5block = false;
        }
    }
    private void LoadPreferences_level2(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String  data = sharedPreferences.getString("High score Level 2", String.valueOf(0)) ;
        not_level_2_score = (TextView) findViewById(R.id.level_2_score);
        not_level_2_score.setText("High Score: " + data);
        int l2_score = Integer.parseInt(data);
        if(l2_score >= 60){
            l4block = false;
        }
    }
    private void LoadPreferences_level0(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String  data = sharedPreferences.getString("High score Level 0", String.valueOf(0)) ;
        level_0 = (TextView) findViewById(R.id.level_0_score);
        level_0.setText("High Score: " + data);
        int l0_score = Integer.parseInt(data);
        if(l0_score >= 40){
            l2block = false;
        }
    }

    private void LoadPreferences_level1(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String  data = sharedPreferences.getString("High score Level 1", String.valueOf(0)) ;
        level_1 = (TextView) findViewById(R.id.level_1_score);
        level_1.setText("High Score: " + data);
        int l1_score = Integer.parseInt(data);
        if(l1_score >= 60){
            l3block = false;
        }
    }


    private void level_2_block(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String  data = sharedPreferences.getString("Level 2 block", String.valueOf(0));
        if(data == "1"){
            l2block = false;
        }
    }
    private void LoadPreferences_language(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String  language = sharedPreferences.getString("Language", "eng");
        mod_text = (TextView) findViewById(R.id.mod_text);
        level_0 = (TextView) findViewById(R.id.level_0);
        level_1 = (TextView) findViewById(R.id.level_1);
        level_2 = (TextView) findViewById(R.id.level_2);
        level_3 = (TextView) findViewById(R.id.level_3);
        level_4 = (TextView) findViewById(R.id.level_4);
        level_5 = (TextView) findViewById(R.id.level_5);

        switch(language){
            case "eng":
                mod_text.setText("Choose a Level");
                level_0.setText("Level 1");
                level_1.setText("Level 2");
                level_2.setText("Level 3");
                level_3.setText("Level 4");
                level_4.setText("Level 5");
                level_5.setText("Level 6");
                l2_lock_text = "Sorry level 2 will be unlocked after scoring 40 points in level 1";
                l3_lock_text = "Sorry level 3 will be unlocked after scoring 60 points in level 2";
                l4_lock_text = "Sorry level 4 will be unlocked after scoring 60 points in level 3";
                l5_lock_text = "Sorry level 5 will be unlocked after scoring 70 points in level 4";
                l6_lock_text = "Sorry level 6 will be unlocked after scoring 80 points in level 5";
                break;
            case "rus":
                mod_text.setText("Выберите уровень");
                level_0.setText("Уровень 1");
                level_1.setText("Уровень 2");
                level_2.setText("Уровень 3");
                level_3.setText("Уровень 4");
                level_4.setText("Уровень 5");
                level_5.setText("Уровень 6");
                l2_lock_text = "К сожалению уровень 2 будет доступен после сборки 40 очков в уровне 1.";
                l3_lock_text = "К сожалению уровень 3 будет доступен после сборки 60 очков в уровне 2.";
                l4_lock_text = "К сожалению уровень 4 будет доступен после сборки 60 очков в уровне 3.";
                l5_lock_text = "К сожалению уровень 5 будет доступен после сборки 70 очков в уровне 4.";
                l6_lock_text = "К сожалению уровень 6 будет доступен после сборки 80 очков в уровне 5.";
                break;
            case "arm":
                mod_text.setText("Ընտրեք մակարդակը");
                level_0.setText("Մակարդակ 1");
                level_1.setText("Մակարդակ 2");
                level_2.setText("Մակարդակ 3");
                level_3.setText("Մակարդակ 4");
                level_4.setText("Մակարդակ 5");
                level_5.setText("Մակարդակ 6");
                l2_lock_text = "Ներեցեք 2-րդ մակարդակը հասանելի կլինի 1-ին մակարդակում 40 միավոր հավաքելուց հետո։";
                l3_lock_text = "Ներեցեք 3-րդ մակարդակը հասանելի կլինի 2-րդ մակարդակում 60 միավոր հավաքելուց հետո։";
                l4_lock_text = "Ներեցեք 4-րդ մակարդակը հասանելի կլինի 3-րդ մակարդակում 60 միավոր հավաքելուց հետո։";
                l5_lock_text = "Ներեցեք 5-րդ մակարդակը հասանելի կլինի 4-րդ մակարդակում 70 միավոր հավաքելուց հետո։";
                l6_lock_text = "Ներեցեք 6-րդ մակարդակը հասանելի կլինի 5-րդ մակարդակում 80 միավոր հավաքելուց հետո։";
                break;
        }

    }
    public void on_level_0(View v){
        startActivity(new Intent(getApplicationContext(), level_6.class));
    }
    public void on_level_1(View v){
        if(l2block == true){
            Toast toast = Toast.makeText(getApplicationContext(), l2_lock_text, Toast.LENGTH_LONG);
            toast.show();
        }else {
            startActivity(new Intent(getApplicationContext(), Main.class));
        }
    }
    public void on_level_2(View v){
        if(l3block == true){
            Toast toast = Toast.makeText(getApplicationContext(), l3_lock_text, Toast.LENGTH_LONG);
            toast.show();
        }else {
            startActivity(new Intent(getApplicationContext(), level_2.class));
        }
    }
    public void on_level_3(View v){
        if(l4block == true){
            Toast toast = Toast.makeText(getApplicationContext(), l4_lock_text, Toast.LENGTH_LONG);
            toast.show();
        }else {
            startActivity(new Intent(getApplicationContext(), level_3.class));
        }
    }
    public void on_level_4(View v){
        if(l5block == true){
            Toast toast = Toast.makeText(getApplicationContext(), l5_lock_text, Toast.LENGTH_LONG);
            toast.show();
        }else {
            startActivity(new Intent(getApplicationContext(), level_5.class));
        }
    }
    public void on_level_5(View v){
        if(l6block == true){
            Toast toast = Toast.makeText(getApplicationContext(), l6_lock_text, Toast.LENGTH_LONG);
            toast.show();
        }else {
            startActivity(new Intent(getApplicationContext(), level_4.class));
        }
    }

    public void onBackPressed(){
        startActivity(new Intent(getApplicationContext(), start.class));
    }
}