package com.example.mobile_programing_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class dipilih extends Activity implements OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dipilih);
        TextView mataKuliahTV = (TextView)
                findViewById(R.id.mataKuliahTextView);

        mataKuliahTV.setText(getIntent().getExtras().getString("mataKuliah"));
        findViewById(R.id.kembaliButton).setOnClickListener(this);
    }

    @SuppressLint("ResourceType")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.activity_dipilih, menu);
            return true;
    }

    public void onClick(View v) {
        // TODO Auto-generated method stub

        switch (v.getId()) {
            case R.id.kembaliButton:
                finish();
        }
    }
}