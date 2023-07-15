package com.driver.model;

import javax.persistence.*;
import java.sql.Driver;

@Entity
public class Cab{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cabId;

    private int perKmRate;
    private boolean availableCab;

    @OneToOne(mappedBy = "Cab",cascade = CascadeType.ALL)
    Driver driver;

    public Cab(int i) {

    }

    public Cab(int cabId, int perKmRate, boolean availableCab) {
        this.cabId = cabId;
        this.perKmRate = perKmRate;
        this.availableCab = availableCab;
    }

    public int getCabId() {
        return cabId;
    }

    public void setCabId(int cabId) {
        this.cabId = cabId;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailableCab() {
        return availableCab;
    }

    public void setAvailableCab(boolean availableCab) {
        this.availableCab = availableCab;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}