package com.codegym.models;

public class Price {
    private Float price;
    private TypePrice typePrice;

    public Price(Float price, TypePrice typePrice) {
        this.price = price;
        this.typePrice = typePrice;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public TypePrice getTypePrice() {
        return typePrice;
    }

    public void setTypePrice(TypePrice typePrice) {
        this.typePrice = typePrice;
    }


}
