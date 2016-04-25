package com.raizlabs.android.databasecomparison.dbtools;

import android.content.Context;
import android.util.Log;

import com.raizlabs.android.databasecomparison.MainActivity;
import com.raizlabs.android.databasecomparison.MainApplication;
import com.raizlabs.android.databasecomparison.dbtools.main.simpleaddressitem.SimpleAddressItem;
import com.raizlabs.android.databasecomparison.dbtools.main.simpleaddressitem.SimpleAddressItemManager;
import com.raizlabs.android.databasecomparison.events.LogTestDataEvent;

import java.util.ArrayList;
import java.util.List;

import de.greenrobot.event.EventBus;

public class DBToolsTester {

    public static final String FRAMEWORK_NAME = "DBTools";
    private static SimpleAddressItemManager simpleAddressItemManager;


    public static void testSimple(Context context) {
        simpleSetup();
        List<SimpleAddressItem> addressItems = getAddressItems(MainActivity.LOOP_COUNT);
        long startTime = System.currentTimeMillis();
        simpleAddressItemManager.beginTransaction();
        try {
            for (SimpleAddressItem addressItem : addressItems) {
                simpleAddressItemManager.save(addressItem);
            }
            simpleAddressItemManager.endTransaction(true);
        } catch (Exception e) {
            simpleAddressItemManager.endTransaction(false);
        }
        EventBus.getDefault().post(new LogTestDataEvent(System.currentTimeMillis() - startTime, FRAMEWORK_NAME, MainActivity.SAVE_TIME));

        startTime = System.currentTimeMillis();
        addressItems = simpleAddressItemManager.findAll();
        EventBus.getDefault().post(new LogTestDataEvent(System.currentTimeMillis() - startTime, FRAMEWORK_NAME, MainActivity.LOAD_TIME));

        Log.d("BLAH", "testSimple: " + addressItems.size());

        simpleTearDown();
    }

    private static void simpleSetup() {
        simpleAddressItemManager = new SimpleAddressItemManager(MainApplication.getDbToolsDBManager());
        SimpleAddressItem simpleAddressItem = new SimpleAddressItem(); // Forces non cold start
        simpleAddressItem.setName("Test");
        simpleAddressItem.setAddress("5486 Memory Lane");
        simpleAddressItem.setCity("Bronx");
        simpleAddressItem.setState("NY");
        simpleAddressItem.setPhone(7185555555l);
        simpleAddressItemManager.save(simpleAddressItem);
        simpleAddressItemManager.deleteAll();
    }

    private static void simpleTearDown() {
        simpleAddressItemManager.deleteAll();
        simpleAddressItemManager = null;
    }

    private static List<SimpleAddressItem> getAddressItems(int count) {
        List<SimpleAddressItem> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            SimpleAddressItem simpleAddressItem = new SimpleAddressItem(); // Forces non cold start
            simpleAddressItem.setName("Test");
            simpleAddressItem.setAddress("5486 Memory Lane");
            simpleAddressItem.setCity("Bronx");
            simpleAddressItem.setState("NY");
            simpleAddressItem.setPhone(7185555555l);
            list.add(simpleAddressItem);
        }
        return list;
    }
}
