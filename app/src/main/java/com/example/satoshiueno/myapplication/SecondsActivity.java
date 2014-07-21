package com.example.satoshiueno.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


import static android.view.View.OnClickListener;

public class SecondsActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconds);

//        TextView textView = (TextView) findViewById(R.id.textView);
//        textView.setText(getIntent().getStringExtra("inputText"));

        findViewById(R.id.button).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondsActivity.this, MyActivity.class);
                startActivity(intent);

            }
        });
    }
}
