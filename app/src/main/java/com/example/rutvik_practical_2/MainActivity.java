package com.example.rutvik_practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void showmsg(View view){
    TextView    tv= (TextView) findViewById(R.id.text2);
        count++;
        tv.setText("Count = " +count);

    }
}