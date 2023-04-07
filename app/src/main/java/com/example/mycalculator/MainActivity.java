package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Declare Attributes
    EditText operand1EditText;
    EditText operand2EditText;
    TextView resultTextView;
    ListView show;
    ArrayList addArray = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Define Attributes
        operand1EditText = findViewById(R.id.operand1EditText);
        operand2EditText = findViewById(R.id.operand2EditText);
        resultTextView = findViewById(R.id.resultTextView);
        show = findViewById(R.id.history);
    }

    //Addition Logic
    public void addClick(View view) {
        String editText1 = operand1EditText.getText().toString();
        String editText2 = operand1EditText.getText().toString();

        if (editText1.matches("") && editText2.matches(""))
        {
            Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
        else {
            double operand1 = Double.parseDouble(operand1EditText.getText().toString());
            double operand2 = Double.parseDouble(operand2EditText.getText().toString());
            double result = operand1 + operand2;

            addArray.add(operand1 + " + " + operand2 + " = " + result);
            ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, addArray);
            show.setAdapter(adapter);

            resultTextView.setText(Double.toString(result));
        }

    }

    //Subtraction Logic
    public void subtractClick(View view) {
        String editText1 = operand1EditText.getText().toString();
        String editText2 = operand1EditText.getText().toString();

        if (editText1.matches("") && editText2.matches(""))
        {
            Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
        else {
            double operand1 = Double.parseDouble(operand1EditText.getText().toString());
            double operand2 = Double.parseDouble(operand2EditText.getText().toString());
            double result = operand1 - operand2;

            addArray.add(operand1 + " − " + operand2 + " = " + result);
            ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, addArray);
            show.setAdapter(adapter);

            resultTextView.setText(Double.toString(result));
        }
    }

    //Division Logic
    public void divideClick(View view) {
        String editText1 = operand1EditText.getText().toString();
        String editText2 = operand1EditText.getText().toString();

        if (editText1.matches("") && editText2.matches(""))
        {
            Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
        else {
            double operand1 = Double.parseDouble(operand1EditText.getText().toString());
            double operand2 = Double.parseDouble(operand2EditText.getText().toString());
            double result = operand1 / operand2;

            addArray.add(operand1 + " ÷ " + operand2 + " = " + result);
            ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, addArray);
            show.setAdapter(adapter);

            resultTextView.setText(Double.toString(result));
        }
    }

    //Multiplication Logic
    public void multiplyClick(View view) {
        String editText1 = operand1EditText.getText().toString();
        String editText2 = operand1EditText.getText().toString();

        if (editText1.matches("") && editText2.matches(""))
        {
            Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
        else {
            double operand1 = Double.parseDouble(operand1EditText.getText().toString());
            double operand2 = Double.parseDouble(operand2EditText.getText().toString());
            double result = operand1 * operand2;

            addArray.add(operand1 + " × " + operand2 + " = " + result);
            ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, addArray);
            show.setAdapter(adapter);

            resultTextView.setText(Double.toString(result));
        }
    }
}
