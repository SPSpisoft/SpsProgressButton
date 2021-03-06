package com.spisoft.spsprogressbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
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

        Circ_Btn_Code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Circ_Btn_Code.setProgress(50);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Circ_Btn_Code.setProgress(100);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Circ_Btn_Code.setProgress(0);
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Circ_Btn_Code.setProgress(50);
                                        new Handler().postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                Circ_Btn_Code.setProgress(-1);
                                                new Handler().postDelayed(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        Circ_Btn_Code.setProgress(0);
                                                    }
                                                }, 3000);
                                            }
                                        }, 3000);
                                    }
                                }, 3000);
                            }
                        }, 3000);
                    }
                }, 3000);
            }
        });
    }
}