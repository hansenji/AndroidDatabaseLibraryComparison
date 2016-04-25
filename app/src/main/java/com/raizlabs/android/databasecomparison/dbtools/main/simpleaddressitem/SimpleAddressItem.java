/*
 * SimpleAddressItem.java
 *
 * Created: 04/17/2016 07:49:23
 */



package com.raizlabs.android.databasecomparison.dbtools.main.simpleaddressitem;

import android.database.Cursor;
import android.content.ContentValues;


public class SimpleAddressItem extends SimpleAddressItemBaseRecord {


    public SimpleAddressItem(Cursor cursor) {
        setContent(cursor);
    }

    public SimpleAddressItem(ContentValues values) {
        setContent(values);
    }

    public SimpleAddressItem() {
    }


}