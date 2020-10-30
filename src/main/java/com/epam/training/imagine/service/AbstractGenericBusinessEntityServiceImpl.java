package com.epam.training.imagine.service;

import com.epam.training.imagine.model.BusinessEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public abstract class AbstractGenericBusinessEntityServiceImpl<T extends BusinessEntity<ID>, ID extends Serializable>
        implements GenericBusinessService<T, ID> {

    private final JpaRepository<T, ID> repository;

    protected AbstractGenericBusinessEntityServiceImpl(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T findById(@NotNull ID id) {
        return repository.findById(id).orElseThrow(NullPointerException::new);  //TODO: Custom expection class
    }

    @Override
    public Iterable<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T save(@NotNull @Valid T t) {
        return repository.save(t);
    }

    @Override
    public void remove(@NotNull T t) {
        repository.delete(t);
    }
}
