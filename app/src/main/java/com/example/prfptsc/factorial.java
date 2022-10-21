package com.example.prfptsc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class factorial extends AppCompatActivity {

    MaterialButton button_fact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);
        button_fact = findViewById(R.id.button_fact);
    }

    public void findFactorial(View view)
    {
        TextView textView = findViewById(R.id.getnum);
        TextView textView1 = findViewById(R.id.show_fact);
        String str = textView.getText().toString();

        if(TextUtils.isEmpty(str))
            textView1.setText("Please Enter a Number!");
        else {
            int num = Integer.parseInt(str);
            int temp = 1;
            if (num == 0) {
                textView1.setText("" + 1);
                return;
            } else {
                for (int i = 1; i <= num; i++) {
                    temp *= i;
                }
                textView1.setText("" + temp);
            }
        }
    }
}