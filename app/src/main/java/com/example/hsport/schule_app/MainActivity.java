package com.example.hsport.schule_app;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hsport.schule_app.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {


    // Own code
    ListView listView;
    String mTitle[] = {"Addieren", "Subtrahieren", "Multiplizieren", "Dividieren"};
    String mDescription[] = {"Addieren Beschreibung", "Subtrahieren Beschreibung", "Multiplizieren Beschreibung",
            "Dividieren Beschreibung"};
    int images[] = {R.drawable.plus, R.drawable.minus, R.drawable.geteilt, R.drawable.mal}; // add bruchrechnen
    // TODO: 11.06.2019 These values have to be saved in an xml-file, not directly in the document

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Own code


        // Android Studio code
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }



}