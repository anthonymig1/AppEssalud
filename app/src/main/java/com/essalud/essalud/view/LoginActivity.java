package com.essalud.essalud.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.essalud.essalud.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void goLoginAccount(View view){
        Intent intent = new Intent(this, ReportResultsActivity.class);
        startActivity(intent);

    }
}
