package com.swarnandhra.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FY_Branch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fy_branch);
    }
    public void btn229(View view) {
        Intent chinni = new Intent(FY_Branch.this, FY_CSE_Sub.class);
        startActivity(chinni);
    }
    public void btn231(View view) {
        Intent chinni = new Intent(FY_Branch.this, FY_ECE_Sub.class);
        startActivity(chinni);
    }
    public void btn230(View view) {
        Intent chinni = new Intent(FY_Branch.this, FY_EEE_Sub.class);
        startActivity(chinni);
    }
    public void btn232(View view) {
        Intent chinni = new Intent(FY_Branch.this, FY_IT_Sub.class);
        startActivity(chinni);
    }
    public void btn233(View view) {
        Intent chinni = new Intent(FY_Branch.this, FY_AIML_Sub.class);
        startActivity(chinni);
    }
    public void btn234(View view) {
        Intent chinni = new Intent(FY_Branch.this, FY_CIVIL_Sub.class);
        startActivity(chinni);
    }
    public void btn235(View view) {
        Intent chinni = new Intent(FY_Branch.this, FY_MECH_Sub.class);
        startActivity(chinni);
    }
}