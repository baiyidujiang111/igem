package com.example.damngerm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class rule extends AppCompatActivity {
    Button button10,button11,button12,button13;
    TextView textView2,textView3,textView4,textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rule);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        button10=findViewById(R.id.button10);
        button11=findViewById(R.id.button11);
        button12=findViewById(R.id.button12);
        button13=findViewById(R.id.button13);

        textView5.setVisibility(View.GONE);
        textView4.setVisibility(View.GONE);
        textView3.setVisibility(View.GONE);
        textView2.setVisibility(View.VISIBLE);
        button13.setVisibility(View.GONE);
        button12.setVisibility(View.GONE);
        button11.setVisibility(View.GONE);
        button10.setVisibility(View.VISIBLE);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button10.setVisibility(View.GONE);
                textView2.setVisibility(View.GONE);
                button11.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.VISIBLE);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button11.setVisibility(View.GONE);
                textView3.setVisibility(View.GONE);
                button12.setVisibility(View.VISIBLE);
                textView4.setVisibility(View.VISIBLE);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button12.setVisibility(View.GONE);
                textView4.setVisibility(View.GONE);
                button13.setVisibility(View.VISIBLE);
                textView5.setVisibility(View.VISIBLE);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent();
                it.setClass(rule.this,MainActivity.class);
                rule.this.startActivity(it);
            }
        });
    }
}
