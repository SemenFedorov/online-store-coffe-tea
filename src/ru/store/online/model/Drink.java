package ru.store.online.model;

import ru.store.online.model.enumeration.Country;
import ru.store.online.model.enumeration.Manufacturer;
import ru.store.online.model.enumeration.Bag;

import java.math.BigDecimal;

public abstract class Drink {

    private String name;
    private BigDecimal price;
    private Float weight;
    private Manufacturer manufacturer;
    private Country country;
    private Bag bag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Bag getBag() {
        return bag;
    }
    public void setBag(Bag bag) {
        this.bag = bag;
    }
}
