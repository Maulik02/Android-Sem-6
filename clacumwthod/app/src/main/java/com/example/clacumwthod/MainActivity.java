package com.example.clacumwthod;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextPersonName1, editTextPersonName2;
    Button addButton, subButton, divButton, maltiButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        editTextPersonName1 = findViewById(R.id.editTextTextPersonName);
        editTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        addButton = findViewById(R.id.button);
        subButton = findViewById(R.id.button2);
        divButton = findViewById(R.id.button3);
        maltiButton = findViewById(R.id.button4);
        resultTextView = findViewById(R.id.textView2);

        // Set button listeners
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performAddition();
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performSubtraction();
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performDivision();
            }
        });

        maltiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performMultiplication();
            }
        });
    }

    private void performAddition() {
        String input1 = editTextPersonName1.getText().toString();
        String input2 = editTextPersonName2.getText().toString();

        if (input1.isEmpty() || input2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);
            double result = num1 + num2;
            resultTextView.setText("Result: " + result);
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Invalid input. Please enter valid numbers.", Toast.LENGTH_SHORT).show();
        }
    }

    private void performSubtraction() {
        String input1 = editTextPersonName1.getText().toString();
        String input2 = editTextPersonName2.getText().toString();

        if (input1.isEmpty() || input2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);
            double result = num1 - num2;
            resultTextView.setText("Result: " + result);
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Invalid input. Please enter valid numbers.", Toast.LENGTH_SHORT).show();
        }
    }

    private void performDivision() {
        String input1 = editTextPersonName1.getText().toString();
        String input2 = editTextPersonName2.getText().toString();

        if (input1.isEmpty() || input2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            if (num2 == 0) {
                Toast.makeText(MainActivity.this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                return;
            }

            double result = num1 / num2;
            resultTextView.setText("Result: " + result);
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Invalid input. Please enter valid numbers.", Toast.LENGTH_SHORT).show();
        }
    }

    private void performMultiplication() {
        String input1 = editTextPersonName1.getText().toString();
        String input2 = editTextPersonName2.getText().toString();

        if (input1.isEmpty() || input2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);
            double result = num1 * num2;
            resultTextView.setText("Result: " + result);
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Invalid input. Please enter valid numbers.", Toast.LENGTH_SHORT).show();
        }
    }
}
