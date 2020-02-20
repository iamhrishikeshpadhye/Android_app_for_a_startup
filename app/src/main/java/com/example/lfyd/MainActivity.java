                                                                                                                                                                                                                                                                                                                                                                                                                  package com.example.lfyd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.lfyd.ui.ScannerActivity;

                                                                                                                                                                                                                                                                                                                                                                                                                  public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onScanClicked(View view){
        startActivity(new Intent(this, ScannerActivity.class));
    }

}
