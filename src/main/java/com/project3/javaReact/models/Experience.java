package com.project3.javaReact.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "experiences")
public class Experience{

    @Column(name = "location")
    private String location;

    @Column(name = "category")
    private String category;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "date")
    private Date date;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    public Experience(String location, String category, String description, double price, Date date) {
        this.location = location;
        this.category = category;
        this.description = description;
        this.price = price;
        this.date = date;
    }

    public Experience() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }


}
