package com.example.agarw.evacuee;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ContactSuppClass extends AppCompatActivity {

    TextView contactSupp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactsuppxml);

        contactSupp = findViewById(R.id.contactsupp);

        contactSupp.setKeyListener(null);
    }
}
