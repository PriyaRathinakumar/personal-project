package priya.springapp.brewery.web_Service;

import java.util.UUID;

import priya.springapp.brewery.web_model.CustomerDTO;

public interface CustomerService {

	CustomerDTO getCustomerId(UUID id);

}
