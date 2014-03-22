package com.saulpower.GreenWireTest;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.saulpower.GreenWireTest.database.DaoMaster;
import com.saulpower.GreenWireTest.database.DaoSession;

/**
 * Created by saulhoward on 3/14/14.
 */
public class GreenWireApplication extends Application {

    private static GreenWireApplication sInstance;

    private static SQLiteDatabase sDatabase;
    private static DaoMaster sDaoMaster;
    private static DaoSession sDaoSession;

    public GreenWireApplication() {
        sInstance = this;
    }

    public static Context getContext() {
        return sInstance;
    }

    private void initializeDatabase() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "smart-db", null);
        sDatabase = helper.getWritableDatabase();
        sDaoMaster = new DaoMaster(sDatabase);
        sDaoSession = sDaoMaster.newSession();
    }

    public static DaoSession getDaoSession() {
        return sDaoSession;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        initializeDatabase();
    }
}
