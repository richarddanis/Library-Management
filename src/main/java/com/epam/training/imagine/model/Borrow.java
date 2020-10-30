package com.epam.training.imagine.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Borrow implements BusinessEntity<Long> {

    @Id
    @GeneratedValue
    @Column(unique = true, name = "ID")
    private Long id;
    private Date startDate;
    private Date endDate;
    private Book book;

    public Borrow() {
    }

    @Override
    public Long getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Book getBook() {
        return book;
    }
}
