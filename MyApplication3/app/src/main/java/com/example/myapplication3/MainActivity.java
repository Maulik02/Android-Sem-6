package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextValue1, editTextValue2;
    private Button buttonAdd, buttonDiv, buttonSub, buttonMulti;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextValue1 = findViewById(R.id.editTextTextPersonName);
        editTextValue2 = findViewById(R.id.editTextTextPersonName2);
        buttonAdd = findViewById(R.id.button);
        buttonDiv = findViewById(R.id.button2);
        buttonSub = findViewById(R.id.button3);
        buttonMulti = findViewById(R.id.button4);
        textViewResult = findViewById(R.id.textView);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                div();
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub();
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multi();
            }
        });
    }

    private void add() {
        double value1 = getInputValue(editTextValue1);
        double value2 = getInputValue(editTextValue2);

            double result = value1 + value2;
            textViewResult.setText(String.valueOf(result));
    }

    private void sub() {
        double value1 = getInputValue(editTextValue1);
        double value2 = getInputValue(editTextValue2);

            double result = value1 - value2;
            textViewResult.setText(String.valueOf(result));
    }

    private void multi() {
        double value1 = getInputValue(editTextValue1);
        double value2 = getInputValue(editTextValue2);

            double result = value1 * value2;
            textViewResult.setText(String.valueOf(result));
    }

    private void div() {
        double value1 = getInputValue(editTextValue1);
        double value2 = getInputValue(editTextValue2);

                double result = value1 / value2;
                textViewResult.setText(String.valueOf(result));

    }

    private double getInputValue(EditText editText) {
        String valueStr = editText.getText().toString();
        try {
            return Double.parseDouble(valueStr);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            return Double.NaN;
        }
    }
}
