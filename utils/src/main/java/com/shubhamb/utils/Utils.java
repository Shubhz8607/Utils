package com.shubhamb.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

public class Utils
{
    public static boolean checkInternet(Context context)
    {
        final String TAG = "Check Internet";

        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager != null)
        {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected())
            {
                Log.d(TAG, "Internet is connected");
                return true;
            }
            else
            {
                Toast.makeText(context, "Internet is not connected", Toast.LENGTH_LONG).show();
                return false;
            }
        }
        else
        {
            Log.d(TAG, "ConnectivityManager was null");
        }

        return false;
    }

}
