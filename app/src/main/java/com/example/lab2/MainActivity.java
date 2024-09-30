package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Spinner spinner;
    private Button button;
    private TextView resultTextView;
    private Counter counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);
        resultTextView = findViewById(R.id.resultTextView);
        counter = new Counter();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString().trim();


                if (inputText.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter some text!", Toast.LENGTH_SHORT).show();
                    return;
                }

                String selection = spinner.getSelectedItem().toString();
                if (selection.equals("Words")) {
                    int wordCount = counter.countWords(inputText);
                    resultTextView.setText("Words Counted: " + wordCount);
                } else if (selection.equals("Characters")) {
                    int charCount = counter.countCharacters(inputText);
                    resultTextView.setText("Characters Counted: " + charCount);
                }
            }
        });
    }
}