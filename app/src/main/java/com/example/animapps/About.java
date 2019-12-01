package com.example.animapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
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
                Intent moveIntent = new Intent(About.this, MainActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.action_about:
                break;
        }
    }
}
