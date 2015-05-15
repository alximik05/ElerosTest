package com.eleron;

import com.eleron.model.Sensor;
import com.eleron.model.VerificationDevice;
import com.eleron.model.VerificationDeviceType;
import com.eleron.registry.DeviceRegistry;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {


        DeviceRegistry store = new DeviceRegistry();
        VerificationDevice device = new VerificationDevice( UUID.randomUUID(), "first", "aes", VerificationDeviceType.ADVANCE);
        VerificationDevice device2 = new VerificationDevice(UUID.randomUUID(), "second", "aes", VerificationDeviceType.SIMPLE);
        Sensor sensor = new Sensor(UUID.randomUUID(), "first", "aes", true);
        Sensor sensor2 = new Sensor(UUID.randomUUID(), "second", "aes", false);


        store.save(device);
        store.save(device2);
        store.save(sensor);
        store.save(sensor2);

        store.showAll();
    }


}