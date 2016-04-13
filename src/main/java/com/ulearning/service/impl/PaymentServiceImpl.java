package com.ulearning.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulearning.dao.IPaymentDao;
import com.ulearning.service.IPaymentService;

@Service
@Transactional
public class PaymentServiceImpl implements IPaymentService{

	@Autowired
	private IPaymentDao paymentDao;

	@Override
	public void addPayment() {
		// TODO Auto-generated method stub
		
	}
	
	
}
