package com.example.prfptsc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class palindrome extends AppCompatActivity {

    MaterialButton button_palin;
    MaterialButton button_rev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        button_palin = findViewById(R.id.button_check);
    }

    public void checkPalindrome(View view)
    {
        TextView textView = findViewById(R.id.editTextTextPersonName);
        String str = textView.getText().toString();
        TextView textView1 = findViewById(R.id.show_palin);
        if(TextUtils.isEmpty(str))
            textView1.setText("Please Enter any String!");
        else {
            int len = str.length() - 1;
            boolean b = false;
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) == str.charAt(len))
                    b = true;
                else {
                    b = false;
                    break;
                }
                len--;
            }
            if (b == true)
                textView1.setText("Yes it is a Palindrome!");
            else
                textView1.setText("No it is not a Palindrome");
        }
    }

}