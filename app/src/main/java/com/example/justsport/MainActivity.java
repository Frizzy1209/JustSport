package com.example.justsport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.justsport.Sports.AllSportsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void allSports (View view) {

        Intent intentToAllSportsActivity = new Intent(this, AllSportsActivity.class);

        startActivity(intentToAllSportsActivity);
    }

    public void sportsNearYou (View view) {

        Intent intentToSportsListedDependingOnDistanceActivity = new Intent(this, SportsListedDependingOnDistanceActivity.class);

        startActivity(intentToSportsListedDependingOnDistanceActivity);

    }

}