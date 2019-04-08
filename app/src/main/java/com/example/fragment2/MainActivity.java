package com.example.fragment2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final String TAG = "MainActivity";
    private FragmentManager manager;
    private int upfg = 0;

    private Button button1, button2, button3, button4;

    private Fragment01 fg1;
    private Fragment02 fg2;
    private Fragment03 fg3;
    private Fragment04 fg4;

    private static final int _fg1 = 1;
    private static final int _fg2 = 2;
    private static final int _fg3 = 3;
    private static final int _fg4 = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button1:
                showFragment(_fg1);
                break;
            case R.id.button2:
                showFragment(_fg2);
                break;
            case R.id.button3:
                showFragment(_fg3);
                break;
            case R.id.button4:
                showFragment(_fg4);
                break;
        }
    }

    private void showFragment(int id) {
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        hideFragment(fragmentTransaction);
        upfg = id;
        switch (id) {
            case _fg1:
                if (fg1 == null) {
                    fg1 = new Fragment01();
                    fragmentTransaction.add(R.id.right, fg1);

                } else {
                    fragmentTransaction.show(fg1);
                }

                break;
            case _fg2:
                if (fg2 == null) {
                    fg2 = new Fragment02();
                    fragmentTransaction.add(R.id.right, fg2);

                } else {
                    fragmentTransaction.show(fg2);
                }

                break;
            case _fg3:
                if (fg3 == null) {
                    fg3 = new Fragment03();
                    fragmentTransaction.add(R.id.right, fg3);

                } else {
                    fragmentTransaction.show(fg3);
                }

                break;
            case _fg4:
                if (fg4 == null) {
                    fg4 = new Fragment04();
                    fragmentTransaction.add(R.id.right, fg4);

                } else {
                    fragmentTransaction.show(fg4);
                }

                break;
        }
        fragmentTransaction.commit();
    }

    private void hideFragment(FragmentTransaction ft) {
        if (fg1 != null) {
            ft.hide(fg1);
        }
        if (fg2 != null) {
            ft.hide(fg2);
        }
        if (fg3 != null) {
            ft.hide(fg3);
        }
        if (fg4 != null) {
            ft.hide(fg4);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (upfg != 0){
                FragmentTransaction ft = manager.beginTransaction();
                hideFragment(ft);
                fg1 = null;
                fg2 = null;
                fg3 = null;
                fg4 = null;
                ft.commit();
                upfg = 0;
                return false;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
