package mx.com.udemy.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.udemy.hrpayroll.entity.Payment;
import mx.com.udemy.hrpayroll.service.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResources {

	@Autowired
	private PaymentService service;
	
	@GetMapping(value = "/{workderId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workderId, @PathVariable Integer days) {
		
		Payment payment = this.service.getPayment(workderId, days);
		
		return ResponseEntity.ok(payment);
	}
}
