package com.example.agarw.evacuee;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class Basictoolclass extends AppCompatActivity {

    TextView basicTooltext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basictoolxml);
        basicTooltext = findViewById(R.id.basicTooltext);
        basicTooltext.setKeyListener(null);
    }
}
