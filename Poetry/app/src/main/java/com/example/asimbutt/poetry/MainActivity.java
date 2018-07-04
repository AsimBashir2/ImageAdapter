package com.example.asimbutt.poetry;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView start_btn,share_btn,moreapp_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start_btn=(TextView) findViewById(R.id.start_btn);
        share_btn=(TextView) findViewById(R.id.share_btn);
        moreapp_btn=(TextView) findViewById(R.id.moreapp_btn);


        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Poetry.class);
                startActivity(i);
            }
        });
        share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "share", Toast.LENGTH_SHORT).show();
            }
        });
        moreapp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "more app", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
