package com.ss.apps.mob.gsoft;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.plattysoft.leonids.ParticleSystem;

import java.util.Random;

public class level_2 extends Activity {

    public ImageButton b1;
    public ImageButton b2;
    public ImageButton b3;
    public ImageButton b4;
    public ImageButton b5;
    public ImageButton b6;
    public ImageButton b7;
    public ImageButton b8;
    public ImageButton b9;
    public ImageButton b10;
    public ImageButton b11;
    public ImageButton b12;
    public ImageButton b13;
    public ImageButton b14;
    public ImageButton b15;
    public ImageButton b16;
    public ImageButton show;


    public RelativeLayout layout_b1;
    public RelativeLayout layout_b2;
    public RelativeLayout layout_b3;
    public RelativeLayout layout_b4;
    public RelativeLayout layout_b5;
    public RelativeLayout layout_b6;
    public RelativeLayout layout_b7;
    public RelativeLayout layout_b8;
    public RelativeLayout layout_b9;
    public RelativeLayout layout_b10;
    public RelativeLayout layout_b11;
    public RelativeLayout layout_b12;
    public RelativeLayout layout_b13;
    public RelativeLayout layout_b14;
    public RelativeLayout layout_b15;
    public RelativeLayout layout_b16;

    public TextView text_b1;
    public TextView text_b2;
    public TextView text_b3;
    public TextView text_b4;
    public TextView text_b5;
    public TextView text_b6;
    public TextView text_b7;
    public TextView text_b8;
    public TextView text_b9;
    public TextView text_b10;
    public TextView text_b11;
    public TextView text_b12;
    public TextView text_b13;
    public TextView text_b14;
    public TextView text_b15;
    public TextView text_b16;

    public TextView score_txt;
    public TextView time_txt;


    
    public TextView scoreNumber;

    public long milliLeft;

    public CountDownTimer c;
    public CountDownTimer d;

    public TextView scorelabel;
    public TextView timelabel;

    public int timetofinish;
    
    public String language;

    public MediaPlayer right;
    public MediaPlayer wrong;

    public TextView timerNumber;

    public boolean click = false;
    public boolean started = false;

    public static int start = 0;
    public static int count = 0;

    public static int score = 0;

    public int pnum1;
    public int pnum2;
    public int pnum3;

    public int ajmnacac;
    public int mejtex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadPreferences_language();

        language = getIntent().getStringExtra("Language");

        right = MediaPlayer.create(this, R.raw.coin);
        wrong = MediaPlayer.create(this, R.raw.wrong_button_clicked);

        count = 0;
        score = 0;

        rnum();

        timelabel = (TextView) findViewById(R.id.timeNumber);

        timelabel.setTextColor(Color.WHITE);

        scoreNumber = (TextView) findViewById(R.id.scoreNumber);
        timerNumber = (TextView) findViewById(R.id.timeNumber);

