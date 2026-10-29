package com.example.wordcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Spinner spinner = (Spinner) findViewById(R.id.spChoose);
// Create an ArrayAdapter using the string array and a default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.options_array,
                android.R.layout.simple_spinner_item
        );
// Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner.
        spinner.setAdapter(adapter);
    }

    public void onClickCount(View view) {
        int result = 0;
        Spinner spinner = (Spinner) findViewById(R.id.spChoose);
        TextView twOutput = (TextView) findViewById(R.id.twOutput);
        EditText edUserInput = (EditText) findViewById(R.id.edUserInput);
        String userInputText = edUserInput.getText().toString();
        if (userInputText.isEmpty()) {
            Toast.makeText(this,"Iveskite Teksta",Toast.LENGTH_LONG).show();
        }
        else {
            if (spinner.getSelectedItemPosition() == 0) {
                result = Counter.getWordCount(userInputText);
            } else if (spinner.getSelectedItemPosition() == 1) {
                result = Counter.getCharCount(userInputText);
            } else if (spinner.getSelectedItemPosition() == 2) {
                result = Counter.getSentencesCount(userInputText);
            }
            twOutput.setText(String.valueOf(result));
        }
    }
}