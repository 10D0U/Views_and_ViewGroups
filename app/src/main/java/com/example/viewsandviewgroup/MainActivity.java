package com.example.viewsandviewgroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView myText, textView;
    Button myButton, changeButton;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_onclick_layout2);

        /**
         * Logic Code for text_view_layout and button_onclick_layout
         */
//        myButton = findViewById(R.id.my_button);
//        constraintLayout = findViewById(R.id.constraint_layout);
//        myText = findViewById(R.id.my_text);
//
//        myButton.setText("Change Color");

//        myQuote = findViewById(R.id.my_quote);
//        favQuote.setText("Don't confuse your path with your destination");
//        favQuote.setText(R.string.love_quote);

//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                constraintLayout.setBackgroundColor(R.color.medium_turquoise);
//            }
//        });

//        myButton.setOnClickListener(view -> {
//            constraintLayout.setBackgroundColor(R.color.medium_turquoise);
//            myText.setText("Hello Welcome");
//            myText.setTextSize(50);
//        });

        /**
         * Logic Code for button_onclick_layout2
         */


        textView = findViewById(R.id.textView);
        changeButton = findViewById(R.id.changeButton);

        textView.setOnClickListener(view -> {
            textView.setText("Protect your peace");
        });
    }

    public void btnClick(View view) {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
        textView.setText("Know your wealth");
        textView.setTextSize(48);
    }


}