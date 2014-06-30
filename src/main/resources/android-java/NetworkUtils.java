package com.youpers.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by IvanRigamonti on 05.05.14.
 */
public class NetworkUtils {
    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager mConnMgr = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mNetworkInfo = mConnMgr.getActiveNetworkInfo();
        return ( mNetworkInfo != null && mNetworkInfo.isConnected() );
    }
}
