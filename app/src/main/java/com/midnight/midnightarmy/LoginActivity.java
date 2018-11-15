package com.midnight.midnightarmy;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {


    private EditText username_login;
    private EditText password_login;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //imi intoarce un sir de caractere
        username_login = findViewById(R.id.editTextUsernameLogin);
        password_login = findViewById(R.id.editTextPasswordLogin);

        submit=(Button)findViewById(R.id.btnSubmitLogin);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logInCredentials(view);
            }
        });


    }



    public void logInCredentials(View view){
        if(username_login !=null && password_login !=null){

         if("".equals(username_login.getText().toString()) || "".equals(password_login.getText().toString())){

             AlertDialog.Builder builder= new AlertDialog.Builder(this);
             builder.setTitle(R.string.error_text);
             builder.setMessage("Unknown soldier! You enemy?! ");
             builder.setPositiveButton("OK",null);
             AlertDialog dialog =builder.create();
             dialog.show();


         }

        }



    }







}
