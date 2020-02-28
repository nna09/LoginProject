package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    Button backToMainActivityButton;
    TextView nameTextView, studentIDTextView, userIDTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(SecondActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

        backToMainActivityButton = (Button) findViewById(R.id.logoutButton);
        backToMainActivityButton.setOnClickListener(this);

        nameTextView = (TextView) findViewById(R.id.name);
        studentIDTextView = (TextView) findViewById(R.id.StudentID);
        userIDTextView = (TextView) findViewById(R.id.userIDShow);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){

            String name = bundle.getString("name");
            String studentID = bundle.getString("studentId");
            String userID = bundle.getString("user");

            nameTextView.setText(name);
            studentIDTextView.setText(studentID);
            userIDTextView.setText(userID);

        }

    }

    @Override
    public void onClick(View v) {
        Intent logoutIntent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(logoutIntent);
    }
}
