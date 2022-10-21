package com.example.prfptsc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class reverse extends AppCompatActivity {

    MaterialButton button_rev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);
        button_rev = findViewById(R.id.button_reverse);
    }

    public void convertReverse(View view)
    {
        TextView textView = findViewById(R.id.reversestring);
        String str=textView.getText().toString();
        TextView textView1 = findViewById(R.id.show_reverse);
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev += str.charAt(i);
        }
        textView1.setText(rev);
    }
}