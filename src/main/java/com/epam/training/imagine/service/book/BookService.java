package com.epam.training.imagine.service.book;

import com.epam.training.imagine.model.Book;
import com.epam.training.imagine.service.AbstractGenericBusinessEntityServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService extends AbstractGenericBusinessEntityServiceImpl<Book, Long> {
    protected BookService(JpaRepository<Book, Long> bookRepository) {
        super(bookRepository);
    }
}
