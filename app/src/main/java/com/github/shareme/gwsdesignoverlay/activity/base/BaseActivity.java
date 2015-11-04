package com.github.shareme.gwsdesignoverlay.activity.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

@SuppressWarnings("unused")
public abstract class BaseActivity extends AppCompatActivity {

    private boolean mVisible;
    private boolean mStopped;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mVisible = true;
        mStopped = false;
    }

    @Override
    protected void onPause() {
        super.onPause();
        mVisible = false;
    }

    @Override
    protected void onStop() {
        super.onStop();
        mStopped = true;
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    public boolean isVisible() {
        return mVisible;
    }

    public boolean isStopped() {
        return mStopped;
    }


}