package com.example.course_2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button btn_buy, btn_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_buy = findViewById(R.id.buy);
        btn_buy.setOnClickListener(MainActivity.this);
        btn_log = findViewById(R.id.log);
        btn_log.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.buy:
                Intent link = new Intent(this, LinkActivity.class);
                Toast.makeText(this, "About clicked", Toast.LENGTH_SHORT).show();
                startActivity(link);
                break;

            case R.id.log:
                Intent log = new Intent(this, LoginActivity.class);
                Toast.makeText(this, "About clicked", Toast.LENGTH_SHORT).show();
                startActivity(log);
                break;
        }
    }
}