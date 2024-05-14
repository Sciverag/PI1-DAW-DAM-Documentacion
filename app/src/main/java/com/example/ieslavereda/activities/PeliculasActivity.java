package com.example.ieslavereda.activities;

import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import com.example.ieslavereda.activities.model.RecycleView;
import com.example.ieslavereda.base.BaseActivity;
import com.example.ieslavereda.base.CallInterface;
import com.example.myweatherbase.R;

public class PeliculasActivity extends BaseActivity implements CallInterface, View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peliculas);


    }

    @Override
    public void doInBackground() {

    }

    @Override
    public void doInUI() {
        hideProgress();
        RecycleView recycleView = new RecycleView(this, root);
        recycleView.setOnClickListener(this);
        forecasts.setAdapter(recycleView);
        forecasts.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onClick(View view) {

    }
}
