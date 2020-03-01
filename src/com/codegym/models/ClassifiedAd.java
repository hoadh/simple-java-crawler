package com.codegym.models;

public class ClassifiedAd {
    private String title;       // tiêu đề
    private Price price;        // giá
    private Float acreage;      // diện tích
    private String description; // mô tả

    public ClassifiedAd(String title, Price price, Float acreage, String description) {
        this.title = title;
        this.price = price;
        this.acreage = acreage;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Float getAcreage() {
        return acreage;
    }

    public void setAcreage(Float acreage) {
        this.acreage = acreage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
