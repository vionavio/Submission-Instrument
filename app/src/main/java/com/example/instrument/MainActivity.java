package com.example.instrument;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.example.instrument.adapter.CardViewInstrumentAdapter;
import com.example.instrument.adapter.GridInstrumentAdapter;
import com.example.instrument.adapter.ListInstrumentAdapter;
import com.example.instrument.data.InstrumentData;
import com.example.instrument.model.Instrument;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHeroes;
    private ArrayList<Instrument> list = new ArrayList<>();
    private String title = "Classical Instrument";
    private Button about;
    Toolbar mTopToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTopToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mTopToolbar);

       // about = findViewById(R.id.about);
        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(InstrumentData.getListData());
        showRecylerList();
    }

    private void showRecylerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListInstrumentAdapter listInstrumentAdapter = new ListInstrumentAdapter(list);
        rvHeroes.setAdapter(listInstrumentAdapter);

        listInstrumentAdapter.setOnItemClickCallback(new ListInstrumentAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Instrument data) {
                showSelectedInstrument(data);
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
       return super.onOptionsItemSelected(item);


    }

    private void showSelectedInstrument(Instrument Instrument) {

        Toast.makeText(this, "You Choose " + Instrument.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DetailActivity.class);
        Bundle bun = new Bundle();
        bun.putInt("gambar", Instrument.getPhoto());
        bun.putString("nama", Instrument.getName());
        bun.putString("penemu", Instrument.getPenemu());
        bun.putString("tahun", Instrument.getTahun());
        bun.putString("tempat", Instrument.getTempat());
        bun.putString("detail", Instrument.getDetail());
        intent.putExtras(bun);
        startActivity(intent);


    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
//            case R.id.action_list:
//                showRecylerList();
//                break;
//            case R.id.action_grid:
//                showRecyclerGrid();
//                break;
//            case R.id.action_cardview:
//                showRecyclerCardView();
//                break;
            case R.id.about:
                startActivity(new Intent(this, AboutActivity.class));
                break;
        }
        setActionBarTitle(title);
    }



    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
//
//    private void showRecyclerGrid(){
//        rvHeroes.setLayoutManager(new GridLayoutManager(this, 2));
//        GridInstrumentAdapter gridInstrumentAdapter = new GridInstrumentAdapter(list);
//        rvHeroes.setAdapter(gridInstrumentAdapter);
//        gridInstrumentAdapter.setOnItemClickCallback(new GridInstrumentAdapter.OnItemClickCallback() {
//            @Override
//            public void onItemClicked(Instrument data) {
//                showSelectedInstrument(data);
//            }
//        });
//    }
//
//    private void showRecyclerCardView(){
//        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
//        CardViewInstrumentAdapter cardViewInstrumentAdapter = new CardViewInstrumentAdapter(list);
//        rvHeroes.setAdapter(cardViewInstrumentAdapter);
//    }
//


}
