package com.example.ardo.sessionsharedpreferences;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SharedPreference sharedPreference;
    private String sHallo;
    private TextView tvHallo;

    Activity context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

        sharedPreference = new SharedPreference();

        tvHallo = (TextView) findViewById(R.id.hallo);
        sHallo = sharedPreference.getValue(context);
        tvHallo.setText(sHallo);
    }
}
