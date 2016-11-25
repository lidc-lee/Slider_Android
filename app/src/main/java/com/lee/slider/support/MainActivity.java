package com.lee.slider.support;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lee.slider.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if (savedInstanceState == null) {
            replaceTutorialFragment();
        }
    }

    @OnClick({R.id.bRetry})
    void onClick(View view){
        switch (view.getId()){
            case R.id.bRetry:
                replaceTutorialFragment();
                break;
        }
    }
    public void replaceTutorialFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new CustomTutorialSupportFragment())
                .commit();
    }
}
