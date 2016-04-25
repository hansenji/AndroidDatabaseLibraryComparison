/*
 * SimpleAddressItemBaseRecord.java
 *
 * GENERATED FILE - DO NOT EDIT
 * CHECKSTYLE:OFF
 * 
 */



package com.raizlabs.android.databasecomparison.dbtools.main.simpleaddressitem;

import android.database.Cursor;


@SuppressWarnings("all")
public class SimpleAddressItemConst {

    public static final String DATABASE = "main";
    public static final String TABLE = "SimpleAddressItem";
    public static final String FULL_TABLE = "main.SimpleAddressItem";
    public static final String PRIMARY_KEY_COLUMN = "id";
    public static final String C_ID = "id";
    public static final String FULL_C_ID = "SimpleAddressItem.id";
    public static final String C_NAME = "name";
    public static final String FULL_C_NAME = "SimpleAddressItem.name";
    public static final String C_ADDRESS = "address";
    public static final String FULL_C_ADDRESS = "SimpleAddressItem.address";
    public static final String C_CITY = "city";
    public static final String FULL_C_CITY = "SimpleAddressItem.city";
    public static final String C_STATE = "state";
    public static final String FULL_C_STATE = "SimpleAddressItem.state";
    public static final String C_PHONE = "phone";
    public static final String FULL_C_PHONE = "SimpleAddressItem.phone";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS SimpleAddressItem (" + 
        "id INTEGER PRIMARY KEY  AUTOINCREMENT," + 
        "name TEXT NOT NULL," + 
        "address TEXT NOT NULL," + 
        "city TEXT NOT NULL," + 
        "state TEXT NOT NULL," + 
        "phone INTEGER NOT NULL" + 
        ");" + 
        "" + 
        "";
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS SimpleAddressItem;";
    public static final String[] ALL_COLUMNS = new String[] {
        C_ID,
        C_NAME,
        C_ADDRESS,
        C_CITY,
        C_STATE,
        C_PHONE};
    public static final String[] ALL_COLUMNS_FULL = new String[] {
        FULL_C_ID,
        FULL_C_NAME,
        FULL_C_ADDRESS,
        FULL_C_CITY,
        FULL_C_STATE,
        FULL_C_PHONE};

    public SimpleAddressItemConst() {
    }

    public static long getId(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndexOrThrow(C_ID));
    }

    public static String getName(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow(C_NAME));
    }

    public static String getAddress(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow(C_ADDRESS));
    }

    public static String getCity(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow(C_CITY));
    }

    public static String getState(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow(C_STATE));
    }

    public static long getPhone(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndexOrThrow(C_PHONE));
    }


}