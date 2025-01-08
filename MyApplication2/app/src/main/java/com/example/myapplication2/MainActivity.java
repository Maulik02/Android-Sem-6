package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName1, editTextName2;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName1 = findViewById(R.id.editTextTextPersonName3);
        editTextName2 = findViewById(R.id.editTextTextPersonName4);
        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = editTextName1.getText().toString();
                String name2 = editTextName2.getText().toString();

                String fullName = name1 + " " + name2;

                textView.setText(fullName);
            }
        });
    }
}
