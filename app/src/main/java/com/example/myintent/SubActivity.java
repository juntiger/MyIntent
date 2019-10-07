package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    Button btn_tomain;
    String printIntent;
    TextView txt_sub, txt_sub2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        btn_tomain = findViewById(R.id.btn_tomain);
        txt_sub = findViewById(R.id.txt_sub);
        txt_sub2 = findViewById(R.id.txt_sub2);

        Intent subIntent = getIntent();
        //printIntent = subIntent.getStringExtra("이름");
        //txt_sub2.setText(printIntent);

        //다운캐스팅. Serializable을 상속받았기 때문에 다운캐스팅을 사용해서 MemberVO타입의 객체로 받음.
        MemberVO vo = (MemberVO)subIntent.getSerializableExtra("member");
        txt_sub2.setText("아이디: " + vo.getId() + "\n비밀번호: " + vo.getPw() + "\n이름: " + vo.getName() + "\n나이: " + vo.getAge());
        btn_tomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}
