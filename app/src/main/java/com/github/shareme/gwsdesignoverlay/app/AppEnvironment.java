package com.github.shareme.gwsdesignoverlay.app;

public enum AppEnvironment {
    INSTANCE;

    private boolean mOverlayServiceRunning;

    public void setOverlayServiceRunning(boolean isRunning) {
        mOverlayServiceRunning = isRunning;

    }

    public boolean isOverlayServiceRunning() {
        return mOverlayServiceRunning;
    }
}