package com.funappss.chandra.burgerrating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);
    }

    public void submit(View view){
        float ratingValue;
        ratingValue = ratingBar.getRating();

        if (ratingValue < 2){
            textView.setText("Rating: " + ratingValue + "\n we will try better next time.");
        }else if (ratingValue <= 3 && ratingValue >= 2){
            textView.setText("Rating: " + ratingValue + "\n we are constantly improving");
        }else if (ratingValue <= 4 && ratingValue >= 3){
            textView.setText("Rating: " + ratingValue + "\n We will improve and make you happy");
        }else if (ratingValue <= 5 && ratingValue >= 4){
            textView.setText("Rating: " + ratingValue + "\n Awesome!!, we are glad you like us");
        }
    }
}
