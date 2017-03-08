package com.tiktokthailand.commuteproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setText();

        Log.i("App", "Set Text Compl");
    }
    private void setText() {
        mText = (TextView) findViewById(R.id.textview1);
        mText.setText("Tick App");



    }
}
