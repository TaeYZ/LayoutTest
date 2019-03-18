

package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.layout1);//线性布局
        //setContentView(R.layout.layout2);//相对布局
        setContentView(R.layout.layout3);//表格布局

    }
}
