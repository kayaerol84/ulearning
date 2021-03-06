package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.PaymentDao;
import com.ulearning.model.Payment;
import com.ulearning.service.PaymentService;

@Service("paymentService")
@Transactional
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentDao paymentDao;

	@Override
	public void addPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Payment getPayment(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getPaymentsByUser(Long userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getPaymentsByLearningSession(Long sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	public PaymentDao getPaymentDao() {
		return paymentDao;
	}

	public void setPaymentDao(PaymentDao paymentDao) {
		this.paymentDao = paymentDao;
	}	
}
