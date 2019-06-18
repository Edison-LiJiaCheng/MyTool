package com.example.mygeeknews.base;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.example.mygeeknews.dao.DaoMaster;
import com.example.mygeeknews.dao.DaoSession;

/**
 * Created by $lzj on 2019/6/3.
 */
public class BaseApplication extends Application {

    private static BaseApplication application;
    private static DaoSession daoSession;

    public static DaoSession getDaoSession() {
        return daoSession;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        //数据库
        initDb();
    }

    private void initDb() {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "geeknews.db");
        SQLiteDatabase db = devOpenHelper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    public static BaseApplication getApplication() {
        return application;
    }
}
