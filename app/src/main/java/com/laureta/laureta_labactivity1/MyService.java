package com.laureta.laureta_labactivity1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends IntentService {
    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("place", "RUANO");
        Log.d("place", "ALBERTUS");
        Log.d("Place", "CARPARK");
        Log.d("Place", "HOSPITAL");
    }
}