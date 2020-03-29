package com.example.instrument;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.instrument.model.Instrument;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class DetailActivity extends AppCompatActivity {

    TextView tvNama,tvDetail, inventedBy, yearInvented, placeInvented;
    ImageView ivPhoto;

    String nama, detail, penemu, tahun ,tempat;
    int  photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivPhoto = findViewById(R.id.imgPhoto);
        tvNama = findViewById(R.id.tvNama);
        tvDetail = findViewById(R.id.tvDetail);
        inventedBy = findViewById(R.id.invented_by);
        yearInvented = findViewById(R.id.year_invented);
        placeInvented = findViewById(R.id.place_invented);


        Bundle bun = this.getIntent().getExtras();
        photo = bun.getInt("gambar");
        nama = bun.getString("nama");
        penemu = bun.getString("penemu");
        tahun = bun.getString("tahun");
        tempat = bun.getString("tempat");
        detail = bun.getString("detail");
        //masukkan data-data barang tersebut ke field editor

        ivPhoto.setImageResource(photo);
        tvNama.setText(nama);
        inventedBy.setText(penemu);
        yearInvented.setText(tahun);
        placeInvented.setText(tempat);
        tvDetail.setText(detail);

    }
}
