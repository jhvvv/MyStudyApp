package com.kwon.mystudyapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EX1JoinResultActivity extends AppCompatActivity {

    TextView tvId, tvPw, tvName, tvHp, tvGender, tvAddr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_result);

        tvId = (TextView) findViewById(R.id.tvId);
        tvPw = (TextView) findViewById(R.id.tvPw);
        tvName = (TextView) findViewById(R.id.tvName);
        tvHp = (TextView) findViewById(R.id.tvHp);
        tvGender = (TextView) findViewById(R.id.tvGender);
        tvAddr = (TextView) findViewById(R.id.tvAddr);

        //전달받은 데이타 받기
        Intent getData = getIntent();
        tvId.setText(getData.getStringExtra("id"));
        tvPw.setText(getData.getStringExtra("pw"));
        tvName.setText(getData.getStringExtra("name"));
        tvHp.setText(getData.getStringExtra("hp"));
        tvGender.setText(getData.getStringExtra("gender"));
        tvAddr.setText(getData.getStringExtra("addr"));

    }
}