
package com.raizlabs.android.databasecomparison.dbtools;

import android.util.Log;
import android.app.Application;
import org.dbtools.android.domain.AndroidDatabase;
import org.dbtools.android.domain.database.DatabaseWrapper;
import org.dbtools.android.domain.database.AndroidDatabaseWrapper;


public class DatabaseManager extends DatabaseBaseManager {

    private Application application;
    private final int mainTablesVersion = 1;
    private final int mainViewsVersion = 1;

    public DatabaseManager(Application application) {
        this.application = application;
    }

    public void identifyDatabases() {
        addDatabase(application, DatabaseManagerConst.MAIN_DATABASE_NAME, mainTablesVersion, mainViewsVersion);
    }

    public DatabaseWrapper createNewDatabaseWrapper(AndroidDatabase androidDatabase) {
        return new AndroidDatabaseWrapper(androidDatabase.getPath());
    }

    public void onUpgrade(AndroidDatabase androidDatabase, int oldVersion, int newVersion) {
        String databaseName = androidDatabase.getName();
        Log.i(TAG, "Upgrading database [" + databaseName + "] from version " + oldVersion + " to " + newVersion);
    }

    public void onUpgradeViews(AndroidDatabase androidDatabase, int oldVersion, int newVersion) {
        String databaseName = androidDatabase.getName();
        Log.i(TAG, "Upgrading database [" + databaseName + "] VIEWS from version " + oldVersion + " to " + newVersion);
        // automatically drop/create views
        super.onUpgradeViews(androidDatabase, oldVersion, newVersion);
    }

    public void setApplication(Application application) {
        this.application = application;
    }


}