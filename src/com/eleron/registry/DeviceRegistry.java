package com.eleron.registry;

import com.eleron.model.AbstractDevice;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by alximik on 14/05/15.
 */
public class DeviceRegistry {
    private Map<UUID, AbstractDevice> store = new HashMap<>();


    public void save(AbstractDevice device) {
        store.put(device.getUuid(),device);
    }

    public void delete(UUID uuid) {
        store.remove(uuid);
    }

    public void showAll() {
        for (Map.Entry<UUID,AbstractDevice> entry : store.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }

    public void clearAll() {
        store.clear();
    }

    public AbstractDevice get(UUID deviceId) {
        return store.get(deviceId);
    }

    public int size() {
        return store.size();
    }



}
