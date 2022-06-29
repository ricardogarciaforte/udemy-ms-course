package mx.com.udemy.hrpayroll.service;

import org.springframework.stereotype.Service;

import mx.com.udemy.hrpayroll.entity.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Rick", 200.0, days);
	}
}
