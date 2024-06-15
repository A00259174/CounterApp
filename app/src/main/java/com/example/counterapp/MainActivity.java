package com.example.counterapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView counterTextView;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView = findViewById(R.id.counterTextView);
        Button incrementButton = findViewById(R.id.incrementButton);
        Button decrementButton = findViewById(R.id.decrementButton);

        // Set initial counter value
        counterTextView.setText(String.valueOf(counter));

        incrementButton.setOnClickListener(v -> {
            counter++;
            counterTextView.setText(String.valueOf(counter));
        });

        decrementButton.setOnClickListener(v -> {
            if (counter > 0) {
                counter--;
                counterTextView.setText(String.valueOf(counter));
            }
        });
    }
}
