package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button enterNewActivityButton;
    EditText sendUserIDText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterNewActivityButton = (Button) findViewById(R.id.loginButton);
        sendUserIDText = (EditText) findViewById(R.id.userIdText);

        enterNewActivityButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String userIDStr = sendUserIDText.getText().toString();

        Intent loginIntent = new Intent(MainActivity.this, SecondActivity.class);

        loginIntent.putExtra("name","ABCD");
        loginIntent.putExtra("studentId","1234567");
        loginIntent.putExtra("user",userIDStr);

        startActivity(loginIntent);
    }
}
