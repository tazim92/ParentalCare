package org.codehunter.parentalcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
    }


    public void onClickTakeData(View view){
        EditText etKG = (EditText) findViewById(R.id.editTextKG);
        EditText etFT = (EditText) findViewById(R.id.editTextFT);
        EditText etINC = (EditText) findViewById(R.id.editTextINC);
        int weight=0,feet=0,inc=0;

        if(etKG.getText().toString()==null)
        {
          weight=0;
        }else{
            weight= Integer.parseInt(etKG.getText().toString());
        }

        if(etFT.getText().toString()==null)
        {
            feet=0;
        }else {
            feet = Integer.parseInt(etFT.getText().toString());
        }
        if(etINC.getText().toString()==null) {
            inc=0;
        }else{
            inc=  Integer.parseInt(etINC.getText().toString());
        }

          calculateBMI(weight, feet, inc);
    }


    public void calculateBMI(int weight, int feet, int inc){
        float BMI;
        float height ;
        height = (float) (( float ) ( feet ) * 0.3048);
        height += ( float ) ( inc ) * 0.0254 ;
        BMI = ( float ) ( weight ) / ( height * height );

        TextView tv = (TextView)findViewById(R.id.textViewBMI);
        String str;

       str="Your BMI is "+  Float.toString(BMI);

        tv.setText(str);

        setBMIWarning(BMI);

    }



    public void setBMIWarning(float BMI){

        String status=null;
        if(BMI<18.5){
            status="Underweight";
        }
        else if( (BMI>=18.5) && (BMI<=24.9)){
            status="Normal";
        }
        else if((BMI>=25) && (BMI<=29.9)){
            status="Overweight";
        }
        else if(BMI>30.0){
            status="Obese";
        }

    }



}
