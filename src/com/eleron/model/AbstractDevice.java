package com.eleron.model;

import java.util.UUID;

/**
 * Created by alximik on 13/05/15.
 */
public class AbstractDevice {
    private UUID uuid;
    private String name;
    private String location;

    public AbstractDevice(UUID uuid, String name, String location) {
        this.uuid = uuid;
        this.name = name;
        this.location = location;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public UUID getUuid() {

        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractDevice that = (AbstractDevice) o;

        if (uuid != that.uuid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }
}
