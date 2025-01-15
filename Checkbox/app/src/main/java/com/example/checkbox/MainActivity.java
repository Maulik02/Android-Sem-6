package com.example.checkbox;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox csk = findViewById(R.id.checkBox);
        CheckBox rcb = findViewById(R.id.checkBox4);
        CheckBox kkr = findViewById(R.id.checkBox2);
        CheckBox lsg = findViewById(R.id.checkBox3);
        Button submitbutton = findViewById(R.id.button);
        TextView result = findViewById(R.id.textView);
        submitbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                StringBuilder selectedTeam = new StringBuilder("Selected Team :");
                if (csk.isChecked()){
                    selectedTeam.append("CSK");
                }
                if (rcb.isChecked()){
                    selectedTeam.append("RCB");
                }
                if (kkr.isChecked()){
                    selectedTeam.append("KKR");
                }
                if (lsg.isChecked()){
                    selectedTeam.append("LSG");
                } else {
                    result.setText(selectedTeam.toString());
                }
            }
        });
    }
}