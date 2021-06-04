package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private EditText et_title;
    private Button btn_snd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        et_title = findViewById(R.id.et_txt);
        btn_snd = findViewById(R.id.btn_S);
        btn_snd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,et_title.getText().toString(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("text",et_title.getText().toString());
                startActivity(intent);
            }
        });
    }
}