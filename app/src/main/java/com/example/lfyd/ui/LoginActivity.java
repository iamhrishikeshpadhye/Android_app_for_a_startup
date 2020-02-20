package com.example.lfyd.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.lfyd.MainActivity;
import com.example.lfyd.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void onRegisterClicked(View view){
        //Toast.makeText(this, "Hello Guys", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,SignupActivity.class);
        startActivity(i);
    }

    public void onLoginClicked(View view){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}
