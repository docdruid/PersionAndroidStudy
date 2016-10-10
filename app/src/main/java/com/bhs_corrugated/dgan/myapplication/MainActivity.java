package com.bhs_corrugated.dgan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.content.Intent.EXTRA_USER;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_USER="com.bhs_corrugated.dgan.myapplication";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginButtionClick(View ObjectView){
        Intent showScanView=new Intent(this,scan_view.class);

        EditText userText =(EditText)findViewById(R.id.userEditText);
        EditText userPasswordText=(EditText)findViewById(R.id.pwdEditText);

        String user=userText.getText().toString();
        String pwd=userPasswordText.getText().toString();

        showScanView.putExtra(EXTRA_USER,user);
        startActivity(showScanView);
    }
}
