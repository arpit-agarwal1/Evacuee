package com.example.agarw.evacuee;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.Objects;

import static android.os.Build.ID;

public class Family extends AppCompatActivity {


    Button getData;
    String Phone, Name, Emaildis;
    TextView famdataphone;
    TextView famdataname;
    private static final String TAG = "Family";
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.familyacc);

        getData = findViewById(R.id.buttonfamGetData);
        famdataphone = findViewById(R.id.editTextPhone);
        famdataname = findViewById(R.id.textViewName);

        db.collection("FamilyAcc")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                @Override
                public void onComplete(@NonNull Task<QuerySnapshot> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), "Good job", Toast.LENGTH_LONG).show();
                        for (QueryDocumentSnapshot document : Objects.requireNonNull(task.getResult())) {

                            Phone = (Objects.requireNonNull(document.get("Phone"))).toString();
                            Name = (Objects.requireNonNull(document.get("name"))).toString();
                            Emaildis = (Objects.requireNonNull(document.get("Email"))).toString();
                            getData.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    display(Phone, Name, Emaildis);
                                }
                            });

                        }

                    } else {
                        Toast.makeText(getApplicationContext(), "Error. Task is not successful", Toast.LENGTH_LONG).show();
//                        Log.w(TAG, "ERROR", task.getException());
                    }
                }
            });
    }
    public void display(String Phone, String Name, String Emaildis){

        famdataphone.setText(Phone);
        famdataname.setText(Name);

    }
}
