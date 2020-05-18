package priya.springapp.brewery.web_controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import priya.springapp.brewery.web_Service.BeerService;
import priya.springapp.brewery.web_model.BeerDTO;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
	private final BeerService beerService;
	
	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}

	@GetMapping({"/{beerId}"})
	public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId) {
		
		return new ResponseEntity<>(beerService.getBeerById(beerId),HttpStatus.OK) ;
		
	}
	
	
}
