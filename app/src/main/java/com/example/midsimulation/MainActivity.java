package com.example.midsimulation;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner genderSpinner = findViewById(R.id.genderSpinner);
        TextView genderText = findViewById(R.id.genderText);
        ImageView genderImage = findViewById(R.id.genderImage);

        genderSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(
                            AdapterView<?> parent,
                            View view,
                            int position,
                            long id) {

                        if (position == 0) {
                            genderText.setText(R.string.male);
                            genderText.setTextColor(Color.BLUE);

                            genderImage.setImageResource(R.drawable.male);
                            genderImage.setContentDescription(
                                    getString(R.string.male)
                            );
                        } else {
                            genderText.setText(R.string.female);
                            genderText.setTextColor(
                                    Color.rgb(255, 105, 180)
                            );

                            genderImage.setImageResource(R.drawable.female);
                            genderImage.setContentDescription(
                                    getString(R.string.female)
                            );
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        genderText.setText(R.string.male);
                        genderText.setTextColor(Color.BLUE);

                        genderImage.setImageResource(R.drawable.male);
                        genderImage.setContentDescription(
                                getString(R.string.male)
                        );
                    }
                }
        );

        genderSpinner.setSelection(0);
    }
}