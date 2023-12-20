package com.swarnandhra.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TYBranch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tybranch);
    }
    public void btn152(View view) {
        Intent chinni = new Intent(TYBranch.this, TH_CSE_Sub.class);
        startActivity(chinni);
    }
    public void btn154(View view) {
        Intent chinni = new Intent(TYBranch.this, TY_ECE_Sub.class);
        startActivity(chinni);
    }
    public void btn153(View view) {
        Intent chinni = new Intent(TYBranch.this, TY_EEE_Sub.class);
        startActivity(chinni);
    }
    public void btn155(View view) {
        Intent chinni = new Intent(TYBranch.this, TY_IT_Sub.class);
        startActivity(chinni);
    }
    public void btn156(View view) {
        Intent chinni = new Intent(TYBranch.this, TY_AIML_Sub.class);
        startActivity(chinni);
    }
    public void btn157(View view) {
        Intent chinni = new Intent(TYBranch.this, TY_CIVIL_Sub.class);
        startActivity(chinni);
    }
    public void btn158(View view) {
        Intent chinni = new Intent(TYBranch.this, TY_MECH_Sub.class);
        startActivity(chinni);
    }
}