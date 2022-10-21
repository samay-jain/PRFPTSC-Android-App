package com.example.prfptsc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class si extends AppCompatActivity {

    MaterialButton button_i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_si);
        button_i=findViewById(R.id.button_si);
    }

    public void calculateSI(View view)
    {
        TextView textView = findViewById(R.id.getprincipal);
        TextView textView1 = findViewById(R.id.getinterest);
        TextView textView2 = findViewById(R.id.getperiod);
        TextView textView3 = findViewById(R.id.show_si);


        String principal=textView.getText().toString();
        String rateofi=textView1.getText().toString();
        String year=textView2.getText().toString();

        if(TextUtils.isEmpty(principal) || TextUtils.isEmpty(rateofi) || TextUtils.isEmpty(year))
        {
            textView3.setText("Above values can not be kept Empty!");
        }
        else {
            float pri = Float.parseFloat(principal);
            float rate = Float.parseFloat(rateofi);
            float years = Float.parseFloat(year);
            float si = (pri * rate * years) / 100;
            textView3.setText("" + si);
        }
    }
}