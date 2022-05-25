package com.example.mobile_programing_listview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView; import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements OnClickListener,
        OnItemClickListener, OnItemLongClickListener{
    private java.util.ArrayList<String>items = new
        java.util.ArrayList<String>();
private ListView mataKuliahListView;
private String[] listMataKuliah = {"mangga", "apel", "jeruk", "rambutan"};
@Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i=0; i<listMataKuliah.length; i++){
        items.add(listMataKuliah[i]);

        }
        mataKuliahListView = (ListView)
        findViewById(R.id.mataKuliahListView);
        mataKuliahListView.setOnItemClickListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        android.R.layout.simple_list_item_1,items);
        mataKuliahListView.setAdapter(adapter);
        findViewById(R.id.xButton).setOnClickListener(this);
        }
@SuppressLint("ResourceType")
@Override
        public boolean onCreateOptionsMenu(Menu menu) {
                getMenuInflater().inflate(R.layout.activity_main, menu);
                return true;
        } public void onItemClick(AdapterView<?> arg0, View arg1,
        int arg2,
        long arg3) {
        // TODO Auto-generated method stub
        Intent intent = new Intent(this, dipilih.class);
        intent.putExtra("mataKuliah", items.get(arg2));
        startActivity(intent);
        }
        public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()){
        case R.id.xButton:
        System.exit(0);
        }
        }
        public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
        int
        arg2,
        long arg3) {
        // TODO Auto-generated method stub
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Informasi");
        alert.setMessage("Mata kuliah "+items.get(arg2));
        alert.setIcon(R.drawable.ic_launcher_background);
        alert.setPositiveButton("Ya", new
        DialogInterface.OnClickListener() {

        public void onClick(DialogInterface arg0, int arg1) {
        // TODO Auto-generated method stub
        Toast.makeText(getApplicationContext(), "Tombol Ya di klik", Toast.LENGTH_SHORT).show();
        }
        });
        alert.setNegativeButton("Tidak", new
        DialogInterface.OnClickListener() {
        public void onClick(DialogInterface arg0, int arg1) {
        // TODO Auto-generated method stub
        Toast.makeText(getApplicationContext(), "Tombol Tidak di klik", Toast.LENGTH_SHORT).show();
        }
        });
        return false;
        }
        }
