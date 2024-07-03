package com.example.hii;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNum1;
    private EditText editTextNum2;
    private Button buttonSum,buttonSup,buttonMul,buttonDiv;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        buttonSum = findViewById(R.id.buttonSum);
        buttonSup= findViewById(R.id.buttonSup);
        buttonMul=findViewById(R.id.buttonMul);
        buttonDiv=findViewById(R.id.buttonDiv);
        textViewResult = findViewById(R.id.textViewResult);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = editTextNum1.getText().toString();
                String num2Str = editTextNum2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                } else {
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);
                    int sum = num1 + num2;

                    textViewResult.setText("Result: " + sum);
                }
            }
        });

        buttonSup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = editTextNum1.getText().toString();
                String num2Str = editTextNum2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                } else {
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);
                    int sup = num1 - num2;

                    textViewResult.setText("Result: " + sup);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = editTextNum1.getText().toString();
                String num2Str = editTextNum2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                } else {
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);
                    int mul = num1 * num2;

                    textViewResult.setText("Result: " + mul);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = editTextNum1.getText().toString();
                String num2Str = editTextNum2.getText().toString();

                if (num1Str.isEmpty() || num2Str.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                } else {
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);
                    int div = num1 / num2;

                    textViewResult.setText("Result: " + div);
                }
            }
        });
    }
}
