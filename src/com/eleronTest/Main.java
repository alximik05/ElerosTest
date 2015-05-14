package com.eleronTest;

import com.eleronTest.model.Sensor;
import com.eleronTest.model.VerificationDevice;
import com.eleronTest.model.VerificationDeviceType;
import com.eleronTest.store.DeviceStore;

public class Main {

    public static void main(String[] args) {


        DeviceStore store = new DeviceStore();
        VerificationDevice device = new VerificationDevice(1, "first", "aes", VerificationDeviceType.ADVANCE);
        VerificationDevice device2 = new VerificationDevice(2, "second", "aes", VerificationDeviceType.SIMPLE);
        Sensor sensor = new Sensor(3, "first", "aes", true);
        Sensor sensor2 = new Sensor(4, "second", "aes", false);

        store.save(device);
        store.save(device2);
        store.save(sensor);
        store.save(sensor2);

        store.showAll();
    }
}
