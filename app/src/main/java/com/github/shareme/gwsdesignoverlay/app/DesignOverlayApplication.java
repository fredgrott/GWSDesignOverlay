package com.github.shareme.gwsdesignoverlay.app;

import android.app.Application;
import android.preference.PreferenceManager;

import com.github.shareme.gwsdesignoverlay.BuildConfig;
import com.github.shareme.gwsdesignoverlay.R;

import timber.log.Timber;

@SuppressWarnings("unused")
public class DesignOverlayApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            // set up Timber for logging
            Timber.plant(new Timber.DebugTree());
        }

        // set default values for the app preference
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
    }
}