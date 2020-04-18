package com.yussefsaidi.dagger2examplenew;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    private static final String TAG = "Remote";
    
    @Inject
    public Remote() {
    }

    void setListener(Car car){
        Log.d(TAG, "Remote connected");
    }
}
