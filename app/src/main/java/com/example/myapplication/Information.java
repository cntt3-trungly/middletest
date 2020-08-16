package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_information);

        TextView mTextview = (TextView) findViewById(R.id.text_name);
        TextView mTextview1 = (TextView) findViewById(R.id.text_age);
        TextView mTextview2 = (TextView) findViewById(R.id.lydo);
        if (getIntent().getStringExtra("mytext").startsWith("N")) {
            mTextview.setText(getIntent().getStringExtra("mytext"));
            mTextview1.setText("25");
            mTextview2.setText("Lý do : Mùa covid này đỡ cạp đất mà ăn :)");
        } else if (getIntent().getStringExtra("mytext").startsWith("My")) {
            mTextview.setText(getIntent().getStringExtra("mytext"));
            mTextview1.setText("20");
            mTextview2.setText("Lý do :Hoa khôi mà không thèm thì thôi)");
        } else if (getIntent().getStringExtra("mytext").startsWith("Minh")) {
            mTextview.setText(getIntent().getStringExtra("mytext"));
            mTextview1.setText("43");
            mTextview2.setText("Lý do : Em không ngại lài máy bay bà già đâu : )))");
        }
        Button button = (Button) findViewById(R.id.button_return);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Information.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}