package com.epam.training.imagine.service.subscription;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.epam.training.imagine.model.Subscription;
import com.epam.training.imagine.model.User;
import com.epam.training.imagine.service.AbstractGenericBusinessEntityServiceImpl;

@Service
public class SubscriptionServiceImpl extends AbstractGenericBusinessEntityServiceImpl<Subscription, Long> implements SubscriptionService {
	
	public SubscriptionServiceImpl(JpaRepository<Subscription, Long> subscriptionRepository) {
        super(subscriptionRepository);
    }
	
	@Override
	public void subscribe(Long bookId, User user) {
		
	}
}
