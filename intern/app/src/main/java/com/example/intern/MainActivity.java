package com.example.intern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        EditText etx = findViewById(R.id.editTextTextPersonName);  // Reference to EditText

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = etx.getText().toString();
                Intent i = new Intent(MainActivity.this, MainActivity2.class);

                i.putExtra("key1", text);
                i.putExtra("key2", "Maulik's");
                startActivity(i);
            }
        });
    }
}
