package com.example.hp.quickchange;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout=findViewById(R.id.layout);
        radioGroup=findViewById(R.id.rGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId)
                {

                    case R.id.rBtnBlue:
                    relativeLayout.setBackgroundColor(Color.parseColor("#74B9FF"));
                    break;

                    case R.id.rBtnGreen:
                        relativeLayout.setBackgroundColor(Color.parseColor("#2ecc72"));
                        break;

                    case R.id.rBtnRed:
                        relativeLayout.setBackgroundColor(Color.parseColor("#FF3031"));
                        break;

                }
            }
        });
    }
}
