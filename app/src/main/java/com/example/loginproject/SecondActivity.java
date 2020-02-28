package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    Button backToMainActivityButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(SecondActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

        backToMainActivityButton = (Button) findViewById(R.id.logoutButton);
        backToMainActivityButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent logoutIntent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(logoutIntent);
    }
}
