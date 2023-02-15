package com.ajayvamsee.exceptioncheck;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity2 extends AppCompatActivity {

    Button button10;
    Button button0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button10 = findViewById(R.id.button_10);
        button0 = findViewById(R.id.button_0);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    callMethodWithParameter(10);
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.d("MainActivity", "The result of the division 10 is: " + e.getMessage());
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    callMethodWithParameter(0);
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.d("MainActivity", "The result of the division 0 is: " + e.getMessage());
                }
            }
        });
    }

    private void callMethodWithParameter(int parameter) {
        int result = 100 / parameter;
        Log.d("MainActivity", "The result of the division is: " + result);
    }
}
