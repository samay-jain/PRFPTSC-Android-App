package com.example.prfptsc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_palindrome;
    Button button_reverse;
    Button button_factorial;
    Button button_prime;
    Button button_table;
    Button button_si;
    Button button_ci;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_palindrome = findViewById(R.id.button_palindrome);
        button_reverse = findViewById(R.id.button_reverse);
        button_factorial = findViewById(R.id.button_factorial);
        button_prime = findViewById(R.id.button_prime);
        button_table = findViewById(R.id.button_table);
        button_si = findViewById(R.id.button_si);
        button_ci = findViewById(R.id.button_ci);

        button_palindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPalindrome();
            }
        });

        button_reverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReverse();
            }
        });

        button_factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFactorial();
            }
        });

        button_prime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPrime();
            }
        });
        button_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTable();
            }
        });
        button_si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensi();
            }
        });
        button_ci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openci();
            }
        });
    }

    public void openPalindrome()
    {
        Intent intent = new Intent(this,palindrome.class);
        startActivity(intent);
    }

    public void openReverse()
    {
        Intent intent = new Intent(this,reverse.class);
        startActivity(intent);
    }

    public void openFactorial()
    {
        Intent intent = new Intent(this,factorial.class);
        startActivity(intent);
    }

    public void openPrime()
    {
        Intent intent = new Intent(this,prime.class);
        startActivity(intent);
    }

    public void openTable()
    {
        Intent intent = new Intent(this,Table.class);
        startActivity(intent);
    }

    public void opensi()
    {
        Intent intent = new Intent(this,si.class);
        startActivity(intent);
    }

    public void openci()
    {
        Intent intent = new Intent(this,ci.class);
        startActivity(intent);
    }
}