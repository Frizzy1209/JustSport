package com.example.justsport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ChoosePlaceForBookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseplaceforbooking);

    }


    public void returnKnap (View view) {

        Intent intentToMainActivity = new Intent(this, MainActivity.class);

    }

    public void hafniahallen (View view) {

        Intent intentFromHafniahallenToDateAndTime = new Intent(this,ChoosingDateAndTime.class);

        startActivity(intentFromHafniahallenToDateAndTime);

    }

    public void svanemøllehallen (View view) {

        Intent intentFromSvanemøllehallenToChoosingDateAndTime = new Intent(this,ChoosingDateAndTime.class);

        startActivity(intentFromSvanemøllehallenToChoosingDateAndTime);

    }

    public void grøndalMulticenter (View view) {

        Intent intentFromGrøndalMultiCenterToDateAndTime = new Intent(this,ChoosingDateAndTime.class);

        startActivity(intentFromGrøndalMultiCenterToDateAndTime);

    }


}
