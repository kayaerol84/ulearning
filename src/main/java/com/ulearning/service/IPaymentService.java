package com.ulearning.service;

import java.util.List;

import com.ulearning.model.Payment;

public interface IPaymentService {

	void addPayment();
	Payment getPayment(Long id);
	List<Payment> getPaymentsByUser(Long userId);
	List<Payment> getPaymentsByLearningSession(Long sessionId);
}
