package com.eleronTest.model;

import java.util.Arrays;

/**
 * Created by alximik on 13/05/15.
 */
public class VerificationDevice extends BaseEntity {

    private VerificationDeviceType type;

    public VerificationDeviceType getType() {
        return type;
    }

    public VerificationDevice(int uuid, String name, String location, VerificationDeviceType type) {
        super(uuid, name, location);
        this.type = type;
    }

    public boolean verification(byte[] calculated, byte[] standard) {
        switch (type) {
            case SIMPLE:
                System.out.println("SIMPLE");
                return Arrays.equals(calculated, standard);

              //  break;

            case ADVANCE:
                if (calculated == standard)
                    return true;
                if (calculated == null || standard == null)
                    return false;

                int length = calculated.length;
                if (standard.length != length)
                    return false;

                for (int i = 0; i < length; i++)
                    if (calculated[i] != standard[i])
                        return false;
                System.out.println("ADVANCE");
                return true;

        }
        return false;
    }

    public String toString() {

        return "VerificationDevice -> " +
                "uuid : " + super.getUuid() +
                " name : " + super.getName() +
                " location : " + super.getLocation() +
                " type : " + type.toString();
    }
}
