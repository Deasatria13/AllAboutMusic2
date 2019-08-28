package com.example.allaboutmusic;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class DetailKurt extends AppCompatActivity {
    ImageView imageView;
    TextView name,role;
    String playername,playerrole;
    int image;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kurt);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Detail Musisi");


        imageView = findViewById(R.id.image);
        name = findViewById(R.id.name);
        role = findViewById(R.id.role);
        playername = getIntent().getStringExtra("name");
        playerrole =  getIntent().getStringExtra("role");
        image = getIntent().getIntExtra("image",0);
        name.setText(playername);
        role.setText(playerrole);
        imageView.setImageResource(image);
    }




}

