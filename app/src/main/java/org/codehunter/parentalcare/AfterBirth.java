package org.codehunter.parentalcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AfterBirth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_birth);
    }

    public void onClickAfterBirthMother(View view){
        Intent i =new Intent(this,AfterBirthMother.class);
        startActivity(i);

    }
    public void onClickChild(View view){
        Intent i =new Intent(this,Child.class);
        startActivity(i);

    }
}
