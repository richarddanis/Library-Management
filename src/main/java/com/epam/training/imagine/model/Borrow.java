package com.epam.training.imagine.model;

import java.util.Date;

public class Borrow implements BusinessEntity<Long> {

    private Long id;
    private Date startDate;
    private Date endDate;
    private Book book;

    @Override
    public Long getId() {
        return id;
    }
}