        b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);
        b8 = (ImageButton) findViewById(R.id.b8);
        b9 = (ImageButton) findViewById(R.id.b9);
        b10 = (ImageButton) findViewById(R.id.b10);
        b11 = (ImageButton) findViewById(R.id.b11);
        b12 = (ImageButton) findViewById(R.id.b12);
        b13 = (ImageButton) findViewById(R.id.b13);
        b14 = (ImageButton) findViewById(R.id.b14);
        b15 = (ImageButton) findViewById(R.id.b15);
        b16 = (ImageButton) findViewById(R.id.b16);


        layout_b1 = (RelativeLayout) findViewById(R.id.layout_b1);
        layout_b2 = (RelativeLayout) findViewById(R.id.layout_b2);
        layout_b3 = (RelativeLayout) findViewById(R.id.layout_b3);
        layout_b4 = (RelativeLayout) findViewById(R.id.layout_b4);
        layout_b5 = (RelativeLayout) findViewById(R.id.layout_b5);
        layout_b6 = (RelativeLayout) findViewById(R.id.layout_b6);
        layout_b7 = (RelativeLayout) findViewById(R.id.layout_b7);
        layout_b8 = (RelativeLayout) findViewById(R.id.layout_b8);
        layout_b9 = (RelativeLayout) findViewById(R.id.layout_b9);
        layout_b10 = (RelativeLayout) findViewById(R.id.layout_b10);
        layout_b11 = (RelativeLayout) findViewById(R.id.layout_b11);
        layout_b12 = (RelativeLayout) findViewById(R.id.layout_b12);
        layout_b13 = (RelativeLayout) findViewById(R.id.layout_b13);
        layout_b14 = (RelativeLayout) findViewById(R.id.layout_b14);
        layout_b15 = (RelativeLayout) findViewById(R.id.layout_b15);
        layout_b16 = (RelativeLayout) findViewById(R.id.layout_b16);


        text_b1 = (TextView) findViewById(R.id.text_b1);
        text_b2 = (TextView) findViewById(R.id.text_b2);
        text_b3 = (TextView) findViewById(R.id.text_b3);
        text_b4 = (TextView) findViewById(R.id.text_b4);
        text_b5 = (TextView) findViewById(R.id.text_b5);
        text_b6 = (TextView) findViewById(R.id.text_b6);
        text_b7 = (TextView) findViewById(R.id.text_b7);
        text_b8 = (TextView) findViewById(R.id.text_b8);
        text_b9 = (TextView) findViewById(R.id.text_b9);
        text_b10 = (TextView) findViewById(R.id.text_10);
        text_b11 = (TextView) findViewById(R.id.text_b11);
        text_b12 = (TextView) findViewById(R.id.text_b12);
        text_b13 = (TextView) findViewById(R.id.text_b13);
        text_b14 = (TextView) findViewById(R.id.text_b14);
        text_b15 = (TextView) findViewById(R.id.text_b15);
        text_b16 = (TextView) findViewById(R.id.text_b16);


        show = (ImageButton) findViewById(R.id.show);

        scorelabel = (TextView) findViewById(R.id.score);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;

        int width5rd = width / 4 - 10;
        int marginButton = height / 13;

            //width5rd = width / 5 - 10;
            ajmnacac = width - 4*width5rd;
            mejtex = ajmnacac/5;

        int marginButt = (height - marginButton) - width5rd - 150;

        RelativeLayout.LayoutParams param = (RelativeLayout.LayoutParams) b1.getLayoutParams();
        param.width = width5rd;
        param.height = width5rd;
        b1.setLayoutParams(param);
        b2.setLayoutParams(param);
        b3.setLayoutParams(param);
        b4.setLayoutParams(param);
        b5.setLayoutParams(param);
        b6.setLayoutParams(param);
        b7.setLayoutParams(param);
        b8.setLayoutParams(param);
        b9.setLayoutParams(param);
        b10.setLayoutParams(param);
        b11.setLayoutParams(param);
        b12.setLayoutParams(param);
        b13.setLayoutParams(param);
        b14.setLayoutParams(param);
        b15.setLayoutParams(param);
        b16.setLayoutParams(param);

//        ///Setting buttons height and width
//        show.setWidth(width5rd);
//        show.setHeight(width5rd);
//
//        b1.setWidth(width5rd);
//        b1.setHeight(width5rd);
//
//        b2.setWidth(width5rd);
//        b2.setHeight(width5rd);
//
//        b3.setWidth(width5rd);
//        b3.setHeight(width5rd);
//
//        b4.setWidth(width5rd);
//        b4.setHeight(width5rd);
//
//        b5.setWidth(width5rd);
//        b5.setHeight(width5rd);
//
//        b6.setWidth(width5rd);
//        b6.setHeight(width5rd);
//
//        b7.setWidth(width5rd);
//        b7.setHeight(width5rd);
//
//        b8.setWidth(width5rd);
//        b8.setHeight(width5rd);
//
//        b9.setWidth(width5rd);
//        b9.setHeight(width5rd);
//
//        b10.setWidth(width5rd);
//        b10.setHeight(width5rd);
//
//        b11.setWidth(width5rd);
//        b11.setHeight(width5rd);
//
//        b12.setWidth(width5rd);
//        b12.setHeight(width5rd);
//
//        b13.setWidth(width5rd);
//        b13.setHeight(width5rd);
//
//        b14.setWidth(width5rd);
//        b14.setHeight(width5rd);
//
//        b15.setWidth(width5rd);
//        b15.setHeight(width5rd);
//
//        b16.setWidth(width5rd);
//        b16.setHeight(width5rd);


        ////Setting buttons X and Y
        show.setY(marginButt);
