package com.khahani.app.showlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NumbersAdapter extends ArrayAdapter<String> {

    private List<String> mStudents;

    public NumbersAdapter(@NonNull Context context, @NonNull List<String> numbers, List<String> students) {
        super(context, 0, numbers);
        mStudents = students;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null){
            convertView =
                    LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // get data
        String number = getItem(position);
        String student = mStudents.get(position);

        // retrieve layout textview and set number value
        TextView numberTextView = (TextView)convertView.findViewById(R.id.number);
        numberTextView.setText(number);

        TextView studentTextView = (TextView) convertView.findViewById(R.id.student);
        studentTextView.setText(student);

        return convertView;
    }
}
