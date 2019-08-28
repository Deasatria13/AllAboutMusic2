package com.example.allaboutmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

            getSupportActionBar().hide();
    }

    public void btnkembali(View view) {
        Intent kembali = new Intent(Profile.this,Home.class);
        startActivity(kembali);
        finish();
    }
}
