package com.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    // IDs of all the numeric buttons
    private int[] numericButtons = {R.id.btnZero, R.id.btnOne, R.id.btnTwo, R.id.btnThree, R.id.btnFour, R.id.btnFive, R.id.btnSix, R.id.btnSeven, R.id.btnEight, R.id.btnNine};
    // IDs of all the operator buttons
    private int[] operatorButtons = {R.id.btnAdd, R.id.btnSubtract, R.id.btnMultiply, R.id.btnDivide};
    // TextView used to display the output
    private TextView txtOutput;
    // EdiText for first input number.
    private EditText etInputOne;
    // EdiText for second input number.
    private EditText etInputTwo;
    //It is true if user entered in 1st input view else false
    private boolean inputOne = true;
    //It is true if user entered in 2nd input view else false
    private boolean inputTwo = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find a variables for input and output view.
        etInputOne = findViewById(R.id.et_input_one);
        etInputTwo = findViewById(R.id.et_input_two);
        txtOutput = findViewById(R.id.tv_output);

        // Find and set OnClickListener to numeric buttons
        setNumericOnClickListener();
        // Find and set OnClickListener to operator buttons, equal button and decimal point button
        setOperatorOnClickListener();
    }

    /**
     * Find and set OnClickListener to numeric buttons.
     */
    private void setNumericOnClickListener() {
        // Create a common OnClickListener
        View.OnClickListener listener = v -> {
            // Just append/set the text of clicked button
            Button button = (Button) v;

            if (inputOne) {
                etInputOne.append(button.getText());
            } else if (inputTwo) {
                etInputTwo.append(button.getText());
            }

        };
        // Assign the listener to all the numeric buttons
        for (int id : numericButtons) {
            findViewById(id).setOnClickListener(listener);
        }
    }

    /**
     * Find and set OnClickListener to operator buttons, equal button and decimal point button.
     */
    private void setOperatorOnClickListener() {
        // Create a common OnClickListener for operators
        View.OnClickListener listener = v -> {
            if (TextUtils.isEmpty(etInputOne.getText().toString())
                    && TextUtils.isEmpty(etInputTwo.getText().toString())) {
                Toast.makeText(this, "Enter 1st and 2nd input number", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(etInputOne.getText().toString())) {
                Toast.makeText(this, "Enter 1st input number", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(etInputTwo.getText().toString())) {
                Toast.makeText(this, "Enter 2nd input number", Toast.LENGTH_SHORT).show();
            } else {
                txtOutput.setText("");
                int result = 0;
                switch (v.getId()) {
                    case R.id.btnAdd:
                        result = onAdd(Integer.valueOf(etInputOne.getText().toString()), Integer.valueOf(etInputTwo.getText().toString()));
                        break;
                    case R.id.btnSubtract:
                        result = onSubtract(Integer.valueOf(etInputOne.getText().toString()), Integer.valueOf(etInputTwo.getText().toString()));
                        break;
                    case R.id.btnMultiply:
                        result = onMultiply(Integer.valueOf(etInputOne.getText().toString()), Integer.valueOf(etInputTwo.getText().toString()));
                        break;
                    case R.id.btnDivide:
                        result = onDivide(Integer.valueOf(etInputOne.getText().toString()), Integer.valueOf(etInputTwo.getText().toString()));
                        break;
                }
                txtOutput.setText(String.valueOf(result));
            }
        };
        // Assign the listener to all the operator buttons
        for (int id : operatorButtons) {
            findViewById(id).setOnClickListener(listener);
        }

        findViewById(R.id.et_input_one).setOnClickListener(v -> {
            inputOne = true;
            inputTwo = false;
        });

        findViewById(R.id.et_input_two).setOnClickListener(v -> {
            inputTwo = true;
            inputOne = false;
        });

        // Clear button
        findViewById(R.id.btnClear).setOnClickListener(v -> {
            inputOne = true;
            inputTwo = false;
            etInputOne.setText("");
            etInputTwo.setText("");
            txtOutput.setText("");
        });
    }

    /**
     * Logic to calculate the solution.
     */
    public int onAdd(int first, int second) {
        return first + second;

    }

    public int onSubtract(int first, int second) {
        return first - second;
    }

    public int onMultiply(int first, int second) {
        return first * second;
    }

    public int onDivide(int first, int second) {
        return first / second;
    }
}
