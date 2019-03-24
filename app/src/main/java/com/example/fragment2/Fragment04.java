package com.example.fragment2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment04 extends Fragment {
    private final String TAG = "Fragment04";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "--" + TAG + "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f4, null);
        Log.i(TAG, "--" + TAG + "onCreateView");
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "--" + TAG + "onDetach");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, "--" + TAG + "onAttach");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "--" + TAG + "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "--" + TAG + "onReaume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "--" + TAG + "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "--" + TAG + "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "--" + TAG + "onDestoryView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "--" + TAG + "onDestory");
    }
}
