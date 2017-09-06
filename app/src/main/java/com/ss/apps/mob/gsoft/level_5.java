package com.ss.apps.mob.gsoft;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.SoundPool;
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

public class level_5 extends Activity {

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

    public MediaPlayer right;
    public MediaPlayer wrong;

    public TextView scoreNumber;

    public TextView score_txt;
    public TextView time_txt;

    public long milliLeft;

    public SoundPool sp;

    public CountDownTimer c;
    public CountDownTimer d;

    public TextView scorelabel;
    public TextView timelabel;

    public int timetofinish;

    public String language;

    public TextView timerNumber;

    public boolean click = false;
    public boolean started = false;

    public static int start = 0;
    public static int count = 0;

    public static int score = 0;

    public int pnum1;
    public int pnum2;
    public int pnum3;
    public int pnum4;

    public int ajmnacac;
    public int mejtex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadPreferences_language();

        right = MediaPlayer.create(this, R.raw.coin);
        wrong = MediaPlayer.create(this, R.raw.wrong_button_clicked);


        language = getIntent().getStringExtra("Language");



        count = 0;
        score = 0;

        rnum();

        timelabel = (TextView) findViewById(R.id.timeNumber);

        scoreNumber = (TextView) findViewById(R.id.scoreNumber);
        timerNumber = (TextView) findViewById(R.id.timeNumber);

        timelabel.setTextColor(Color.WHITE);


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


        show = (ImageButton) findViewById(R.id.show);

        scorelabel = (TextView) findViewById(R.id.score);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;

        Log.e("Count value", Integer.toString(width));


        int width5rd = width / 4 - 10 ;
        int marginButton = height / 15;

        ajmnacac = width - 4*width5rd;
        mejtex = ajmnacac/5;


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



        int marginButt = (height - marginButton) - width5rd - 150;




//        ////Setting buttons X and Y
//
//        show.setY(marginButt);
//        b1.setX(0);
//        b1.setY(marginButton);
//
//        b2.setX(width5rd);
//        b2.setY(marginButton);
//
//        b3.setX(width5rd * 2);
//        b3.setY(marginButton);
//
//        b4.setX(width5rd * 3);
//        b4.setY(marginButton);
//
//        b5.setX(0);
//        b5.setY(width5rd + marginButton);
//
//        b6.setX(width5rd);
//        b6.setY(width5rd + marginButton);
//
//        b7.setX(width5rd * 2);
//        b7.setY(width5rd + marginButton);
//
//        b8.setX(width5rd * 3);
//        b8.setY(width5rd + marginButton);
//
//        b9.setX(0);
//        b9.setY(width5rd * 2 + marginButton);
//
//        b10.setX(width5rd);
//        b10.setY(width5rd * 2 + marginButton);
//
//        b11.setX(width5rd * 2);
//        b11.setY(width5rd * 2 + marginButton);
//
//        b12.setX(width5rd * 3);
//        b12.setY(width5rd * 2 + marginButton);
//
//        b13.setX(0);
//        b13.setY(width5rd * 3 + marginButton);
//
//        b14.setX(width5rd);
//        b14.setY(width5rd * 3 + marginButton);
//
//        b15.setX(width5rd * 2);
//        b15.setY(width5rd * 3 + marginButton);
//
//        b16.setX(width5rd * 3);
//        b16.setY(width5rd * 3 + marginButton);


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
        int num4 = r.nextInt(16 - 1) + 1;

        pnum1 = num1;
        pnum2 = num2;
        pnum3 = num3;
        pnum4 = num4;

