package com.ulearning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.IPaymentDao;
import com.ulearning.model.Payment;
import com.ulearning.service.IPaymentService;

@Service("paymentService")
@Transactional
public class PaymentServiceImpl implements IPaymentService{

	@Autowired
	private IPaymentDao paymentDao;

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

	public IPaymentDao getPaymentDao() {
		return paymentDao;
	}

	public void setPaymentDao(IPaymentDao paymentDao) {
		this.paymentDao = paymentDao;
	}	
}
