package com.eleronTest.store;

import com.eleronTest.model.BaseEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alximik on 14/05/15.
 */
public class DeviceStore {
    private Map<Integer, BaseEntity> store = new HashMap<>();


    public void save(BaseEntity device) {
        store.put(device.getUuid(),device);
    }

    public void delete(int uuid) {
        store.remove(uuid);
    }

    public void showAll() {
        for (Map.Entry<Integer,BaseEntity> entry : store.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }

    public void clearAll() {
        store.clear();
    }

    public BaseEntity get(int deviceId) {
        return store.get(deviceId);
    }

    public int size() {
        return store.size();
    }



}
