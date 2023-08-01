package com.example.oo_vko8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstInputTxt;
    private EditText secondInputTxt;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstInputTxt = findViewById(R.id.textFirstInp);
        secondInputTxt = findViewById(R.id.textSecondInp);
        output = findViewById(R.id.textResult);
    }

    public void onBtnClick(View view) {
        int id = view.getId();
        int result = 0;
        /*
        firstInputTxt = findViewById(R.id.textFirstInp);
        secondInputTxt = findViewById(R.id.textSecondInp);
        output = findViewById(R.id.textResult);
        */
        //read inputs
        int firstInput = Integer.parseInt(String.valueOf(firstInputTxt.getText()));
        int secondInput = Integer.parseInt(String.valueOf(secondInputTxt.getText()));

        System.out.println("CLICKED: " +firstInput +", "+secondInput);

        //check operator
        if (id == R.id.btnPlus) {
            result = firstInput + secondInput;
        } else if (id == R.id.btnMinus) {
            result = firstInput - secondInput;
        } else if (id == R.id.btnDiv) {
            result = firstInput / secondInput;
        } else if (id == R.id.btnMultiply) {
            result = firstInput * secondInput;
        }

        //write result
        //Note: apparently a specific integer to string conversion is required in order for this to work!
        output.setText(Integer.toString(result));
    }

}