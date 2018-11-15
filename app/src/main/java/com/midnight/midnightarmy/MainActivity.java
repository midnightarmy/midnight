package com.midnight.midnightarmy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button loginButton;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.btnLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              openLogin(view);
            }
        });


        registerButton = (Button) findViewById(R.id.btnRegister);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegister(view);
            }
        });
    }

    //the methods for the buttons declared above in order to open the next activities
    public void openLogin(View view) {
        Intent explicitIntent= new Intent(MainActivity.this, LoginActivity.class);
        startActivity(explicitIntent);
    }

    public void openRegister(View view) {
        Intent explicitIntent= new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(explicitIntent);
    }

    public void logInCredentials(View view) {
        Intent explicitIntent= new Intent(this,LoginActivity.class);
        startActivity(explicitIntent);
    }

    public void RegisterCredentials(View view) {
        Intent explicitIntent= new Intent(this, RegisterActivity.class);
        startActivity(explicitIntent);
    }
}
