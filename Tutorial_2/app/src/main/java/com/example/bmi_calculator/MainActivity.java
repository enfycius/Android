package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButtonListenerMethod();
    }

    public void myButtonListenerMethod() {
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText heightText = (EditText) findViewById(R.id.heightInput);
                final EditText weightText = (EditText) findViewById(R.id.weightInput);
                final TextView BMIResult = (TextView) findViewById(R.id.BMIResult);
                final TextView BMICategory = (TextView) findViewById(R.id.BMICategory);

                String heightStr = heightText.getText().toString();
                String weightStr = weightText.getText().toString();
                String BMI_Cat;

                double height = Double.parseDouble(heightStr);
                double weight = Double.parseDouble(weightStr);
                double BMI = (weight) / (height * height);

                BMIResult.setText(Double.toString(BMI));

                if (BMI < 15)
                    BMI_Cat = "Very severely underweight";
                else if (BMI < 16)
                    BMI_Cat = "Severely underweight";
                else if (BMI < 18.5)
                    BMI_Cat = "Underweight";
                else if (BMI < 25)
                    BMI_Cat = "Normal";
                else if (BMI < 30)
                    BMI_Cat = "Overweight";
                else if (BMI < 35)
                    BMI_Cat = "Obese Class 1 - Moderately Obese";
                else if (BMI < 40)
                    BMI_Cat = "Obese Class 2 - Severely Obese";
                else
                    BMI_Cat = "Obese Class 3 - Very Severely Obese";

                BMICategory.setText(BMI_Cat);
            }
        });
    }
}