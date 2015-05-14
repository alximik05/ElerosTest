package com.eleronTest.model;

/**
 * Created by alximik on 13/05/15.
 */
public class Sensor extends BaseEntity {

    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Sensor(int uuid, String name, String location, boolean status) {
        super(uuid, name, location);
        this.status = status;
    }

    @Override
    public String toString() {

        return "Sensor ->" +
                " uuid : " + super.getUuid() +
                " name : " + super.getName() +
                " location : " + super.getLocation() +
                " status : " + status;
    }
}
