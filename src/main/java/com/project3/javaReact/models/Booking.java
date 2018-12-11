package com.project3.javaReact.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bookings")
public class Booking {

    @Cascade(CascadeType.DELETE)
    @OneToMany(mappedBy = "booking", fetch = FetchType.LAZY)
    private Property property;

    @Cascade(CascadeType.DELETE)
    @OneToMany(mappedBy = "booking", fetch = FetchType.LAZY)
    private User user;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    public Booking(Property property, User user, Date startDate, Date endDate) {
        this.property = property;
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Booking() {
    }

    public long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(long propertyId) {
        this.propertyId = propertyId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
