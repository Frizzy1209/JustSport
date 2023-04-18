package com.example.justsport.Sports;

import static com.example.justsport.R.layout.activity_allsports;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.justsport.MainActivity;
import com.example.justsport.R;

public class AllSportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_allsports);

        // Intent intentFromMainActivitty = new Intent();


    }

    public void backButton (View view){
        Intent intentBackToMain = new Intent(this, MainActivity.class);

        startActivity(intentBackToMain);
    }

}
