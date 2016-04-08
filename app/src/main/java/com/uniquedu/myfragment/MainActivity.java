package com.uniquedu.myfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @InjectView(R.id.button_lifecycle)
    Button buttonLifecycle;
    @InjectView(R.id.button_layout)
    Button buttonLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }


    @OnClick({R.id.button_lifecycle, R.id.button_layout})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_lifecycle: {
                Intent intent = new Intent(getApplicationContext(), LifecycleActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.button_layout: {
                Intent intent = new Intent(getApplicationContext(), FragmentStackActivity.class);
                startActivity(intent);
            }
            break;
        }
    }
}
