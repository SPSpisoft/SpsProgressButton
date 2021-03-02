package com.spisoft.sprogressbutton;

class StateManager {

    private boolean mIsEnabled;
    private int mProgress;

    public StateManager(com.spisoft.sprogressbutton.CircularProgressButton progressButton) {
        mIsEnabled = progressButton.isEnabled();
        mProgress = progressButton.getProgress();
    }

    public void saveProgress(com.spisoft.sprogressbutton.CircularProgressButton progressButton) {
        mProgress = progressButton.getProgress();
    }

    public boolean isEnabled() {
        return mIsEnabled;
    }

    public int getProgress() {
        return mProgress;
    }

    public void checkState(com.spisoft.sprogressbutton.CircularProgressButton progressButton) {
        if (progressButton.getProgress() != getProgress()) {
            progressButton.setProgress(progressButton.getProgress());
        } else if(progressButton.isEnabled() != isEnabled()) {
            progressButton.setEnabled(progressButton.isEnabled());
        }
    }
}
