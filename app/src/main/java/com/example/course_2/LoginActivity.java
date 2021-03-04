package com.example.course_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText username, password;
    private Button btnLogin;
    private static final  String STATE_RESULT = "state_result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(LoginActivity.this);

    }




    @Override
    public void onClick(View v) {

        String usernameKey = username.getText().toString();
        String passwordKey = password.getText().toString();

        boolean isEmpty = false;

        if(TextUtils.isEmpty(usernameKey)){
            isEmpty = true;
            username.setError("Cannot be empty");
        }

        if(TextUtils.isEmpty(passwordKey)){
            isEmpty = true;
            password.setError("Cannot be empty");
        }

        if(!isEmpty) {
            if (usernameKey.equals("sawitri") && passwordKey.equals("cantiq")) {

                // Login Berhasil
                Toast.makeText(getApplicationContext(), "Welcome to App Sawi",
                        Toast.LENGTH_SHORT).show();
                Intent listintent = new Intent(LoginActivity.this, SuccessActivity.class);
                LoginActivity.this.startActivity(listintent);
                finish();
            } else {
                // Gagal Login
                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                builder.setMessage("Your username or password is incorrect!")
                        .setNegativeButton("Retry", null).create().show();
            }
        }
    }
}