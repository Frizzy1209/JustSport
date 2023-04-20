package com.example.justsport;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ImageButton;
        import android.widget.Spinner;

public class SportsListedDependingOnDistanceActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private ImageButton imageButton1, imageButton2, imageButton3, imageButton4;
    private int spinnerValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sportslisteddependingondistance);

        spinner = findViewById(R.id.spinner);
        imageButton1 = findViewById(R.id.imageButton13);
        imageButton2 = findViewById(R.id.imageButton14);
        imageButton3 = findViewById(R.id.imageButton15);
        imageButton4 = findViewById(R.id.imageButton16);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentToChoosePlaceForBookingFromBasketball = new Intent(getApplicationContext(), ChoosePlaceForBookingActivity.class);

                startActivity(intentToChoosePlaceForBookingFromBasketball);

            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentToChoosePlaceForBookingFromTennis = new Intent(getApplicationContext(), ChoosePlaceForBookingActivity.class);

                startActivity(intentToChoosePlaceForBookingFromTennis);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentToChoosePlaceForBookingFromPadeltennis = new Intent(getApplicationContext(), ChoosePlaceForBookingActivity.class);

                startActivity(intentToChoosePlaceForBookingFromPadeltennis);

            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentToChoosePlaceForBookingFromFodbold = new Intent(getApplicationContext(), ChoosePlaceForBookingActivity.class);

                startActivity(intentToChoosePlaceForBookingFromFodbold);

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        spinnerValue = Integer.parseInt(parent.getItemAtPosition(position).toString());
        updateImageButtons();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    private void updateImageButtons() {
        switch (spinnerValue) {
            case 1:
                imageButton1.setVisibility(View.VISIBLE);
                imageButton2.setVisibility(View.GONE);
                imageButton3.setVisibility(View.GONE);
                imageButton4.setVisibility(View.GONE);
                break;
            case 2:
                imageButton1.setVisibility(View.VISIBLE);
                imageButton2.setVisibility(View.VISIBLE);
                imageButton3.setVisibility(View.GONE);
                imageButton4.setVisibility(View.GONE);
                break;
            case 3:
                imageButton1.setVisibility(View.VISIBLE);
                imageButton2.setVisibility(View.VISIBLE);
                imageButton3.setVisibility(View.VISIBLE);
                imageButton4.setVisibility(View.GONE);
                break;
            case 4:
                imageButton1.setVisibility(View.VISIBLE);
                imageButton2.setVisibility(View.VISIBLE);
                imageButton3.setVisibility(View.VISIBLE);
                imageButton4.setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
    }


}

