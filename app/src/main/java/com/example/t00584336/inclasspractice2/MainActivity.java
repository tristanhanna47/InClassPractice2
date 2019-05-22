package com.example.t00584336.inclasspractice2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoSecondActivity (View view)
    {
        Intent intent = new Intent(this, SecondActivity.class ); //goes from current activity to SecondActivity
        startActivity(intent);  //allows the two activities to be switched between

    }
}
