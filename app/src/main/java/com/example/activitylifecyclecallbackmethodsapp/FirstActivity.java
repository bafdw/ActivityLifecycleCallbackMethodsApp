package com.example.activitylifecyclecallbackmethodsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.i(TAG, "++++++++++ onCreate(" + (savedInstanceState != null ? "savedInstanceState" : "null") + ")");
    }

    private static final String TAG = "ACLMA FirstActivity";
    @Override protected void onStart() {
        Log.i(TAG, "onStart()");
        super.onStart();
    }
    @Override protected void onResume() {
        Log.i(TAG, "onResume()");
        super.onResume();
    }
    @Override protected void onPause() {
        Log.i(TAG, "onPause()");
        super.onPause();
    }
    @Override protected void onStop() {
        Log.i(TAG, "onStop()");
        super.onStop();
    }
    @Override protected void onRestart() {
        Log.i(TAG, "onRestart()");
        super.onRestart();
    }
    @Override protected void onDestroy() {
        Log.i(TAG, "---------- onDestroy()");
        super.onDestroy();
    }
    @Override protected void onSaveInstanceState(Bundle outState) {
        Log.i(TAG, "onSaveInstanceState(outState)");
        super.onSaveInstanceState(outState);
    }
    @Override protected void onRestoreInstanceState(Bundle savedState) {
        Log.i(TAG, "onRestoreInstanceState(savedInstanceState)");
        super.onRestoreInstanceState(savedState);
    }

    public void gotoSecondActivity(View v){
        Log.d(TAG, "gotoSecondActivity() ..........");
        startActivity(new Intent(this, SecondActivity.class));
    }
    public void finishThisActivity(View v){
        Log.d(TAG, "finish() ..........");
        finish();
    }
}
