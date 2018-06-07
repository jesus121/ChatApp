package com.android.teaching.chatapp.Adapter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class MyConnectivityReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager myConnectivtyManager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = myConnectivtyManager.getActiveNetworkInfo();
        boolean hasInternet = networkInfo != null
                && networkInfo.isConnectedOrConnecting();

    }
}