//
//        layout_b1.setX(0);
//        layout_b1.setY(marginButton);
//
//        layout_b2.setX(width5rd);
//        layout_b2.setY(marginButton);
//
//        layout_b3.setX(width5rd * 2);
//        layout_b3.setY(marginButton);
//
//        layout_b4.setX(width5rd * 3);
//        layout_b4.setY(marginButton);
//
//        layout_b5.setX(0);
//        layout_b5.setY(width5rd + marginButton);
//
//        layout_b6.setX(width5rd);
//        layout_b6.setY(width5rd + marginButton);
//
//        layout_b7.setX(width5rd * 2);
//        layout_b7.setY(width5rd + marginButton);
//
//        layout_b8.setX(width5rd * 3);
//        layout_b8.setY(width5rd + marginButton);
//
//        layout_b9.setX(0);
//        layout_b9.setY(width5rd * 2 + marginButton);
//
//        layout_b10.setX(width5rd);
//        layout_b10.setY(width5rd * 2 + marginButton);
//
//        layout_b11.setX(width5rd * 2);
//        layout_b11.setY(width5rd * 2 + marginButton);
//
//        layout_b12.setX(width5rd * 3);
//        layout_b12.setY(width5rd * 2 + marginButton);
//
//        layout_b13.setX(0);
//        layout_b13.setY(width5rd * 3 + marginButton);
//
//        layout_b14.setX(width5rd);
//        layout_b14.setY(width5rd * 3 + marginButton);
//
//        layout_b15.setX(width5rd * 2);
//        layout_b15.setY(width5rd * 3 + marginButton);
//
//        layout_b16.setX(width5rd * 3);
//        layout_b16.setY(width5rd * 3 + marginButton);

        layout_b1.setX(mejtex);
        layout_b1.setY(marginButton);

        layout_b2.setX(width5rd + mejtex*2);
        layout_b2.setY(marginButton);

        layout_b3.setX((width5rd * 2) + mejtex*3);
        layout_b3.setY(marginButton);

        layout_b4.setX((width5rd * 3) + mejtex*4);
        layout_b4.setY(marginButton);

        layout_b5.setX(mejtex);
        layout_b5.setY(width5rd + marginButton + mejtex);

        layout_b6.setX(width5rd + mejtex*2);
        layout_b6.setY(width5rd + marginButton + mejtex);

        layout_b7.setX((width5rd * 2) + mejtex*3);
        layout_b7.setY(width5rd + marginButton + mejtex);

        layout_b8.setX((width5rd * 3) + mejtex*4);
        layout_b8.setY(width5rd + marginButton + mejtex);

        layout_b9.setX(mejtex);
        layout_b9.setY(width5rd * 2 + marginButton + mejtex*2);

        layout_b10.setX(width5rd + mejtex*2);
        layout_b10.setY(width5rd * 2 + marginButton + mejtex*2);

        layout_b11.setX((width5rd * 2) + mejtex*3);
        layout_b11.setY(width5rd * 2 + marginButton + mejtex*2);

        layout_b12.setX((width5rd * 3) + mejtex*4);
        layout_b12.setY(width5rd * 2 + marginButton + mejtex*2);

        layout_b13.setX(mejtex);
        layout_b13.setY(width5rd * 3 + marginButton + mejtex*3);

        layout_b14.setX(width5rd + mejtex*2);
        layout_b14.setY(width5rd * 3 + marginButton + mejtex*3);

        layout_b15.setX((width5rd * 2) + mejtex*3);
        layout_b15.setY(width5rd * 3 + marginButton + mejtex*3);

        layout_b16.setX((width5rd * 3) + mejtex*4);
        layout_b16.setY(width5rd * 3 + marginButton + mejtex*3);

    }

    public void rnum() {

        b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);
        b8 = (ImageButton) findViewById(R.id.b8);
        b9 = (ImageButton) findViewById(R.id.b9);
        b10 = (ImageButton) findViewById(R.id.b10);
        b11 = (ImageButton) findViewById(R.id.b11);
        b12 = (ImageButton) findViewById(R.id.b12);
        b13 = (ImageButton) findViewById(R.id.b13);
        b14 = (ImageButton) findViewById(R.id.b14);
        b15 = (ImageButton) findViewById(R.id.b15);
        b16 = (ImageButton) findViewById(R.id.b16);

        text_b1 = (TextView) findViewById(R.id.text_b1);
        text_b2 = (TextView) findViewById(R.id.text_b2);
        text_b3 = (TextView) findViewById(R.id.text_b3);
        text_b4 = (TextView) findViewById(R.id.text_b4);
        text_b5 = (TextView) findViewById(R.id.text_b5);
        text_b6 = (TextView) findViewById(R.id.text_b6);
        text_b7 = (TextView) findViewById(R.id.text_b7);
        text_b8 = (TextView) findViewById(R.id.text_b8);
        text_b9 = (TextView) findViewById(R.id.text_b9);
        text_b10 = (TextView) findViewById(R.id.text_10);
        text_b11 = (TextView) findViewById(R.id.text_b11);
        text_b12 = (TextView) findViewById(R.id.text_b12);
        text_b13 = (TextView) findViewById(R.id.text_b13);
        text_b14 = (TextView) findViewById(R.id.text_b14);
        text_b15 = (TextView) findViewById(R.id.text_b15);
        text_b16 = (TextView) findViewById(R.id.text_b16);

        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        b10.setVisibility(View.VISIBLE);
        b11.setVisibility(View.VISIBLE);
        b12.setVisibility(View.VISIBLE);
        b13.setVisibility(View.VISIBLE);
        b14.setVisibility(View.VISIBLE);
        b15.setVisibility(View.VISIBLE);
        b16.setVisibility(View.VISIBLE);

        Random r = new Random();

        int num1 = r.nextInt(16 - 1) + 1;
        int num2 = r.nextInt(16 - 1) + 1;
        int num3 = r.nextInt(16 - 1) + 1;

        pnum1 = num1;
        pnum2 = num2;
        pnum3 = num3;

        if (num1 != 1 && num2 != 1 && num3 != 1) {
            text_b1.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 2 && num2 != 2 && num3 != 2) {
            text_b2.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 3 && num2 != 3 && num3 != 3) {
            text_b3.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 4 && num2 != 4 && num3 != 4) {
            text_b4.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 5 && num2 != 5 && num3 != 5) {
            text_b5.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 6 && num2 != 6 && num3 != 6) {
            text_b6.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 7 && num2 != 7 && num3 != 7) {
            text_b7.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 8 && num2 != 8 && num3 != 8) {
            text_b8.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 9 && num2 != 9 && num3 != 9) {
            text_b9.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 10 && num2 != 10 && num3 != 10) {
            text_b10.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 11 && num2 != 11 && num3 != 11) {
            text_b11.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 12 && num2 != 12 && num3 != 12) {
            text_b12.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 13 && num2 != 13 && num3 != 13) {
            text_b13.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }


        if (num1 != 14 && num2 != 14 && num3 != 14) {
            text_b14.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }


        if (num1 != 15 && num2 != 15 && num3 != 15) {
            text_b15.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 16 && num2 != 16 && num3 != 16) {
            text_b16.setText("");
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }


        if (num1 == num2 || num1 == num3 || num2 == num3) {
            rnum();
        } else {

            ///num1
            switch (num1) {
                case 1:
                    b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b1.setText("1");
                    break;
                case 2:
                    b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b2.setText("1");
                    break;
                case 3:
                    b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b3.setText("1");
                    break;
                case 4:
                    b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b4.setText("1");
                    break;
                case 5:
                    b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b5.setText("1");
                    break;
                case 6:
                    b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b6.setText("1");
                    break;
                case 7:
                    b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b7.setText("1");
                    break;
                case 8:
                    b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b8.setText("1");
                    break;
                case 9:
                    b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b9.setText("1");
                    break;
                case 10:
                    b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b10.setText("1");
                    break;
                case 11:
                    b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b11.setText("1");
                    break;
                case 12:
                    b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b12.setText("1");
                    break;
                case 13:
                    b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b13.setText("1");
                    break;
                case 14:
                    b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b14.setText("1");
                    break;
                case 15:
                    b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b15.setText("1");
                    break;
                case 16:
                    b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b16.setText("1");
                    break;

            }
            /////num2
            switch (num2) {
                case 1:
                    b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b1.setText("2");
                    break;
                case 2:
                    b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b2.setText("2");
                    break;
                case 3:
                    b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b3.setText("2");
                    break;
                case 4:
                    b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b4.setText("2");
                    break;
                case 5:
                    b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b5.setText("2");
                    break;
                case 6:
                    b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b6.setText("2");
                    break;
                case 7:
                    b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b7.setText("2");
                    break;
                case 8:
                    b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b8.setText("2");
                    break;
                case 9:
                    b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b9.setText("2");
                    break;
                case 10:
                    b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b10.setText("2");
                    break;
                case 11:
                    b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b11.setText("2");
                    break;
                case 12:
                    b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b12.setText("2");
                    break;
                case 13:
                    b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b13.setText("2");
                    break;
                case 14:
                    b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b14.setText("2");
                    break;
                case 15:
                    b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b15.setText("2");
                    break;
                case 16:
                    b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b16.setText("2");
                    break;


            }
            /////num3
            switch (num3) {
                case 1:
                    b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b1.setText("3");
                    break;
                case 2:
                    b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b2.setText("3");
                    break;
                case 3:
                    b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b3.setText("3");
                    break;
                case 4:
                    b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b4.setText("3");
                    break;
                case 5:
                    b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b5.setText("3");
                    break;
                case 6:
                    b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b6.setText("3");
                    break;
                case 7:
                    b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b7.setText("3");
                    break;
                case 8:
                    b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b8.setText("3");
                    break;
                case 9:
                    b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b9.setText("3");
                    break;
                case 10:
                    b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b10.setText("3");
                    break;
                case 11:
                    b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b11.setText("3");
                    break;
                case 12:
                    b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b12.setText("3");
                    break;
                case 13:
                    b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b13.setText("3");
                    break;
                case 14:
                    b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b14.setText("3");
                    break;
                case 15:
                    b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b15.setText("3");
                    break;
                case 16:
                    b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    text_b16.setText("3");
                    break;

            }

        }

    }

    public void onb1(View v) {
        if (pnum1 == 1 || pnum2 == 1 || pnum3 == 1) {
            int num = Integer.parseInt((String) text_b1.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }
            if (click == false) {
                click = true;
            }
            b1.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b1.setVisibility(View.INVISIBLE);
            text_b1.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b1, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b1, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b1, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b1, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }
                timer(30);
                started = true;
            }
        }

    }

    public void onb2(View v) {
        if (pnum1 == 2 || pnum2 == 2 || pnum3 == 2) {
            int num = Integer.parseInt((String) text_b2.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }

            if (click == false) {
                click = true;
            }
            b2.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b2.setVisibility(View.INVISIBLE);
            text_b2.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b2, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b2, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b2, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b2, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }

                timer(30);
                started = true;
            }
        }
        b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
    }

    public void onb3(View v) {
        if (pnum1 == 3 || pnum2 == 3 || pnum3 == 3) {
            int num = Integer.parseInt((String) text_b3.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }

            if (click == false) {
                click = true;
            }
            b3.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b3.setVisibility(View.INVISIBLE);
            text_b3.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b3, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b3, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b3, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b3, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }

                timer(30);
                started = true;
            }
        }

    }

    public void onb4(View v) {
        if (pnum1 == 4 || pnum2 == 4 || pnum3 == 4) {
            int num = Integer.parseInt((String) text_b4.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }
            if (click == false) {
                click = true;
            }
            b4.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b4.setVisibility(View.INVISIBLE);
            text_b4.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b4, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b4, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b4, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b4, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }

                timer(30);
                started = true;
            }
        }
    }

    public void onb5(View v) {
        if (pnum1 == 5 || pnum2 == 5 || pnum3 == 5) {
            int num = Integer.parseInt((String) text_b5.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }
            if (click == false) {
                click = true;
            }
            b5.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b5.setVisibility(View.INVISIBLE);
            text_b5.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b5, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b5, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b5, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b5, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }

                timer(30);
                started = true;
            }
        }
    }

    public void onb6(View v) {
        if (pnum1 == 6 || pnum2 == 6 || pnum3 == 6) {
            int num = Integer.parseInt((String) text_b6.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }
            if (click == false) {
                click = true;
            }
            b6.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b6.setVisibility(View.INVISIBLE);
            text_b6.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b6, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b6, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b6, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b6, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb7(View v) {
        if (pnum1 == 7 || pnum2 == 7 || pnum3 == 7) {
            int num = Integer.parseInt((String) text_b7.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }
            if (click == false) {
                click = true;
            }
            b7.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b7.setVisibility(View.INVISIBLE);
            text_b7.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b7, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b7, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b7, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b7, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb8(View v) {
        if (pnum1 == 8 || pnum2 == 8 || pnum3 == 8) {
            int num = Integer.parseInt((String) text_b8.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }
            if (click == false) {
                click = true;
            }
            b8.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b8.setVisibility(View.INVISIBLE);
            text_b8.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b8, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b8, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b8, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b8, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }

                timer(30);
                started = true;
            }
        }
    }

    public void onb9(View v) {
        if (pnum1 == 9 || pnum2 == 9 || pnum3 == 9) {
            int num = Integer.parseInt((String) text_b9.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }
            if (click == false) {
                click = true;
            }
            b9.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b9.setVisibility(View.INVISIBLE);
            text_b9.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b9, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b9, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b9, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b9, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }

                timer(30);
                started = true;
            }
        }
    }

    public void onb10(View v) {
        if (pnum1 == 10 || pnum2 == 10 || pnum3 == 10) {
            int num = Integer.parseInt((String) text_b10.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }
            if (click == false) {
                click = true;
            }
            b10.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b10.setVisibility(View.INVISIBLE);
            text_b10.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b10, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b10, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b10, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b10, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }

                timer(30);
                started = true;
            }
        }
    }

    public void onb11(View v) {
        if (pnum1 == 11 || pnum2 == 11 || pnum3 == 11) {
            int num = Integer.parseInt((String) text_b11.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }
            if (click == false) {
                click = true;
            }
            b11.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b11.setVisibility(View.INVISIBLE);
            text_b11.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b11, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b11, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b11, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b11, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }

                timer(30);
                started = true;
            }
        }
    }

    public void onb12(View v) {
        if (pnum1 == 12 || pnum2 == 12 || pnum3 == 12) {
            int num = Integer.parseInt((String) text_b12.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else {
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }

            if (click == false) {
                click = true;
            }
            b12.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b12.setVisibility(View.INVISIBLE);
            text_b12.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b12, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b12, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b12, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b12, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }

                timer(30);
                started = true;
            }
        }
    }

    public void onb13(View v) {
        if (pnum1 == 13 || pnum2 == 13 || pnum3 == 13) {
            int num = Integer.parseInt((String) text_b13.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }

            if (click == false) {
                click = true;
            }
            b13.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b13.setVisibility(View.INVISIBLE);
            text_b13.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b13, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b13, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b13, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b13, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }

                timer(30);
                started = true;
            }
        }
    }

    public void onb14(View v) {
        if (pnum1 == 14 || pnum2 == 14 || pnum3 == 14) {
            int num = Integer.parseInt((String) text_b14.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }

            if (click == false) {
                click = true;
            }
            b14.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b14.setVisibility(View.INVISIBLE);
            text_b14.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b14, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b14, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b14, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b14, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }

                timer(30);
                started = true;
            }
        }
    }

    public void onb15(View v) {
        if (pnum1 == 15 || pnum2 == 15 || pnum3 == 15) {
            int num = Integer.parseInt((String) text_b15.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }
            if (click == false) {
                click = true;
            }
            b15.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b15.setVisibility(View.INVISIBLE);
            text_b15.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b15, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b15, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b15, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b15, 50);
        } else {
            if(started != false) {
                krvav();
                wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click == true) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }

                timer(30);
                started = true;
            }
        }
    }

    public void onb16(View v) {
        if (pnum1 == 16 || pnum2 == 16 || pnum3 == 16) {
            int num = Integer.parseInt((String) text_b16.getText());
            if(num != count+1){
                krvav();
                wrong.start(); Log.d("krvav: ", "sxal tiv");
            }else{
                count++;
                score++;
                scoreNumber.setText(Integer.toString(score));
            }
            if (click == false) {
                click = true;
            }
            b16.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b16.setVisibility(View.INVISIBLE);
            text_b16.setText("");
            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b16, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b16, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b16, 50);
            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(b16, 50);
        } else {
            if(started != false) {
                krvav();
                if(wrong.isPlaying()){wrong.stop();} wrong.start();
                Log.d("krvav: ", "sxal guyn");
            }
        }
        if (click) {
            if (started == false) {
                if(c!= null){
                    if(c!=null){c.cancel();}
                }
                timer(30);
                started = true;
            }
        }
    }

    public void countCheck() {
        if (count == 3) {
            rnum();

            if(right.isPlaying()) {
                right.stop();
                right.release();
            }

            right = MediaPlayer.create(this, R.raw.coin);
            right.start();

            count = 0;
            b1.setClickable(true);
            b2.setClickable(true);
            b3.setClickable(true);
            b4.setClickable(true);
            b5.setClickable(true);
            b6.setClickable(true);
            b7.setClickable(true);
            b8.setClickable(true);
            b9.setClickable(true);
            b10.setClickable(true);
            b11.setClickable(true);
            b12.setClickable(true);
            b13.setClickable(true);
            b14.setClickable(true);
            b15.setClickable(true);
            b16.setClickable(true);

        }


    }

    public void onBackPressed() {
    }

    public void timer(long timeLengthMilli) {
        c = new CountDownTimer(timeLengthMilli * 1000, 1000) {

            public void onTick(long millisUntilFinished) {
                milliLeft = millisUntilFinished;
                timelabel.setText(Integer.toString((int) (millisUntilFinished / 1000)));
                timetofinish = (int) (millisUntilFinished / 1000);
                if(millisUntilFinished / 1000 <= 5){
                    timelabel.setTextColor(Color.RED);
                }
            }

            public void onFinish() {
                krvav();
                if(c!=null){c.cancel();}
                c = null;
                Log.d("krvav: ", "jamanaky prcav");
            }
        }.start();
    }

    public void clicktimer(float timeLengthMilli) {
        d = new CountDownTimer((long) (timeLengthMilli * 1000), 1000) {

            public void onTick(long millisUntilFinished) {
                milliLeft = millisUntilFinished;
                timetofinish = (int) (millisUntilFinished / 1000);
            }

            public void onFinish() {
                countCheck();
            }
        }.start();
    }

    public void krvav(){
        Intent i = new Intent(level_2.this, level_2_lost.class);
        i.putExtra("Score", score); i.putExtra("Language", language);
        startActivity(i);
        score = 0;
        if(c != null) {
            if(c!=null){c.cancel();}
            c = null;
        }
        
    }
    private void LoadPreferences_language(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String  language = sharedPreferences.getString("Language", "eng");
        score_txt = (TextView) findViewById(R.id.score);
        time_txt = (TextView) findViewById(R.id.time);

        switch(language){
            case "eng":
                score_txt.setText("Score: ");
                time_txt.setText("Time: ");
                break;
            case "rus":
                score_txt.setText("Счёт: ");
                time_txt.setText("Время: ");
                break;
            case "arm":
                score_txt.setText("Հաշիվ: ");
                time_txt.setText("Ժամանակ: ");
                break;
        }

    }
}

