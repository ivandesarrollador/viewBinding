package com.example.exampleviewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.exampleviewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mActivityBinding.getRoot());
        setuplistners();
    }

    private void  setuplistners(){
        mActivityBinding.btnMostrar.setOnClickListener((v -> {
            mActivityBinding.txtMensaje.setText("Hola con view binding !!");
        }));
    }
}
