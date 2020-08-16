package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText txt1 = (EditText) findViewById(R.id.Name1);
        txt1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                 String getText=txt1.getText().toString();
                Button button = (Button)findViewById(R.id.buttonPick);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Information.class);
                        intent.putExtra("mytext",getText);
                        startActivity(intent);
                    }

                });
            }
        });

        EditText txt2 = (EditText) findViewById(R.id.Name2);
        txt2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String getText=txt2.getText().toString();
                Button button = (Button)findViewById(R.id.buttonPick);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Information.class);
                        intent.putExtra("mytext",getText);
                        startActivity(intent);
                    }

                });

            }
        });
        EditText txt3 = (EditText) findViewById(R.id.Name3);
        txt3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                String getText=txt3.getText().toString();
                Button button = (Button)findViewById(R.id.buttonPick);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Information.class);
                        intent.putExtra("mytext",getText);
                        startActivity(intent);
                    }

                });

            }
        });



    }
}