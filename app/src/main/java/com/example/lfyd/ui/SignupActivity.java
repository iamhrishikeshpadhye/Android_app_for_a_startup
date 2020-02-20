package com.example.lfyd.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.lfyd.R;

public class SignupActivity extends AppCompatActivity {

    String activeTab;
    LinearLayout userLayout;
    LinearLayout merchantLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        activeTab = "user";

        userLayout = findViewById(R.id.user_container);
        merchantLayout = findViewById(R.id.merchant_container);

        merchantLayout.setVisibility(View.GONE);
        userLayout.setVisibility(View.VISIBLE);

    }

    public void onUserTabClicked(View view){
        if(activeTab.equalsIgnoreCase("merchant")){
            activeTab = "user";
            userLayout.setVisibility(View.VISIBLE);
            merchantLayout.setVisibility(View.GONE);
        }
    }

    public void onMerchantTabClicked(View view){
        if(activeTab.equalsIgnoreCase("user")){
            activeTab = "merchant";
            merchantLayout.setVisibility(View.VISIBLE);
            userLayout.setVisibility(View.GONE);
        }
    }

    public void onRegistered(View view){
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

}
