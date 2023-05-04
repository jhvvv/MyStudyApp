package com.kwon.mystudyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(mClickListener);
        findViewById(R.id.btn2).setOnClickListener(mClickListener);
        findViewById(R.id.btn3).setOnClickListener(mClickListener);
        findViewById(R.id.btn4).setOnClickListener(mClickListener);
        findViewById(R.id.btn5).setOnClickListener(mClickListener);
        findViewById(R.id.btn6).setOnClickListener(mClickListener);
        findViewById(R.id.btn7).setOnClickListener(mClickListener);
        findViewById(R.id.btn8).setOnClickListener(mClickListener);
        findViewById(R.id.btn9).setOnClickListener(mClickListener);
        findViewById(R.id.btn10).setOnClickListener(mClickListener);
        findViewById(R.id.btn11).setOnClickListener(mClickListener);
        findViewById(R.id.btn12).setOnClickListener(mClickListener);
        findViewById(R.id.btn13).setOnClickListener(mClickListener);
        findViewById(R.id.btn14).setOnClickListener(mClickListener);
        findViewById(R.id.btn15).setOnClickListener(mClickListener);
        findViewById(R.id.btn16).setOnClickListener(mClickListener);
        findViewById(R.id.btn17).setOnClickListener(mClickListener);
        findViewById(R.id.btn18).setOnClickListener(mClickListener);
        findViewById(R.id.btn19).setOnClickListener(mClickListener);
        findViewById(R.id.btn20).setOnClickListener(mClickListener);


    }

    //버튼이벤트를 감지함...
    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn1:
                    Intent intent1 =
                            new Intent(MainActivity.this, EX1LoginActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.btn2:
                    Intent intent2 =
                            new Intent(MainActivity.this, EX2CalcActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.btn3:
                    Intent intent3 =
                            new Intent(MainActivity.this,EX3AnimationActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.btn4:
                    Intent intent4 =
                            new Intent(MainActivity.this,EX4GifActivity.class);
                    startActivity(intent4);
                    break;
                case R.id.btn5:
                    Intent intent5 =
                            new Intent(MainActivity.this,EX5DataActivity.class);
                    startActivity(intent5);
                    break;
                case R.id.btn6:
                    Intent intent6 =
                            new Intent(MainActivity.this,EX6SpinnerActivity.class);
                    startActivity(intent6);
                case R.id.btn7:
                    Intent intent7 =
                            new Intent(MainActivity.this,EX7SwitchActivity.class);
                    startActivity(intent7);
                case R.id.btn8:
                    Intent intent8 =
                            new Intent(MainActivity.this,EX8WebViewActivity.class);
                    startActivity(intent8);
                    break;
                case R.id.btn9:
                    Intent intent9 = new Intent(MainActivity.this, Ex9VideoViewActivity.class);
                    startActivity(intent9);
                    break;
                case R.id.btn10:
                    Intent intent10 = new Intent(MainActivity.this, Ex10MediaActivity.class);
                    startActivity(intent10);
                    break;
                case R.id.btn11:
                    Intent intent11 = new Intent(MainActivity.this, Ex11GalleryViewEx.class);
                    startActivity(intent11);
                    break;
                case R.id.btn12:
                    Intent intent12 = new Intent(MainActivity.this, Ex12SoccerGameEx.class);
                    startActivity(intent12);
                    break;
                case R.id.btn13:
                    Intent intent13 = new Intent(MainActivity.this, Ex13HadlerActivity.class);
                    startActivity(intent13);
                    break;
                case R.id.btn14:
                    Intent intent14 = new Intent(MainActivity.this, Ex14SharedPreferencesActivity.class);
                    startActivity(intent14);
                    break;
                case R.id.btn15:
                    Intent intent15 = new Intent(MainActivity.this, Ex15SharedPreferences2Activity.class);
                    startActivity(intent15);
                    break;
                case R.id.btn16:
                    Intent intent16 = new Intent(MainActivity.this, Ex16FrameLayoutActivity.class);
                    startActivity(intent16);
                    break;
            }
        }
    };
}