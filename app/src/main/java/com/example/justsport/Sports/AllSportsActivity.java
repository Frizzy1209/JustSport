package com.example.justsport.Sports;

import static com.example.justsport.R.layout.activity_allsports;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.justsport.ChoosePlaceForBookingActivity;
import com.example.justsport.MainActivity;
import com.example.justsport.R;

public class AllSportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_allsports);
    }

    public void padeltennisImageButton (View view) {

        Intent intentToChoosePlaceForBookingFromAllSportsPadeltennis = new Intent(this, ChoosePlaceForBookingActivity.class);

        startActivity(intentToChoosePlaceForBookingFromAllSportsPadeltennis);

    }

    public void basketballImageButton ( View view) {

        Intent intentToChoosePlaceForBookingFromAllSportsBasketball = new Intent(this, ChoosePlaceForBookingActivity.class);

        startActivity(intentToChoosePlaceForBookingFromAllSportsBasketball);

    }

    public void tennisImageButton (View view) {

        Intent intentToChoosePlaceForBookingFromAllSportsTennis = new Intent(this, ChoosePlaceForBookingActivity.class);

        startActivity(intentToChoosePlaceForBookingFromAllSportsTennis);

    }

    public void fodboldImageButton (View view) {

        Intent intentToChoosePlaceForBookingFromAllSportsFodbold = new Intent(this, ChoosePlaceForBookingActivity.class);

        startActivity(intentToChoosePlaceForBookingFromAllSportsFodbold);

    }

    public void backButton (View view){
        Intent intentBackToMain = new Intent(this, MainActivity.class);

        startActivity(intentBackToMain);
    }

}
