package org.codehunter.parentalcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;


public class Food_list extends AppCompatActivity {
    float mx,my;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        final ImageView img = (ImageView) this.findViewById(R.id.listV);

        img.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View arg0, MotionEvent event) {

                float curX, curY;


                switch (event.getAction()) {


                    case MotionEvent.ACTION_DOWN:
                        //mx = event.getX();
                        my = event.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        //curX = event.getX();
                        curY = event.getY();
                        img.scrollBy(0,(int) (my - curY));
                        //mx = curX;
                        my = curY;
                        break;
                    case MotionEvent.ACTION_UP:
                        //curX = event.getX();
                        curY = event.getY();
                        img.scrollBy(0,(int) (my - curY));
                        break;
                }

                return true;
            }
        });
    }
}
