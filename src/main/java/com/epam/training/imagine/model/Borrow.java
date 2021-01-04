package com.epam.training.imagine.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Borrow implements BusinessEntity<Long> {

    @Id
    @GeneratedValue
    @Column(unique = true, name = "ID")
    private Long id;

    @Column(name = "START_DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;

    @Column(name = "END_DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
    
    @OneToOne
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
    
    public User getUser() {
        return user;
    }
}
