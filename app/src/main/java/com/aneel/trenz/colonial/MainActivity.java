package com.aneel.trenz.colonial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickButton(View v){
        Toast.makeText(this, "Clicked the Gotdamn button", Toast.LENGTH_SHORT).show();
    }
}
