package com.example.jj_club;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiTestQ5Activity extends AppCompatActivity {

    private Button btnLogin1;
    private Button btnLogin2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mbti_test_q5);

        btnLogin1 = findViewById(R.id.button_login);
        btnLogin2 = findViewById(R.id.button_login3);

        btnLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼1이 클릭되었을 때 mbti_test_q2.xml 페이지로 이동
                Intent intent = new Intent(MbtiTestQ5Activity.this, MbtiTestQ6Activity.class);
                startActivity(intent);
            }
        });

        btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼2가 클릭되었을 때 mbti_test_q2.xml 페이지로 이동
                Intent intent = new Intent(MbtiTestQ5Activity.this, MbtiTestQ6Activity.class);
                startActivity(intent);
            }
        });
    }
}