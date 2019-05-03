package com.hein.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);
    }

    public void addNumber(View view) {
        double firstNumber, secondNumber;

        double[] data = getData();
        firstNumber = data[0];
        secondNumber = data[1];

        double result = firstNumber + secondNumber;

        setData(result);
    }

    public double[] getData(){
        EditText first = findViewById(R.id.first);
        EditText second = findViewById(R.id.second);
        double[] numberData = new double[2];
        numberData [0] = Double.parseDouble(first.getText().toString());
        numberData[1] = Double.parseDouble(second.getText().toString());
        return numberData;

    }

    public void setData(double result){
        String resultString = Double.toString(result);
        TextView resultView = findViewById(R.id.result);

        resultView.setText(resultString);
    }

    public void subNumber(View view) {
        double firstNumber, secondNumber;
        double[] data = getData();
        firstNumber = data[0];
        secondNumber = data[1];

        double result = firstNumber - secondNumber;

        setData(result);
    }

    public void divNumber(View view) {
        double firstNumber, secondNumber;
        double[] data = getData();
        firstNumber = data[0];
        secondNumber = data[1];

        double result = firstNumber / secondNumber;

        setData(result);
    }

    public void multiplyNumber(View view) {
        double firstNumber, secondNumber;
        double[] data = getData();
        firstNumber = data[0];
        secondNumber = data[1];

        double result = firstNumber * secondNumber;

        setData(result);
    }
}
