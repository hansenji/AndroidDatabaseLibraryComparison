/*
 * SimpleAddressItemManager.java
 *
 * Generated on: 04/17/2016 07:49:23
 *
 */


package com.raizlabs.android.databasecomparison.dbtools.main.simpleaddressitem;

import android.database.Cursor;

import com.raizlabs.android.databasecomparison.dbtools.DatabaseManager;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;


public class SimpleAddressItemManager extends SimpleAddressItemBaseManager {


    public SimpleAddressItemManager(DatabaseManager databaseManager) {
        super(databaseManager);
    }

    @Nonnull
    @Override
    public List<SimpleAddressItem> findAll() {
        List<SimpleAddressItem> list;
        Cursor cursor = findCursorByRawQuery("SELECT * FROM " + SimpleAddressItemConst.TABLE, null);
        list = new ArrayList<>(cursor.getCount());
        if (cursor.moveToFirst()) {
            do {
                list.add(new SimpleAddressItem(cursor));
            } while (cursor.moveToNext());
        }
        cursor.close();
        return list;
    }
}dafsasdfa