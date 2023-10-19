package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void añadir(View view) {



    }

/*
    public void info(View view) {
        Intent activityProducto = new Intent(this, Product.class);
        activityProducto.putExtra("producto", (Parcelable) producto);

        startActivity(activityProducto);

    }
*/
}