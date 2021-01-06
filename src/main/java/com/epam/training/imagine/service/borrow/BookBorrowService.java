package com.epam.training.imagine.service.borrow;

import com.epam.training.imagine.model.Borrow;
import com.epam.training.imagine.model.User;
import com.epam.training.imagine.service.AbstractGenericBusinessEntityServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BookBorrowService extends AbstractGenericBusinessEntityServiceImpl<Borrow, Long> {
	
    public BookBorrowService(JpaRepository<Borrow, Long> borrowRepository) {
        super(borrowRepository);
    }
    
    public void extend(Long borrowId, User user) {
    	
    }
}
