package com.khahani.app.showlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ArrayList<String> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(String.valueOf(i));
        }

        /*ArrayList<String> students = new ArrayList<>();
        students.add("Khahani");
        students.add("Javan");
        students.add("Hasani");
        students.add("...");*/

        NumbersAdapter adapter = new NumbersAdapter(this, numbers);

        ListView myList  = (ListView)findViewById(R.id.myList);

        myList.setAdapter(adapter);

    }
}
