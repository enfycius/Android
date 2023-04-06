package com.example.change_background;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // execute on click
                ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);
                // System.out.println("Hello World");
                int color = ((ColorDrawable) bgElement.getBackground()).getColor();

                if (color == Color.RED) {
                    bgElement.setBackgroundColor(Color.BLUE);
                } else {
                    bgElement.setBackgroundColor(Color.RED);
                }
            }
        });
    }
}