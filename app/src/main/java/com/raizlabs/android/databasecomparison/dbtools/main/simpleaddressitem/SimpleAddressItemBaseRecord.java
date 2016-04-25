/*
 * SimpleAddressItemBaseRecord.java
 *
 * GENERATED FILE - DO NOT EDIT
 * CHECKSTYLE:OFF
 * 
 */



package com.raizlabs.android.databasecomparison.dbtools.main.simpleaddressitem;

import org.dbtools.android.domain.AndroidBaseRecord;
import android.content.ContentValues;
import android.database.Cursor;


@SuppressWarnings("all")
public abstract class SimpleAddressItemBaseRecord extends AndroidBaseRecord {

    private long id = 0;
    private String name = "";
    private String address = "";
    private String city = "";
    private String state = "";
    private long phone = 0;

    public SimpleAddressItemBaseRecord() {
    }

    @Override
    public String getIdColumnName() {
        return SimpleAddressItemConst.C_ID;
    }

    @Override
    public long getPrimaryKeyId() {
        return id;
    }

    @Override
    public void setPrimaryKeyId(long id) {
        this.id = id;
    }

    @Override
    public String[] getAllColumns() {
        return SimpleAddressItemConst.ALL_COLUMNS.clone();
    }

    public String[] getAllColumnsFull() {
        return SimpleAddressItemConst.ALL_COLUMNS_FULL.clone();
    }

    @Override
    public ContentValues getContentValues() {
        ContentValues values = new ContentValues();
        values.put(SimpleAddressItemConst.C_NAME, name);
        values.put(SimpleAddressItemConst.C_ADDRESS, address);
        values.put(SimpleAddressItemConst.C_CITY, city);
        values.put(SimpleAddressItemConst.C_STATE, state);
        values.put(SimpleAddressItemConst.C_PHONE, phone);
        return values;
    }

    @Override
    public Object[] getValues() {
        Object[] values = new Object[]{
            id,
            name,
            address,
            city,
            state,
            phone,
        };
        return values;
    }

    public void setContent(ContentValues values) {
        name = values.getAsString(SimpleAddressItemConst.C_NAME);
        address = values.getAsString(SimpleAddressItemConst.C_ADDRESS);
        city = values.getAsString(SimpleAddressItemConst.C_CITY);
        state = values.getAsString(SimpleAddressItemConst.C_STATE);
        phone = values.getAsLong(SimpleAddressItemConst.C_PHONE);
    }

    @Override
    public void setContent(Cursor cursor) {
        id = cursor.getLong(cursor.getColumnIndexOrThrow(SimpleAddressItemConst.C_ID));
        name = cursor.getString(cursor.getColumnIndexOrThrow(SimpleAddressItemConst.C_NAME));
        address = cursor.getString(cursor.getColumnIndexOrThrow(SimpleAddressItemConst.C_ADDRESS));
        city = cursor.getString(cursor.getColumnIndexOrThrow(SimpleAddressItemConst.C_CITY));
        state = cursor.getString(cursor.getColumnIndexOrThrow(SimpleAddressItemConst.C_STATE));
        phone = cursor.getLong(cursor.getColumnIndexOrThrow(SimpleAddressItemConst.C_PHONE));
    }

    public boolean isNewRecord() {
        return getPrimaryKeyId() <= 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(@javax.annotation.Nonnull String name) {
        this.name = name;
    }

    @javax.annotation.Nonnull
    public String getAddress() {
        return address;
    }

    public void setAddress(@javax.annotation.Nonnull String address) {
        this.address = address;
    }

    @javax.annotation.Nonnull
    public String getCity() {
        return city;
    }

    public void setCity(@javax.annotation.Nonnull String city) {
        this.city = city;
    }

    @javax.annotation.Nonnull
    public String getState() {
        return state;
    }

    public void setState(@javax.annotation.Nonnull String state) {
        this.state = state;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }


}