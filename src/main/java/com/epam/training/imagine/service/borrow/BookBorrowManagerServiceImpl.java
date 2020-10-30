package com.epam.training.imagine.service.borrow;

import com.epam.training.imagine.model.Borrow;
import com.epam.training.imagine.service.AbstractGenericBusinessEntityServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BookBorrowManagerServiceImpl extends AbstractGenericBusinessEntityServiceImpl<Borrow, Long> implements BookBorrowService {
    public BookBorrowManagerServiceImpl(JpaRepository<Borrow, Long> borrowRepository) {
        super(borrowRepository);
    }
}
