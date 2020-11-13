package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        String [] message ;
        message = intent.getStringArrayExtra(MainActivity.EXTRA_MESSAGE);
        TextView displayName = findViewById(R.id.DisplayTxtName);
        displayName.setText("Name: "+ message[0]);

        TextView displayDOB = findViewById(R.id.DisplayTxtDOB);
        displayDOB.setText("DOB: "+ message[1]);

        TextView displayAddress = findViewById(R.id.DisplayTxtAddress);
        displayAddress.setText("Address: "+ message[2]);

        TextView displayCity = findViewById(R.id.DisplayTxtCity);
        displayCity.setText("City: "+ message[3]);

        TextView displayPin = findViewById(R.id.DisplayTxtPinCode);
        displayPin.setText("PIN Code: "+ message[4]);

        TextView displayMobile = findViewById(R.id.DisplayTxtMobile);
        displayMobile.setText("Mobile: "+ message[5]);

        TextView displayEmail = findViewById(R.id.DisplayTxtEmail);
        displayEmail.setText("Email: "+ message[6]);

        TextView displayInterest = findViewById(R.id.DisplayTxtInterest);
        displayInterest.setText("Interest: "+ message[7]);

        TextView displayProfile = findViewById(R.id.DisplayTxtProfile);
        displayProfile.setText("Profile: "+ message[8]);

        TextView displayExperience = findViewById(R.id.DisplayTxtExperience);
        displayExperience.setText("Experience: "+ message[9]);
    }
}