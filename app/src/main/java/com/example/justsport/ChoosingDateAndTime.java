package com.example.justsport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ChoosingDateAndTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosingdateandtime);

    }

    public void bekræftBooking (View view) {

        Intent intentToBookFinal = new Intent(this, BookFinalActivity.class);

        startActivity(intentToBookFinal);

    }
}
