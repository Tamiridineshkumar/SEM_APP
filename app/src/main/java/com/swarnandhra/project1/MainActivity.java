package com.swarnandhra.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn(View view){
        Intent chinni=new Intent(MainActivity.this, branch.class);
        startActivity(chinni);
    }
    public void btn2(View view){
        Intent chinni=new Intent(MainActivity.this, SYBranch.class);
        startActivity(chinni);
    }
    public void btn3(View view){
        Intent chinni=new Intent(MainActivity.this, TYBranch.class);
        startActivity(chinni);
    }
    public void btn4(View view){
        Intent chinni=new Intent(MainActivity.this, FY_Branch.class);
        startActivity(chinni);
    }
}