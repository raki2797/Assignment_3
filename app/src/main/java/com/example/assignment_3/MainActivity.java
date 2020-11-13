package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.assignment_3.extra.MESSAGE";
    private EditText mMessageEditText1;
    private EditText mMessageEditText2;
    private EditText mMessageEditText3;
    private EditText mMessageEditText4;
    private EditText mMessageEditText5;
    private EditText mMessageEditText6;
    private EditText mMessageEditText7;
    private EditText mMessageEditText8;
    private EditText mMessageEditText9;
    private EditText mMessageEditText10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText1 = findViewById(R.id.editTxtName);
        mMessageEditText2 = findViewById(R.id.editTxtDOB);
        mMessageEditText3 = findViewById(R.id.editTxtAddress);
        mMessageEditText4 = findViewById(R.id.editTxtCity);
        mMessageEditText5 = findViewById(R.id.editTxtPinCode);
        mMessageEditText6 = findViewById(R.id.editTxtMobile);
        mMessageEditText7 = findViewById(R.id.editTxtEmail);
        mMessageEditText8 = findViewById(R.id.editTxtInterest);
        mMessageEditText9 = findViewById(R.id.editTxtProfile);
        mMessageEditText10 = findViewById(R.id.editTxtExperience);
    }

    public void onBtnClick(View view) {
        String [] message = new String[10];
        message[0] = mMessageEditText1.getText().toString();
        message[1] = mMessageEditText2.getText().toString();
        message[2] = mMessageEditText3.getText().toString();
        message[3] = mMessageEditText4.getText().toString();
        message[4] = mMessageEditText5.getText().toString();
        message[5] = mMessageEditText6.getText().toString();
        message[6] = mMessageEditText7.getText().toString();
        message[7] = mMessageEditText8.getText().toString();
        message[8] = mMessageEditText9.getText().toString();
        message[9] = mMessageEditText10.getText().toString();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}