package com.example.fragment2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final String TAG = "MainActivity";
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private Button button1, button2, button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        transaction = manager.beginTransaction();
        switch (v.getId()){
            case R.id.button1:
                Fragment01 fragment01 = new Fragment01();
                transaction.replace(R.id.right, fragment01, "fragment01");
                transaction.addToBackStack("fragment01");
                break;
            case R.id.button2:
                Fragment02 fragment02 = new Fragment02();
                transaction.replace(R.id.right, fragment02, "fragment02");
                transaction.addToBackStack("fragment02");
                break;
            case R.id.button3:
                Fragment03 fragment03 = new Fragment03();
                transaction.replace(R.id.right, fragment03, "fragment03");
                transaction.addToBackStack("fragment03");
                break;
            case R.id.button4:
                Fragment04 fragment04 = new Fragment04();
                transaction.replace(R.id.right, fragment04, "fragment04");
                transaction.addToBackStack("fragment04");
                break;
        }
        transaction.commit();
    }
}
