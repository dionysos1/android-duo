package com.example.joshua.projectduo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import static com.example.joshua.projectduo.R.*;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //public DatabaseReference mDatabase;

        //mDatabase = FirebaseDatabase.getInstance().getReference();

        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        Button btn = (Button)findViewById(id.buttonGuns);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, gunsActivity.class));
            }
        });



    }

    private void setupNewGun(String ammo, int damage, String img, String naam, String type) {
        Gun gun = new Gun(ammo, damage, img, naam, type);
    }
}
