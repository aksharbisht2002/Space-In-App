package com.example.spacein;

public class Items {

    public String name ;
    public int image ;

    public Items(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getImage() {

        return image;
    }

    public void setImage(int image) {

        this.image = image;
    }
}
