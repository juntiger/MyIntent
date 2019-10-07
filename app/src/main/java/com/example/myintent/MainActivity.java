package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn_tosub;
    EditText txt_hint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_tosub = findViewById(R.id.btn_tosub);
        txt_hint = findViewById(R.id.txt_hint);
        btn_tosub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = txt_hint.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);

                MemberVO member = new MemberVO("dragon7so","1234", "문준범",24);
                //오류가 사라진 이유??
                intent.putExtra("member", member);
                startActivity(intent);
            }
        });
    }
}
