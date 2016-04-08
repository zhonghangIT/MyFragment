package com.uniquedu.myfragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class LifecycleActivity extends AppCompatActivity {
    private static final String TAG = "LifecycleActivity";
    @InjectView(R.id.button_clear)
    Button buttonClear;
    @InjectView(R.id.button_add)
    Button buttonAdd;
    @InjectView(R.id.framecontainer)
    FrameLayout framecontainer;
    FragmentManager manager;
    LifecycleFragment lifecycleFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        ButterKnife.inject(this);
        manager = getSupportFragmentManager();
        lifecycleFragment= (LifecycleFragment) manager.findFragmentById(R.id.fragment_life);
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "运行到的方法名：" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }


    @OnClick({R.id.button_clear, R.id.button_add})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_clear:
                framecontainer.removeAllViews();
                manager.popBackStack();
                if (lifecycleFragment != null)
                    manager.beginTransaction().remove(lifecycleFragment).commit();
                break;
            case R.id.button_add:
                FragmentTransaction transaction = manager.beginTransaction();
                lifecycleFragment = new LifecycleFragment();
                transaction.add(R.id.framecontainer, lifecycleFragment, "lifecycle");
                transaction.commit();
                break;
        }
    }
}
