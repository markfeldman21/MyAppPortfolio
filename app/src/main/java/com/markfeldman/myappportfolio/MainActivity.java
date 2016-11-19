package com.markfeldman.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button popMoviesBtn, stockHawkBtn,buildItBiggerBtn, materialBtn,ubiquitousBtn,capstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popMoviesBtn = (Button)findViewById(R.id.moviesAppBtn);
        stockHawkBtn = (Button)findViewById(R.id.stockHawkAppBtn);
        buildItBiggerBtn = (Button)findViewById(R.id.buildItBiggerAppBtn);
        materialBtn = (Button)findViewById(R.id.materialAppBtn);
        ubiquitousBtn = (Button)findViewById(R.id.goUbiquitousAppBtn);
        capstoneBtn = (Button)findViewById(R.id.capstoneBtn);

        popMoviesBtn.setOnClickListener(this);
        stockHawkBtn.setOnClickListener(this);
        buildItBiggerBtn.setOnClickListener(this);
        materialBtn.setOnClickListener(this);
        ubiquitousBtn.setOnClickListener(this);
        capstoneBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.moviesAppBtn:{
                Toast.makeText(getApplicationContext(),"This button will launch my 'Popular Movies' project",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.stockHawkAppBtn:{
                Toast.makeText(getApplicationContext(),"This button will launch my 'Stock Hawk' project",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.buildItBiggerAppBtn:{
                Toast.makeText(getApplicationContext(),"This button will launch my 'Build It Bigger' project",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.materialAppBtn:{
                Toast.makeText(getApplicationContext(),"This button will launch my 'Make Your App Material' project",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.goUbiquitousAppBtn:{
                Toast.makeText(getApplicationContext(),"This button will launch my 'Go  Ubiquitous' project",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.capstoneBtn:{
                Toast.makeText(getApplicationContext(),"This button will launch my 'Capstone My Own App' project",Toast.LENGTH_LONG).show();
                break;
            }
        }
    }
}
