package com.kwon.mystudyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class EX4GifActivity extends AppCompatActivity {

    ImageView ivMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);
        ivMain =findViewById(R.id.ivGif);
        Glide.with(EX4GifActivity.this).load(R.drawable.main_gif1).into(ivMain);
        findViewById(R.id.btngif1).setOnClickListener(mClickListener);
        findViewById(R.id.btngif2).setOnClickListener(mClickListener);
        findViewById(R.id.btngif3).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btngif1:
                    Glide.with(EX4GifActivity.this).load(R.drawable.img_gif1).into(ivMain);
                    break;
                case R.id.btngif2:
                    Glide.with(EX4GifActivity.this).load(R.drawable.img_gif2).into(ivMain);
                    break;
                case R.id.btngif3:
                    Glide.with(EX4GifActivity.this).load(R.drawable.img_gif3).into(ivMain);
                    break;


            }
        }
    };
}