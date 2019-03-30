package io.j4c.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.j4c.entity.Request;
import io.j4c.entity.Response;
import io.j4c.model.CustomerDO;
import io.j4c.service.RegistrationService;

@RestController
public class CreditController {
	@Autowired
	RegistrationService registrationService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final int SCORE_MAX = 800;
	private static final int SCORE_MIN = 550;
//FIXED context path - functional test 
	@RequestMapping(value = "/creditscore", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<CustomerDO> creditScore(@RequestBody CustomerDO customer) {

		int score = Math.abs(customer.getFirstName().hashCode() + customer.getLastName().hashCode()
				+ customer.getBirthDate().hashCode() + customer.getPan().hashCode());

		logger.info(customer.toString() + " hashcode: " + score);

		score = score % SCORE_MAX;

		while (score < SCORE_MIN) {
			score = score + 100;
		}		
		customer.setScore(score);

		Request userData = registrationService.getUserDetails(customer.getPan());
		registrationService.updateSTatus(customer.getPan());
		
		
		ResponseEntity<CustomerDO> response = new ResponseEntity<CustomerDO>(customer, HttpStatus.OK);
		
		return response;
	}
	
	@RequestMapping(value = "/status", method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response registration(@RequestBody CustomerDO customer) {
		Response response = new Response();
		response.setStatus(registrationService.getStatus(customer.getPan()) );
		return response;
	}	
	
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response registration(@RequestBody Request requestEntity) {
		System.out.println("test");
		io.j4c.entity.Response entity = new io.j4c.entity.Response();
		registrationService.registerUser(requestEntity);
		entity.setMessage("Success");
		return entity;

	}

}
