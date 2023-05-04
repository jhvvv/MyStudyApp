package com.kwon.mystudyapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EX1JoinActivity extends AppCompatActivity {
    TextView gender;
    TextView live;
    Button btnJoin;
    Switch switchGender;
    Spinner liveSpinner;

    EditText etJoinId, etJoinPw, etJoinName, etJoinHp, etJoinAddr;
    String[] liveitems = {"서울", "대전", "대구", "부산"};
    String temp2 = "";

    String sendId, sendPw, sendName, sendHp, sendGender = "남자", sendAddr = "서울";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        etJoinId = (EditText) findViewById(R.id.etJoinId);
        etJoinPw = (EditText) findViewById(R.id.etJoinPw);
        etJoinName = (EditText) findViewById(R.id.etJoinName);
        etJoinHp = (EditText) findViewById(R.id.etJoinHp);
        etJoinAddr = (EditText) findViewById(R.id.etJoinAddr);
        gender = (TextView) findViewById(R.id.etJoinGender);
        btnJoin = (Button) findViewById(R.id.btnJoin);


        switchGender = findViewById(R.id.switchGender);

        switchGender.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    gender.setText("여자");
                } else {
                    gender.setText("남자");
                }
            }
        });
        btnJoin.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view)
            {
                sendId = etJoinId.getText().toString();
                sendPw = etJoinPw.getText().toString();
                sendName = etJoinName.getText().toString();
                sendHp = etJoinHp.getText().toString();


                Intent intent = new Intent(EX1JoinActivity.this, EX1JoinResultActivity.class);
                intent.putExtra("id", sendId);
                intent.putExtra("pw", sendPw);
                intent.putExtra("name", sendName);
                intent.putExtra("hp", sendHp);
                intent.putExtra("gender", sendGender);
                intent.putExtra("addr", sendAddr);
                startActivity(intent);
            }
        });

        live = (TextView) findViewById(R.id.etJoinAddr);

        Spinner liveSpinner = (Spinner) findViewById(R.id.liveSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, liveitems
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // 스피너에 어댑터 설정
        liveSpinner.setAdapter(adapter);

        // 스피너에서 선택 했을 경우 이벤트 처리
        liveSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                live.setText(liveitems[position]);
                temp2 = liveitems[position];
                Log.d("스피너테스트", "선택값 저장된 변수 temp : " + temp2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                live.setText("선택 : ");
            }
        });
    }

}