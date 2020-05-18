package priya.springapp.brewery.web_Service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import priya.springapp.brewery.web_model.CustomerDTO;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public CustomerDTO getCustomerId(UUID id) {
		return CustomerDTO.builder().id(UUID.randomUUID()).name("George").build();
	}

}
