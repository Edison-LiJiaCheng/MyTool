package com.example.mygeeknews.utils;

import android.util.Log;

import com.example.mygeeknews.BuildConfig;


/**
 * Created by $lzj on 2019/5/5.
 */
public class Logger {

    public static void logD(String tag,String msg){
        if (BuildConfig.DEBUG){
            Log.d(tag, "logD: "+msg);
        }
    }
    private static boolean mIsDebug = BuildConfig.DEBUG;


    public static void v(String tag, String msg){
        if(mIsDebug){
            Log.v(tag, msg);
        }

    }
    public static void d(String tag, String msg){
        if(mIsDebug){
            Log.d(tag, msg);
        }
    }
    public static void i(String tag, String msg){
        if(mIsDebug){
            Log.i(tag, msg);
        }
    }
    public static void w(String tag, String msg,Throwable throwable){
        if(mIsDebug){
            Log.w(tag, msg,throwable);
        }
    }
    public static void e(String tag, String msg,Throwable throwable){
        if(mIsDebug){
            Log.e(tag, msg,throwable);
        }
    }
}
