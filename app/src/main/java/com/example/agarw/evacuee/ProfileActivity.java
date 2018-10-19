package com.example.agarw.evacuee;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    Button viewFam;
    Button basictool;
    Button contactSupp;
    Toolbar proftoolbar;
    Button stranded;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilepage);

        viewFam = findViewById(R.id.viewFam);
        basictool = findViewById(R.id.basicTool);
        contactSupp = findViewById(R.id.contact);
        proftoolbar = findViewById(R.id.profTool);
        stranded = findViewById(R.id.buttonstranded);

        proftoolbar.setTitle("Welcome");





        basictool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ProfileActivity.this, Basictoolclass.class));

            }
        });

        contactSupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileActivity.this, ContactSuppClass.class));
            }
        });

        viewFam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileActivity.this, Family.class));
            }
        });

        stranded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileActivity.this, Stranded.class));
            }
        });
    }
}
