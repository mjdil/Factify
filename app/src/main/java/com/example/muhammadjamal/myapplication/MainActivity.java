package com.example.muhammadjamal.myapplication;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // declaring view variables
    private FactBook mfactbook = new FactBook();
    private Colorwheel mcolorwheel = new Colorwheel();
    private TextView mfunfact_text;
    private Button mfunfact_button;
    private ConstraintLayout mrelativelayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mfunfact_text = (TextView) findViewById(R.id.fun_fact_text);
        mfunfact_button = (Button) findViewById(R.id.fun_fact_button);
        mrelativelayout = (ConstraintLayout) findViewById(R.id.relativelayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // the button was clicked so update fun fact text with new fact
                String fact = mfactbook.getfact();
                int color = mcolorwheel.getcolor();

                //update screen with new fact
                mfunfact_text.setText(fact);
                mrelativelayout.setBackgroundColor(color);
                mfunfact_button.setTextColor(color);

            }
        };


        mfunfact_button.setOnClickListener(listener);



    }
}
