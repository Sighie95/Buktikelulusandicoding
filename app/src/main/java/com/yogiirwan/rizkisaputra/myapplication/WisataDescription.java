package com.yogiirwan.rizkisaputra.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WisataDescription extends AppCompatActivity {
    public static final String EXTTRA_NAMATEMPAT = "nama_tempat";
    public static final String EXTTRA_ALAMAT = "alamat";
    public static final String EXTTRA_JENIS = "jenis";
    public static final String EXTTRA_DESKRIPSI = "deskripsi";
    public static final String EXTTRA_FOTO = "foto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_description);

        ImageView imgView = findViewById(R.id.tv_wisata_defoto);
        TextView tvNamaTempat = findViewById(R.id.tv_denama_tempat);
        TextView tvAlamat = findViewById(R.id.tv_dealamat);
        TextView tvJenis = findViewById(R.id.tv_dejenis);
        TextView tvDeskripsi = findViewById(R.id.tv_deketerangan);


        int foto = getIntent().getIntExtra(EXTTRA_FOTO, 0);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), foto);
        imgView.setImageBitmap(bmp);

        tvNamaTempat.setText(getIntent().getStringExtra(EXTTRA_NAMATEMPAT));
        tvAlamat.setText(getIntent().getStringExtra(EXTTRA_ALAMAT));
        tvJenis.setText(getIntent().getStringExtra(EXTTRA_JENIS));
        tvDeskripsi.setText(getIntent().getStringExtra(EXTTRA_DESKRIPSI));

    }
}
