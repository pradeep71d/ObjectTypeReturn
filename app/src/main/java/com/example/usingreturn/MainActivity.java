package com.example.usingreturn;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        School ec=new School();
        School s1=ec.m1();//here we are storing value in variable s1 after getting value by calling method of School Class.
        System.out.println("final value will be="+s1);
    }
}
