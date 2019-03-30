package io.j4c.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.j4c.dao.RegistrationDao;
import io.j4c.entity.Request;

@Service
public class RegistrationService {
	
	@Autowired
	RegistrationDao registrationDao;
	
	public String registerUser(Request registerRequest) {
		System.out.println("Register");
		registerRequest.setId(UUID.randomUUID().toString());
		registrationDao.save(registerRequest);
		return "Saves";
	}
	
	public Request getUserDetails(String pan){
		return registrationDao.getUserDetails(pan);
		
	}
	
	public String getStatus(String pan){
		return registrationDao.getStatus(pan);
		
	}
	
	public void updateSTatus(String pan) {
		registrationDao.modifyDetails("processed", pan);
	}
}
