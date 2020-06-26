package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
    }

    public void onLogin(View view){
        String emailEntered = email.getText().toString();
        String passwordEntered = password.getText().toString();

        Toast.makeText(this, "Email Entered:" + emailEntered + "Password Entered:" + passwordEntered, Toast.LENGTH_SHORT).show();

    }
}