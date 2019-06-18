package com.example.mygeeknews.utils;

import android.os.Environment;

import com.example.mygeeknews.base.BaseApplication;

import java.io.File;

/**
 * Created by $lzj on 2019/5/5.
 */
public interface AppConstants {

    public static final int ZHIHU = 0;
    public static final int WECHAT = 1;
    public static final int GANK = 2;
    public static final int GOLD = 3;
    public static final int V2EX = 4;
    public static final int COLLECT = 5;
    public static final int SETTINGS = 6;
    public static final int ABOUT = 7;

    String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() +
            File.separator + "code" + File.separator + "GeekNews";

    String FILE_PROVIDER_AUTHORITY = "com.baidu.geek.fileprovider";

    //网络缓存的地址
    String PATH_DATA = BaseApplication.getApplication().getCacheDir().getAbsolutePath() +
            File.separator + "data";

    String PATH_CACHE = PATH_DATA + "/NetCache";

}
