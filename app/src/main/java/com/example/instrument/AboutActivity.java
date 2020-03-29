package com.example.instrument;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class AboutActivity extends AppCompatActivity {

    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        imgPhoto = findViewById(R.id.img_item_photo);

    }
}
