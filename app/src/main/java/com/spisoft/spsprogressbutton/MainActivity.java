package com.spisoft.spsprogressbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;

import com.spisoft.sprogressbutton.CircularProgressButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CircularProgressButton Circ_Btn_Code = (CircularProgressButton) findViewById(R.id.circularButtonCode);
        Circ_Btn_Code.setIndeterminateProgressMode(true);
    }
}