package com.example.hotelview.model;

public class Booking {
    private long Id;
    private long customerId;
    private long hotelId;
    private double price;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}