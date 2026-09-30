package com.tnsif.shoppingmall.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "parking")
public class entity {

    @Id
    private int id;

    private int slotNumber;
    private String vehicleNumber;
    private String vehicleType;
    private boolean occupied;
    private double pricePerHour;

    // Default constructor
    public entity() {
    }

    // Parameterized constructor
    public entity(int id, int slotNumber, String vehicleNumber,
                  String vehicleType, boolean occupied,
                  double pricePerHour) {
        this.id = id;
        this.slotNumber = slotNumber;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.occupied = occupied;
        this.pricePerHour = pricePerHour;
    }
//getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
}