package com.example.user.radio_button_practice;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
LinearLayout ll;
RadioButton rb1,rb2,rb3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        ll=findViewById(R.id.ll);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);

    }


    public void btn1(View view) {
       if (rb1.isChecked())
       {
           ll.setBackgroundColor(Color.RED);
       }
        if (rb2.isChecked())
        {
            ll.setBackgroundColor(Color.GREEN);
        }
        if (rb3.isChecked())
        {
            ll.setBackgroundColor(Color.BLUE);
        }
    }

    public void btn2(View view) {
        ll.setBackgroundColor(Color.WHITE);
    }
}
