package com.midnight.midnightarmy;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private Button   submitRegister;
    private EditText usernameEditText;
    private EditText idEditText;
    private EditText passwordEditText;
    private EditText confirmPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usernameEditText = findViewById(R.id.editTextUsernameRegister);
        idEditText = findViewById(R.id.editTextIDRegister);
        passwordEditText = findViewById(R.id.editTextPasswordRegister);
        confirmPasswordEditText = findViewById(R.id.editTextConfirmPasswordRegister);

        submitRegister=(Button)findViewById(R.id.btnSubmitRegister);
        submitRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegisterCredentials(view);
            }
        });

    }

    public void RegisterCredentials(View view) {
        if (usernameEditText != null && idEditText != null && passwordEditText != null && confirmPasswordEditText != null ) {

            if ("".equals(usernameEditText.getText().toString()) || "".equals(idEditText.getText().toString()) ||
                    "".equals(passwordEditText.getText().toString()) || "".equals((confirmPasswordEditText.getText().toString()))) {


                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("");
                builder.setMessage("Dear recruit, your top secret file is incomplete!");
                builder.setPositiveButton("OK", null);
                AlertDialog dialog = builder.create();
                dialog.show();


            }

            if(passwordEditText.getText().toString() != confirmPasswordEditText.getText().toString()){

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("");
                builder.setMessage("Not paying attention is deadly on the WarZone! " +
                                   "Check password again!");
                builder.setPositiveButton("OK", null);
                AlertDialog dialog = builder.create();
                dialog.show();



            }






        }

    }
}
