package com.github.shareme.gwsdesignoverlay.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;


import com.github.shareme.gwsdesignoverlay.R;
import com.github.shareme.gwsdesignoverlay.activity.base.BaseActivity;
import com.github.shareme.gwsdesignoverlay.app.AppEnvironment;

import com.github.shareme.gwsdesignoverlay.service.DesignOverlayService;



@SuppressWarnings("unused")
public class SettingsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    Switch mGridSwitch= findViewById(R.id.grid_switch);

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, SettingsActivity.class);
        return intent;
    }


    void afterViews() {
        mGridSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    startService(DesignOverlayService.createIntent(SettingsActivity.this));
                } else {
                    stopService(DesignOverlayService.createIntent(SettingsActivity.this));
                }
            }
        });
    }





    @Override
    protected void onResume() {
        super.onResume();
        mGridSwitch.setChecked(AppEnvironment.INSTANCE.isOverlayServiceRunning());
    }
}