package com.example.animapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBrand;
    private ArrayList<Brand> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBrand = findViewById(R.id.rv_brands);
        rvBrand.setHasFixedSize(true);

        list.addAll(BrandsData.getListData());
        showRecyclerList();


    }

    private void showRecyclerList(){
        rvBrand.setLayoutManager(new LinearLayoutManager(this));
        ListBrandAdapter listBrandAdapter = new ListBrandAdapter(list);
        rvBrand.setAdapter(listBrandAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMenu(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMenu(int selectedMenu){

        switch (selectedMenu){
            case R.id.action_list:
                break;
            case R.id.action_about:
                Intent moveIntent = new Intent(MainActivity.this, About.class);
                startActivity(moveIntent);
                break;
        }
    }
}
