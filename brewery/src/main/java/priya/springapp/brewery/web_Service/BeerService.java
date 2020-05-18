package priya.springapp.brewery.web_Service;

import java.util.UUID;

import priya.springapp.brewery.web_model.BeerDTO;

public interface BeerService {

	BeerDTO getBeerById(UUID beerId);

}
