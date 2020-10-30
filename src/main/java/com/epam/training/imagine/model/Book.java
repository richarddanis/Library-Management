package com.epam.training.imagine.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Book implements BusinessEntity<Long>, Serializable {

    private Long id;
    private String title;
    private Integer amount;

    @Override
    public Long getId() {
        return id;
    }
}
