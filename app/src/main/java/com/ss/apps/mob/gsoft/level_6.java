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

public class level_6 extends Activity {

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

    public int pnum;

    public int last_num = 0;
    public int ajmnacac;
    public int mejtex;

    public TextView score_txt;
    public TextView time_txt;


    public int background_num1;
    public int background_num2;
    public int background_num3;
    public int background_num4;
    public int background_num5;
    public int background_num6;
    public int background_num7;
    public int background_num8;
    public int background_num9;
    public int background_num10;
    public int background_num11;
    public int background_num12;
    public int background_num13;
    public int background_num14;
    public int background_num15;
    public int background_num16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();

        LoadPreferences_language();

        right = MediaPlayer.create(this, R.raw.point);
        wrong = MediaPlayer.create(this, R.raw.wrong_button_clicked);


        language = getIntent().getStringExtra("Language");



        count = 0;
        score = 0;



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

        background_num1 = r.nextInt(4 - 1) + 1;
        if (background_num1 == 1) {
            b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num1 == 2) {
            b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num2 = r.nextInt(4 - 1) + 1;
        if (background_num2 == 1) {
            b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num2 == 2) {
            b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num3 = r.nextInt(4 - 1) + 1;
        if (background_num3 == 1) {
            b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num3 == 2) {
            b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num4 = r.nextInt(4 - 1) + 1;
        if (background_num4 == 1) {
            b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num4 == 2) {
            b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num5 = r.nextInt(4 - 1) + 1;
        if (background_num5 == 1) {
            b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num5 == 2) {
            b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num6 = r.nextInt(4 - 1) + 1;
        if (background_num6 == 1) {
            b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num6 == 2) {
            b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num7 = r.nextInt(4 - 1) + 1;
        if (background_num7 == 1) {
            b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num7 == 2) {
            b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num8 = r.nextInt(4 - 1) + 1;
        if (background_num8 == 1) {
            b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num8 == 2) {
            b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num9 = r.nextInt(4 - 1) + 1;
        if (background_num9 == 1) {
            b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num9 == 2) {
            b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num10 = r.nextInt(4 - 1) + 1;
        if (background_num10 == 1) {
            b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num10 == 2) {
            b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num11 = r.nextInt(4 - 1) + 1;
        if (background_num11 == 1) {
            b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num11 == 2) {
            b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num12 = r.nextInt(4 - 1) + 1;
        if (background_num12 == 1) {
            b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num12 == 2) {
            b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num13 = r.nextInt(4 - 1) + 1;
        if (background_num13 == 1) {
            b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num13 == 2) {
            b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num14 = r.nextInt(4 - 1) + 1;
        if (background_num14 == 1) {
            b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num14 == 2) {
            b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num15 = r.nextInt(4 - 1) + 1;
        if (background_num15 == 1) {
            b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num15 == 2) {
            b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }

        background_num16 = r.nextInt(4 - 1) + 1;
        if (background_num16 == 1) {
            b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
        } else if (background_num16 == 2) {
            b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
        } else {
            b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
        }


        rnum();

    }

    public void rnum() {

        int lastnum = pnum;

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

        Random r = new Random();

        int p = 1;
        int num = r.nextInt(16 - 1) + 1;
        //int num = 1;
        if(num == lastnum){
            rnum();
            p = 0;
        }


        if(p == 1) {
            pnum = num;
            switch (num) {
                case 1:
                    b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    //b1.setImageResource(R.drawable.bubble_red);
                    break;
                case 2:
                    b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    //b2.setImageResource(R.drawable.bubble_red);
                    break;
                case 3:
                    b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    // b3.setImageResource(R.drawable.bubble_red);
                    break;
                case 4:
                    b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    // b4.setImageResource(R.drawable.bubble_red);
                    break;
                case 5:
                    b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    // b5.setImageResource(R.drawable.bubble_red);
                    break;
                case 6:
                    b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    // b6.setImageResource(R.drawable.bubble_red);
                    break;
                case 7:
                    b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    //b7.setImageResource(R.drawable.bubble_red);
                    break;
                case 8:
                    b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    // b8.setImageResource(R.drawable.bubble_red);
                    break;
                case 9:
                    b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    // b9.setImageResource(R.drawable.bubble_red);
                    break;
                case 10:
                    b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    // b10.setImageResource(R.drawable.bubble_red);
                    break;
                case 11:
                    b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    // b11.setImageResource(R.drawable.bubble_red);
                    break;
                case 12:
                    b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    // b12.setImageResource(R.drawable.bubble_red);
                    break;
                case 13:
                    b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    //b13.setImageResource(R.drawable.bubble_red);
                    break;
                case 14:
                    b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    // b14.setImageResource(R.drawable.bubble_red);
                    break;
                case 15:
                    b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    // b15.setImageResource(R.drawable.bubble_red);
                    break;
                case 16:
                    b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_red));
                    // b16.setImageResource(R.drawable.bubble_red);
                    break;
            }
        }
    }

    public void onb1(View v) {
        if (pnum == 1) {
            if(right.isPlaying()){
                right.stop();
                right.release();
            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));

            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b1);

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



            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }

            rnum();

            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }
    public void onb2(View v) {
        if (pnum == 2) {
            if(right.isPlaying()) {
                right.stop();
                right.release();
            }else{
                right.release();
            }
        if (click == false) {
            click = true;
        }
        score++;
        scoreNumber.setText(Integer.toString(score));
            Random r = new Random();

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b2);

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

            int n = r.nextInt(4 - 1) + 1;



//            if (n == 1) {
//                ((bubble_reditionDrawable) b2.getDrawable()).startbubble_redition(500);
//            } else if (n == 2) {
//                ((bubble_reditionDrawable) b2.getDrawable()).startbubble_redition(500);
//            } else {
//                ((bubble_reditionDrawable) b2.getDrawable()).startbubble_redition(500);
//            }

            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }

            rnum();
            right = MediaPlayer.create(this, R.raw.point);
            right.start();
    } else {
        if (started != false) {
            Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb3(View v) {
        if (pnum == 3) {
            if(right.isPlaying()) {
                right.stop();
                right.release();
            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b3);

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
//            if (n == 1) {
//                ((bubble_reditionDrawable) b3.getDrawable()).startbubble_redition(500);
//            } else if (n == 2) {
//                ((bubble_reditionDrawable) b3.getDrawable()).startbubble_redition(500);
//            } else {
//                ((bubble_reditionDrawable) b3.getDrawable()).startbubble_redition(500);
//            }

            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }

            rnum();

            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }

    }

    public void onb4(View v) {
        if (pnum == 4) {
            if(right.isPlaying()) {
                right.stop();
                right.release();

            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b4);

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

//            if (n == 1) {
//                ((bubble_reditionDrawable) b4.getDrawable()).startbubble_redition(500);
//            } else if (n == 2) {
//                ((bubble_reditionDrawable) b4.getDrawable()).startbubble_redition(500);
//            } else {
//                ((bubble_reditionDrawable) b4.getDrawable()).startbubble_redition(500);
//            }

            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }

            rnum();
            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb5(View v) {
        if (pnum == 5) {
                if (right.isPlaying()) {
                    right.stop();
                    right.release();
                }else{
                    right.release();
                }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b5);

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

//            if (n == 1) {
//                ((bubble_reditionDrawable) b5.getDrawable()).startbubble_redition(500);
//            } else if (n == 2) {
//                ((bubble_reditionDrawable) b5.getDrawable()).startbubble_redition(500);
//            } else {
//                ((bubble_reditionDrawable) b5.getDrawable()).startbubble_redition(500);
//            }


            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
            rnum();
            right = MediaPlayer.create(this, R.raw.point);
                right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb6(View v) {
        if (pnum == 6) {
            if(right.isPlaying()) {
                right.stop();
                right.release();

            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b6);

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
//
//            if (n == 1) {
//                ((bubble_reditionDrawable) b6.getDrawable()).startbubble_redition(500);
//            } else if (n == 2) {
//                ((bubble_reditionDrawable) b6.getDrawable()).startbubble_redition(500);
//            } else {
//                ((bubble_reditionDrawable) b6.getDrawable()).startbubble_redition(500);
//            }

            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
            rnum();

            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb7(View v) {
        if (pnum == 7) {
            if(right.isPlaying()) {
                right.stop();
                right.release();

            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b7);

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

//            if (n == 1) {
//                ((bubble_reditionDrawable) b7.getDrawable()).startbubble_redition(500);
//            } else if (n == 2) {
//                ((bubble_reditionDrawable) b7.getDrawable()).startbubble_redition(500);
//            } else {
//                ((bubble_reditionDrawable) b7.getDrawable()).startbubble_redition(500);
//            }

            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }

            rnum();
            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb8(View v) {
        if (pnum == 8) {
            if(right.isPlaying()) {
                right.stop();
                right.release();

            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b8);

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

            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }

            rnum();

            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }

    }

    public void onb9(View v) {
        if (pnum == 9) {
            if(right.isPlaying()) {
                right.stop();
                right.release();
            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;


//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b9);

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

            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
            rnum();

            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb10(View v) {
        if (pnum == 10) {
            if(right.isPlaying()) {
                right.stop();
                right.release();

            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b10);

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


            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }

            rnum();

            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb11(View v) {
        if (pnum == 11) {
            if(right.isPlaying()) {
                right.stop();
                right.release();
            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b11);

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

            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }

            rnum();

            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb12(View v) {
        if (pnum == 12) {
            if(right.isPlaying()) {
                right.stop();
                right.release();

            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b12);

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

            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }

            rnum();

            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb13(View v) {
        if (pnum == 13) {
            if(right.isPlaying()) {
                right.stop();
                right.release();

            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b13);

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

            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }
            rnum();
            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb14(View v) {
        if (pnum == 14) {
            if(right.isPlaying()) {
                right.stop();
                right.release();

            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b14);

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

            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }

            rnum();

            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }

    }

    public void onb15(View v) {
        if (pnum == 15) {
            if(right.isPlaying()) {
                right.stop();
                right.release();
            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b15);

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

            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }

            rnum();

            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void onb16(View v) {
        if (pnum == 16) {
            if(right.isPlaying()) {
                right.stop();
                right.release();
            }else{
                right.release();
            }
            if (click == false) {
                click = true;
            }
            score++;
            scoreNumber.setText(Integer.toString(score));
            b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_red_clicked));
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

//            ExplosionField expo = ExplosionField.attach2Window(this);
//            expo.explode(b16);

            new ParticleSystem(this, 50, R.drawable.bubble_red_small, 500)
                    .setSpeedRange(0.1f, 0.3f)
                    .oneShot(b16, 50);

            new ParticleSystem(this, 50, R.drawable.bubble_blue_small, 500)
                    .setSpeedRange(0.1f, 0.3f)
                    .oneShot(b16, 50);

            new ParticleSystem(this, 50, R.drawable.bubble_green_small, 500)
                    .setSpeedRange(0.1f, 0.3f)
                    .oneShot(b16, 50);

            new ParticleSystem(this, 50, R.drawable.bubble_yellow_small, 500)
                    .setSpeedRange(0.1f, 0.3f)
                    .oneShot(b16, 50);

            if (n == 1) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
            } else if (n == 2) {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
            } else {
                //((bubble_reditionDrawable) b1.getDrawable()).startbubble_redition(500);
                b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
            }

            rnum();

            right = MediaPlayer.create(this, R.raw.point);
            right.start();
        } else {
            if (started != false) {
                Intent i = new Intent(level_6.this, level_6_lost.class);
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
                if (c != null) {
                    c.cancel();
                }
                timer(30);
                started = true;
            }
        }
    }

    public void countCheck() {
            Random r = new Random();

            int n = r.nextInt(4 - 1) + 1;

            if (right.isPlaying()) {
                right.stop(); right.reset();
            }




            switch(pnum){
                case 1:
                    if (n == 1) {
                        b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b1.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 2:
                    if (n == 1) {
                        b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b2.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 3:
                    if (n == 1) {
                        b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b3.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 4:
                    if (n == 1) {
                        b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b4.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 5:
                    if (n == 1) {
                        b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b5.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 6:
                    if (n == 1) {
                        b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b6.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 7:
                    if (n == 1) {
                        b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b7.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 8:
                    if (n == 1) {
                        b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b8.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 9:
                    if (n == 1) {
                        b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b9.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 10:
                    if (n == 1) {
                        b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b10.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;

                case 11:
                    if (n == 1) {
                        b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b11.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 12:
                    if (n == 1) {
                        b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b12.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 13:
                    if (n == 1) {
                        b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b13.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 14:
                    if (n == 1) {
                        b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b14.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 15:
                    if (n == 1) {
                        b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b15.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
                case 16:
                    if (n == 1) {
                        b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_green));
                    } else if (n == 2) {
                        b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_blue));
                    } else {
                        b16.setBackground(this.getResources().getDrawable(R.drawable.bubble_yellow));
                    }
                    break;
            }

        rnum();

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
                Intent i = new Intent(level_6.this, level_6_lost.class);
                i.putExtra("Score", score);
                i.putExtra("Language", language);
                startActivity(i);
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