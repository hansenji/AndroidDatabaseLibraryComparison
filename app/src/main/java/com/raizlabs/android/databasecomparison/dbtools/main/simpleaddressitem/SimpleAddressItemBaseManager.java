/*
 * SimpleAddressItemBaseManager.java
 *
 * GENERATED FILE - DO NOT EDIT
 * 
 */



package com.raizlabs.android.databasecomparison.dbtools.main.simpleaddressitem;

import com.raizlabs.android.databasecomparison.dbtools.DatabaseManager;
import org.dbtools.android.domain.database.DatabaseWrapper;
import org.dbtools.android.domain.AndroidBaseManagerWritable;


@SuppressWarnings("all")
public abstract class SimpleAddressItemBaseManager extends AndroidBaseManagerWritable<SimpleAddressItem> {

    private DatabaseManager databaseManager;

    public SimpleAddressItemBaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    @javax.annotation.Nonnull
    public String getDatabaseName() {
        return SimpleAddressItemConst.DATABASE;
    }

    @javax.annotation.Nonnull
    public SimpleAddressItem newRecord() {
        return new SimpleAddressItem();
    }

    @javax.annotation.Nonnull
    public String getTableName() {
        return SimpleAddressItemConst.TABLE;
    }

    @javax.annotation.Nonnull
    public String[] getAllColumns() {
        return SimpleAddressItemConst.ALL_COLUMNS;
    }

    @javax.annotation.Nonnull
    public DatabaseWrapper getReadableDatabase(@javax.annotation.Nonnull String databaseName) {
        return databaseManager.getReadableDatabase(databaseName);
    }

    @javax.annotation.Nonnull
    public DatabaseWrapper getReadableDatabase() {
        return databaseManager.getReadableDatabase(getDatabaseName());
    }

    @javax.annotation.Nonnull
    public DatabaseWrapper getWritableDatabase(@javax.annotation.Nonnull String databaseName) {
        return databaseManager.getWritableDatabase(databaseName);
    }

    @javax.annotation.Nonnull
    public DatabaseWrapper getWritableDatabase() {
        return databaseManager.getWritableDatabase(getDatabaseName());
    }

    @javax.annotation.Nonnull
    public org.dbtools.android.domain.AndroidDatabase getAndroidDatabase(@javax.annotation.Nonnull String databaseName) {
        return databaseManager.getDatabase(databaseName);
    }

    @javax.annotation.Nonnull
    public String getPrimaryKey() {
        return SimpleAddressItemConst.PRIMARY_KEY_COLUMN;
    }

    @javax.annotation.Nonnull
    public String getDropSql() {
        return SimpleAddressItemConst.DROP_TABLE;
    }

    @javax.annotation.Nonnull
    public String getCreateSql() {
        return SimpleAddressItemConst.CREATE_TABLE;
    }


}