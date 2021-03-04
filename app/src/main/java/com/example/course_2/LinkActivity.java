package com.example.course_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.MovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

import java.util.Calendar;

public class LinkActivity extends AppCompatActivity {

    TextView textLink, linkTextView, textViewLink, viewText, textView, textLinkView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);

    }
}