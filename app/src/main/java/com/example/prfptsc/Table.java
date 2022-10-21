package com.example.prfptsc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Table extends AppCompatActivity {

    MaterialButton button_table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        button_table=findViewById(R.id.button_table);
    }

    public void generateTable(View view)
    {
        TextView textView = findViewById(R.id.gettablenum);
        TextView textView1 = findViewById(R.id.show_table);

        String text = textView.getText().toString();

        if(TextUtils.isEmpty(text))
            textView1.setText("Above value cannot be kept Empty!");
        else {
            int num = Integer.parseInt(text);
            String str = "";
            for (int i = 1; i <= 10; i++) {
                str += num + " x " + i + " = " + num * i + "\n";
            }
            textView1.setText(str);
        }
    }
}