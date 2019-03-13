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

        if (savedInstanceState != null)
            _someField = savedInstanceState.getString("sleutelX");
        else
            _someField = "initial value";

        Log.i(TAG, "++++++++++ onCreate(" + (savedInstanceState != null ? "savedInstanceState" : "null") + "/_someField=" + _someField + ")");
    }

    private static final String TAG = "ALCMA FirstActivity";
    @Override protected void onStart() {
        Log.i(TAG, "onStart()");
        super.onStart();
    }
    @Override protected void onResume() {
        Log.i(TAG, "onResume()");
        _someField = "changed value";
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
    private String _someField;
    @Override protected void onSaveInstanceState(Bundle outState) {
        Log.i(TAG, "onSaveInstanceState(outState)");
        outState.putString("sleutelX", _someField);
        super.onSaveInstanceState(outState);
    }
    @Override protected void onRestoreInstanceState(Bundle savedState) {
        Log.i(TAG, "onRestoreInstanceState(savedInstanceState)");
        _someField = savedState.getString("sleutelX");
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
