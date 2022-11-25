package com.example.integradora_2;

import javafx.scene.image.Image;

import java.lang.module.Configuration;

public class Component {

    private String name;

    private Integer price;

    private Image image;

    private String description;

    private ComponentType componentType;

    public Component(String name, Integer price, String image, String description, ComponentType componentType){

        this.name = name;

        this.price = price;

        this.image = new Image(image);

        this.description = description;

        this.componentType = componentType;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ComponentType getComponentType(){
        return componentType;
    }
}
