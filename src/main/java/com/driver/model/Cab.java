package com.driver.model;

import javax.persistence.*;
import java.sql.Driver;

@Entity
public class Cab{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cabId;

    private int perKmRate;
    private boolean available;

    @OneToOne
    @JoinColumn
   private Driver driver;

    public Cab(int perKmRate) {

    }

    public Cab(int perKmRate, boolean available) {

        this.perKmRate = perKmRate;
        this.available = available;
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

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}