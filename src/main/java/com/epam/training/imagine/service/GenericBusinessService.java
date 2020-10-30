package com.epam.training.imagine.service;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
public interface GenericBusinessService<T, ID> {

    Iterable<T> findAll();

    T save(@NotNull @Valid T t);

    void remove(@NotNull T t);

    T findById(@NotNull ID id);
}
