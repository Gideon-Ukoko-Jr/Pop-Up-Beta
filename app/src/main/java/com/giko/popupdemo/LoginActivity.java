package com.giko.popupdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText edtLoginEmail = findViewById(R.id.edtLoginEmail);
        EditText edtLoginPassword = findViewById(R.id.edtLoginPassword);
        TextView txtForgotPassword = findViewById(R.id.txtForgotPassword);
        Button btnGetIn = findViewById(R.id.btnGetIn);
        TextView btnContWithGoogle = findViewById(R.id.btnContWithGoogle);
        TextView txtSignUp = findViewById(R.id.txtSignUp);

        btnGetIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            }
        });

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RegistrationActivity.class));
            }
        });
    }
}