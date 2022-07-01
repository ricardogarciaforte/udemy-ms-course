package mx.com.udemy.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.udemy.hroauth.entities.User;
import mx.com.udemy.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {

	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEail(String email) {
		
		User user = this.userFeignClient.findByEmail(email).getBody();
		if(null == user) {
			logger.error("Email not found " + email);
			throw new IllegalArgumentException("Email not found");
		}
		logger.error("Email found " + email);
		
		return user;
	}
}
