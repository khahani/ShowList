package com.khahani.app.showlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        LinearLayout parent = (LinearLayout)findViewById(R.id.parent);

        for (int i = 1; i <= 100; i++) {
            TextView number = new TextView(this);
            number.setText(String.valueOf(i));

            parent.addView(number);
        }
    }
}
