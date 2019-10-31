package com.yogiirwan.rizkisaputra.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private ArrayList<WisataObject> list = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        list.addAll(WisataData.getListWO());
        showRecyclerListWisata();
    }

    private void showRecyclerListWisata() {
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        WisataAdapter wisataAdapter = new WisataAdapter(list);
        rvWisata.setAdapter(wisataAdapter);

        wisataAdapter.setOnItemClickCallback(new WisataAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(WisataObject data) {
                showSelectedData(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent profil = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(profil);
        return super.onOptionsItemSelected(item);
    }

    public void showSelectedData(WisataObject wisataObject) {
        Intent detailEco = new Intent(MainActivity.this, WisataDescription.class);
        detailEco.putExtra(WisataDescription.EXTTRA_NAMATEMPAT, wisataObject.getNamaTempat());
        detailEco.putExtra(WisataDescription.EXTTRA_ALAMAT, wisataObject.getAlamat());
        detailEco.putExtra(WisataDescription.EXTTRA_JENIS, wisataObject.getJenis());
        detailEco.putExtra(WisataDescription.EXTTRA_DESKRIPSI, wisataObject.getDeskripsi());
        detailEco.putExtra(WisataDescription.EXTTRA_FOTO, wisataObject.getFoto());
        startActivity(detailEco);
    }
}
