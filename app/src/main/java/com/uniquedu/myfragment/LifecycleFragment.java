package com.uniquedu.myfragment;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class LifecycleFragment extends Fragment {
    private static final String TAG = "LifecycleFragment";

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
        return inflater.inflate(R.layout.fragment_lifecycle, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }
}
