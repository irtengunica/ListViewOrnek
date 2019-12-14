package com.example.okul.listviewornek;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class ArabaAktivite extends ActionBarActivity {
ArrayList<Araba> lstAraba;
    ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_araba_aktivite);
        lstAraba.add(new Araba(1, "ford", "rsm1", R.drawable.rsm1));
        lstAraba.add(new Araba(2, "mercedes", "rsm2", R.drawable.rsm2));
        lstAraba.add(new Araba(3, "opel", "rsm3", R.drawable.rsm3));
        lstAraba.add(new Araba(4,"toyota","rsm4",R.drawable.rsm4));
        lst=(ListView)findViewById(R.id.lstAraba);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_araba_aktivite, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