        if (num1 != 1 && num2 != 1 && num3 != 1 && num4 != 1) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 2 && num2 != 2 && num3 != 2 && num4 != 2) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 3 && num2 != 3 && num3 != 3 && num4 != 3) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 4 && num2 != 4 && num3 != 4 && num4 != 4) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 5 && num2 != 5 && num3 != 5 && num4 != 5) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 6 && num2 != 6 && num3 != 6 && num4 != 6) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 7 && num2 != 7 && num3 != 7 && num4 != 7) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 8 && num2 != 8 && num3 != 8 && num4 != 8) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 9 && num2 != 9 && num3 != 9 && num4 != 9) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 10 && num2 != 10 && num3 != 10 && num4 != 10) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 11 && num2 != 11 && num3 != 11 && num4 != 11) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 12 && num2 != 12 && num3 != 12 && num4 != 12) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 13 && num2 != 13 && num3 != 13 && num4 != 13) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }


        if (num1 != 14 && num2 != 14 && num3 != 14 && num4 != 14) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }


        if (num1 != 15 && num2 != 15 && num3 != 15 && num4 != 15) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }

        if (num1 != 16 && num2 != 16 && num3 != 16 && num4 != 16) {
            int n = r.nextInt(4 - 1) + 1;
            if (n == 1) {
                b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
        }


        if (num1 == num2 || num1 == num4 || num1 == num3 || num2 == num3 || num2 == num4 || num3 == num4) {
            rnum();
        } else {

            ///num1
            switch (num1) {
                case 1:
                    b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 2:
                    b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 3:
                    b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 4:
                    b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 5:
                    b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 6:
                    b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 7:
                    b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 8:
                    b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 9:
                    b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 10:
                    b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 11:
                    b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 12:
                    b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 13:
                    b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 14:
                    b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 15:
                    b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 16:
                    b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;

            }
            /////num2
            switch (num2) {
                case 1:
                    b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 2:
                    b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 3:
                    b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 4:
                    b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 5:
                    b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 6:
                    b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 7:
                    b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 8:
                    b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 9:
                    b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 10:
                    b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 11:
                    b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 12:
                    b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 13:
                    b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 14:
                    b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 15:
                    b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 16:
                    b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;


            }
            /////num3
            switch (num3) {
                case 1:
                    b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 2:
                    b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 3:
                    b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 4:
                    b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 5:
                    b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 6:
                    b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 7:
                    b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 8:
                    b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 9:
                    b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 10:
                    b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 11:
                    b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 12:
                    b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 13:
                    b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 14:
                    b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 15:
                    b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 16:
                    b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;

            }

            /////num4
            switch (num4) {
                case 1:
                    b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 2:
                    b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 3:
                    b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 4:
                    b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 5:
                    b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 6:
                    b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 7:
                    b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 8:
                    b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 9:
                    b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 10:
                    b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 11:
                    b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 12:
                    b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 13:
                    b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 14:
                    b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 15:
                    b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;
                case 16:
                    b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    break;

            }


        }

    }

    public void onb1(View v) {
        if (pnum1 == 1 || pnum2 == 1 || pnum3 == 1 || pnum4 == 1) {
            if (click == false) {
                click = true;
            }
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            b1.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            b1.setVisibility(View.INVISIBLE);
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
            clicktimer(0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }

    }

    public void onb2(View v) {
        if (pnum1 == 2 || pnum2 == 2 || pnum3 == 2 || pnum4 == 2) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b2.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b2.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb3(View v) {
        if (pnum1 == 3 || pnum2 == 3 || pnum3 == 3 || pnum4 == 3) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b3.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            b3.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
            clicktimer(0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }

    }

    public void onb4(View v) {
        if (pnum1 == 4 || pnum2 == 4 || pnum3 == 4 || pnum4 == 4) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b4.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b4.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb5(View v) {
        if (pnum1 == 5 || pnum2 == 5 || pnum3 == 5 || pnum4 == 5) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b5.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b5.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb6(View v) {
        if (pnum1 == 6 || pnum2 == 6 || pnum3 == 6 || pnum4 == 6) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b6.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b6.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb7(View v) {
        if (pnum1 == 7 || pnum2 == 7 || pnum3 == 7 || pnum4 == 7) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b7.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b7.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb8(View v) {
        if (pnum1 == 8 || pnum2 == 8 || pnum3 == 8 || pnum4 == 8) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b8.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b8.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb9(View v) {
        if (pnum1 == 9 || pnum2 == 9 || pnum3 == 9 || pnum4 == 9) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b9.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b9.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb10(View v) {
        if (pnum1 == 10 || pnum2 == 10 || pnum3 == 10 || pnum4 == 10) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b10.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b10.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb11(View v) {
        if (pnum1 == 11 || pnum2 == 11 || pnum3 == 11 || pnum4 == 11) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b11.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b11.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb12(View v) {
        if (pnum1 == 12 || pnum2 == 12 || pnum3 == 12 || pnum4 == 12) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b12.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b12.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb13(View v) {
        if (pnum1 == 13 || pnum2 == 13 || pnum3 == 13 || pnum4 == 13) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b13.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b13.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb14(View v) {
        if (pnum1 == 14 || pnum2 == 14 || pnum3 == 14 || pnum4 == 14) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b14.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b14.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb15(View v) {
        if (pnum1 == 15 || pnum2 == 15 || pnum3 == 15 || pnum4 == 15) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b15.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b15.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb16(View v) {
        if (pnum1 == 16 || pnum2 == 16 || pnum3 == 16 || pnum4 == 16) {
            count++;
            score++;
            scoreNumber.setText(Integer.toString(score));
            if (click == false) {
                click = true;
            }
            b16.setClickable(false);
            Log.e("Count value", Integer.toString(count));
            clicktimer(0.5f);
            b16.setVisibility(View.INVISIBLE);
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
                    .setSpeedRange(0.2f, 0.5f);
        } else {
            if(started != false) {
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                score = 0;
                if(wrong.isPlaying()){wrong.stop();} wrong.start();
                if (c != null) {
                    c.cancel();
                }
            }
        }
        if (click == true) {
            if (started == false) {
                if(c != null){
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void countCheck() {
        if (count == 4) {

            
            if(right.isPlaying()){
                right.stop();
                right.release();
            }

            right = MediaPlayer.create(this, R.raw.coin);
            right.start();

            rnum();

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
                Intent i = new Intent(level_5.this, level_5_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
                c.cancel();
                c = null;
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