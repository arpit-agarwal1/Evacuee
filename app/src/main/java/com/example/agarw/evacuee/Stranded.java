package com.example.agarw.evacuee;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Stranded extends AppCompatActivity {

    TextView confirm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stranded);

        confirm = findViewById(R.id.editTextConfirm);
    }
}
