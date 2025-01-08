package com.example.intern;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String value1 = intent.getStringExtra("key1");
        String value2 = intent.getStringExtra("key2");

        TextView txt = findViewById(R.id.textView);
        txt.setText("Received Data: " + value1 + " " + value2);
    }
}
