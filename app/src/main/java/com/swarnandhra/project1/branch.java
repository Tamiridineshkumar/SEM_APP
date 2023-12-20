package com.swarnandhra.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class branch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
    }
    public void btn5(View view){
        Intent chinni=new Intent(branch.this, Subject4.class);
        startActivity(chinni);
    }
    public void btn15(View view){
        Intent chinni=new Intent(branch.this, ECESUB.class);
        startActivity(chinni);
    }
    public void btn25(View view){
        Intent chinni=new Intent(branch.this, ITSEM.class);
        startActivity(chinni);
    }
    public void btn35(View view){
        Intent chinni=new Intent(branch.this, ITSUB.class);
        startActivity(chinni);
    }
    public void btn45(View view){
        Intent chinni=new Intent(branch.this, AIMLSUB.class);
        startActivity(chinni);
    }
    public void btn55(View view){
        Intent chinni=new Intent(branch.this, CIVILSEM.class);
        startActivity(chinni);
    }
    public void btn65(View view){
        Intent chinni=new Intent(branch.this, MECHSEM.class);
        startActivity(chinni);
    }


}