package com.swarnandhra.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SYBranch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sybranch);
    }
    public void btn75(View view) {
        Intent chinni = new Intent(SYBranch.this, SY_CSE_Sub.class);
        startActivity(chinni);
    }
    public void btn76(View view) {
        Intent chinni = new Intent(SYBranch.this, SY_ECE_SUB.class);
        startActivity(chinni);
    }
    public void btn77(View view) {
        Intent chinni = new Intent(SYBranch.this, SY_EEE_Sub.class);
        startActivity(chinni);
    }
    public void btn78(View view) {
        Intent chinni = new Intent(SYBranch.this, SY_IT_Sub.class);
        startActivity(chinni);
    }
    public void btn79(View view) {
        Intent chinni = new Intent(SYBranch.this, SY_AIML_Sub.class);
        startActivity(chinni);
    }
    public void btn80(View view) {
        Intent chinni = new Intent(SYBranch.this, SY_Civil_Sub.class);
        startActivity(chinni);
    }
    public void btn81(View view) {
        Intent chinni = new Intent(SYBranch.this, SY_MECH_Sub.class);
        startActivity(chinni);
    }
}