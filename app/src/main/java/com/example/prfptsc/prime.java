package com.example.prfptsc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class prime extends AppCompatActivity {

    MaterialButton button_prime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime);
        button_prime = findViewById(R.id.button_prime);
    }

    public void checkPrime(View view)
    {
        TextView textView = findViewById(R.id.getprimenum);
        TextView textView1 = findViewById(R.id.show_prime);
        String str = textView.getText().toString();

        if(TextUtils.isEmpty(str))
            textView1.setText("Above value can not be kept Empty");
        else {
            int num = Integer.parseInt(str);
            boolean b = false;
            for (int i = 2; i < num; i++) {
                if (num % i != 0)
                    b = true;
                else {
                    b = false;
                    break;
                }
            }
            if (num == 1 || num == 2)
                textView1.setText("It is a Prime Number!");
            else if (b == true)
                textView1.setText("It is a Prime Number!");
            else
                textView1.setText("It is not a Prime Number");
        }
    }
}