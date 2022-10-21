package com.example.prfptsc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class ci extends AppCompatActivity {

    MaterialButton button_i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ci);
        button_i = findViewById(R.id.button_ci);
    }
    public void calCI(View view)
    {
        TextView textView = findViewById(R.id.getprincipalc);
        TextView textView1 = findViewById(R.id.getinterestc);
        TextView textView2 = findViewById(R.id.getperiodc);
        TextView textView3 = findViewById(R.id.show_ci);

        String principal = textView.getText().toString();
        String rateofi = textView1.getText().toString();
        String time = textView2.getText().toString();

        if(TextUtils.isEmpty(principal) || TextUtils.isEmpty(rateofi) || TextUtils.isEmpty(time))
        {
            textView3.setText("Above values can not be kept Empty!");
        }
        else
        {
            float pri = Float.parseFloat(principal);
            float rate = Float.parseFloat(rateofi);
            float years = Float.parseFloat(time);

            float ci = (float) (pri * Math.pow((1 + (rate / 100)), years));
            float fin = ci - pri;
            textView3.setText("" + fin);
        }
    }
}