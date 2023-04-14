package com.example.justsport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.justsport.Sports.AllSportsActivity;
import com.example.justsport.location.SportsNearYouActivity;

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
        //asdasd
    // asdasd
    // akdsjikas

    public void sportsNearYou (View view) {

        Intent intentToSportsNearYouActivity = new Intent(this, SportsNearYouActivity.class);

        startActivity(intentToSportsNearYouActivity);
    }

}