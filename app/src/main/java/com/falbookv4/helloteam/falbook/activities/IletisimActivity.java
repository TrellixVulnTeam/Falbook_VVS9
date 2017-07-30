package com.falbookv4.helloteam.falbook.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

import com.falbookv4.helloteam.falbook.R;

import java.io.File;

public class IletisimActivity extends AppCompatActivity {

    private Toolbar toolbarIletisim;
    private EditText txtKullaniciSorun;

    public void init(){

        toolbarIletisim = (Toolbar) findViewById(R.id.toolbarIletisim);
        txtKullaniciSorun = (EditText) findViewById(R.id.txtIletisimSorun);

    }

    public void handler(){

        setSupportActionBar(toolbarIletisim);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(null);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iletisim);
        init();
        handler();
    }
}
