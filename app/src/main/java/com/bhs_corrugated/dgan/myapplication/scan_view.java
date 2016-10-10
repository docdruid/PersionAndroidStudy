package com.bhs_corrugated.dgan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class scan_view extends AppCompatActivity {

    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_view);
        Intent intent = getIntent();

        userName=intent.getStringExtra(MainActivity.EXTRA_USER);

        EditText testUserName=(EditText)findViewById(R.id.editTextTestUser);
       ((EditText) findViewById(R.id.editTextTestUser)).setText(userName);
    }


    public void logoutButton(View ObjectView){

        Intent logout=new Intent(this,MainActivity.class);

        startActivity(logout);
    }
}
