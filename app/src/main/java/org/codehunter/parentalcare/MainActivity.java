package org.codehunter.parentalcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickGeneralInfo(View view){
        Intent i =new Intent(this, GeneralInfo.class);
        //Intent i =new Intent(this, Food_list.class);
        startActivity(i);

    }
    public void onClickRegistration(View view){
        Intent i =new Intent(this, User_Signup.class);
        startActivity(i);

    }

    public void onClickProfile(View view){
        Intent i =new Intent(this, AfterBirth.class);
        startActivity(i);

    }
}
