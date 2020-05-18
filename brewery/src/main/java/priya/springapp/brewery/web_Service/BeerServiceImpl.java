package priya.springapp.brewery.web_Service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import priya.springapp.brewery.web_model.BeerDTO;

@Service
public class BeerServiceImpl implements BeerService{

	@Override
	public BeerDTO getBeerById(UUID beerId) {
		// TODO Auto-generated method stub
		return BeerDTO.builder().id(UUID.randomUUID()).beerName("Galaxy").beerStyle("Pale Ale").build();
	}

}
