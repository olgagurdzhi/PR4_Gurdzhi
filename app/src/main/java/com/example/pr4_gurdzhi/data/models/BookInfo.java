package com.example.pr4_gurdzhi.data.models;

public class BookInfo {
    private String name;

    private int pictureResource;

    public BookInfo(String name, int pic){
        this.name=name;
        this.pictureResource=pic;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPictureResource() {
        return this.pictureResource;
    }

    public void setPictureResource(int pictureResource) {
        this.pictureResource = pictureResource;
    }
}

