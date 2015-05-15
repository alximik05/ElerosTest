package com.eleron.registry;

import com.eleron.model.Sensor;
import com.eleron.model.VerificationDevice;
import com.eleron.model.VerificationDeviceType;
import org.junit.Before;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class DeviceRegistryTest {

    DeviceRegistry store = new DeviceRegistry();
    VerificationDevice device = new VerificationDevice( UUID.randomUUID(), "first", "aes", VerificationDeviceType.ADVANCE);
    VerificationDevice device2 = new VerificationDevice(UUID.randomUUID(), "second", "aes", VerificationDeviceType.SIMPLE);
    Sensor sensor = new Sensor(UUID.randomUUID(), "first", "aes", true);
    Sensor sensor2 = new Sensor(UUID.randomUUID(), "second", "aes", false);
    @Before
    public void before() {


        store.clearAll();

        store.save(device);
        store.save(device2);
        store.save(sensor);
        store.save(sensor2);

    }

    @org.junit.Test
    public void testSave() throws Exception {
        assertEquals(4, store.size());
    }

    @org.junit.Test
    public void testDelete() throws Exception {
        UUID uuid = device.getUuid();
        store.delete(uuid);
        assertEquals(3, store.size());
    }


    @org.junit.Test
    public void testClearAll() throws Exception {
        store.clearAll();
        assertEquals(0, store.size());
    }

    @org.junit.Test
    public void testGet() throws Exception {

        UUID uuid = device.getUuid();
        assertEquals(device, store.get(uuid));
    }


}