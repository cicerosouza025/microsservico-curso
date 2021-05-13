package com.cicero.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.cicero.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Caio", 200.0, days);
	}
}
