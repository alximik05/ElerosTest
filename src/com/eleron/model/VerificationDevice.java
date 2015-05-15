package com.eleron.model;

import java.util.UUID;

/**
 * Created by alximik on 13/05/15.
 */
public class VerificationDevice extends AbstractDevice {

    private VerificationDeviceType type;

    public VerificationDeviceType getType() {
        return type;
    }

    public VerificationDevice(UUID uuid, String name, String location, VerificationDeviceType type) {
        super(uuid, name, location);
        this.type = type;
    }

    public String toString() {

        return "VerificationDevice -> " +
                "uuid : " + super.getUuid() +
                " name : " + super.getName() +
                " location : " + super.getLocation() +
                " type : " + type.toString();
    }
}
