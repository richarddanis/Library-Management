package com.epam.training.imagine.service.subscription;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.epam.training.imagine.model.Subscription;
import com.epam.training.imagine.model.User;
import com.epam.training.imagine.service.AbstractGenericBusinessEntityServiceImpl;

@Service
public class SubscriptionService extends AbstractGenericBusinessEntityServiceImpl<Subscription, Long> {
	
	public SubscriptionService(JpaRepository<Subscription, Long> subscriptionRepository) {
        super(subscriptionRepository);
    }
	
	public void subscribe(Long bookId, User user) {
		
	}
}
