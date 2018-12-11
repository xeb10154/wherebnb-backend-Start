package com.project3.javaReact.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javafx.util.Pair;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "properties")
public class Property {

//    Pair<String, Double> lon = new Pair<>("lon", 12.34);
//    Pair<String, Double> lat = new Pair<>("lat", -94.5);
//    Pair<String, Pair<String, Pair>> location = new Pair("location",  );
//
//    Will look into the lon lat soon, currently lon and lat variables are independently set.

    @Column(name = "name")
    private String name;

    @Column(name = "beds")
    private int beds;

    @Column(name = "price")
    private double price;

    @Column(name = "type")
    private String type;

    @Column(name = "rating")
    private double rating;

    @Column(name = "location")
    private String location;

    @Column(name = "lon")
    private double lon;

    @Column(name = "lat")
    private double lat;

    @Column(name = "max_guests")
    private int maxGuests;

    @Column(name = "rooms")
    private int rooms;

    @Column(name = "Details", length = 512)
    private String details;

    @ElementCollection
    @CollectionTable(name = "images", joinColumns = @JoinColumn(name = "property_id"))
    @Column(name = "image_paths")
    private List<String> images;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @JsonIgnoreProperties("properties")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "bookings",
            joinColumns = {@JoinColumn(name = "properties_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = false)}
    )
    private List<User> users;

    public Property(String location, String type, String name, int maxGuests, int rooms, int beds, String details, double price, double rating, double lon, double lat) {
        this.name = name;
        this.beds = beds;
        this.price = price;
        this.type = type;
        this.details = details;
        this.rating = rating;
        this.rooms = rooms;
        this.location = location;
        this.lon = lon;
        this.lat = lat;
        this.images = new ArrayList<String>();
        this.users = new ArrayList<User>();
        this.maxGuests = maxGuests;
    }

    public Property() {
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addImage(String imagePath) {
        this.images.add(imagePath);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
