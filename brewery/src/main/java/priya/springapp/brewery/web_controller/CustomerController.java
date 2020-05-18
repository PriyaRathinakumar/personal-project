package priya.springapp.brewery.web_controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import priya.springapp.brewery.web_Service.CustomerService;
import priya.springapp.brewery.web_model.CustomerDTO;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

	private final CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping({"/{custId}"})
	public ResponseEntity<CustomerDTO> getCustomerId(@PathVariable("custId") UUID id) {
		
		return new ResponseEntity<CustomerDTO>(customerService.getCustomerId(id), HttpStatus.OK);	
	}
	
	
}
