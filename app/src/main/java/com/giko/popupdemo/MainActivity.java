package com.giko.popupdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLG = findViewById(R.id.btnLetsGo);
        TextView btnSignUp = findViewById(R.id.btnSignUp);

        btnLG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RegistrationActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {

        /*if (doubleBackToExitPressedOnce){
            super.onBackPressed();
            return;
        }

        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
        doubleBackToExitPressedOnce = true;*/

        finishAffinity();

    }
}