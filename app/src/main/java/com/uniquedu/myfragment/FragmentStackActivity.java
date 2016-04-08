package com.uniquedu.myfragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class FragmentStackActivity extends AppCompatActivity {

    @InjectView(R.id.button_push)
    Button buttonPush;
    @InjectView(R.id.button_pop)
    Button buttonPop;
    @InjectView(R.id.framecontainer)
    FrameLayout framecontainer;
    private int page = 0;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_stack);
        ButterKnife.inject(this);
        manager = getSupportFragmentManager();
    }

    @OnClick({R.id.button_push, R.id.button_pop})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_push:
                page++;
                manager.beginTransaction().add(R.id.framecontainer, StackFragment.newInstance("fragment的标号为" + page), "fragment" + page).addToBackStack("" + page).commit();
                Log.d("FragmentStackActivity","堆栈的层数"+manager.getBackStackEntryCount());
                break;
            case R.id.button_pop:
                page--;
                manager.popBackStack();
                Log.d("FragmentStackActivity","堆栈的层数"+manager.getBackStackEntryCount());
                break;
        }
    }
}
