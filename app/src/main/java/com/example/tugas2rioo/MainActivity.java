package com.example.tugas2rioo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loginbtn(View view) {
        Intent loginbtn = new Intent(MainActivity.this, loginreg.class);
        startActivity(loginbtn);
    }


}