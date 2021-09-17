package com.giko.popupdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        ImageView btnBack = findViewById(R.id.btnBack);

        EditText edtRegEmail = findViewById(R.id.edtRegEmail);
        EditText edtRegPassword = findViewById(R.id.edtRegPassword);
        EditText edtRegPasswordConfirm = findViewById(R.id.edtRegPasswordConfirm);

        Button btnCreateAccount = findViewById(R.id.btnCreateAccount);
        TextView btnCreateWithGoogle = findViewById(R.id.btnCreateWithGoogle);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            }
        });
    }
}