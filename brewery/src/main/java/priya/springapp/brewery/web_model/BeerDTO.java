package priya.springapp.brewery.web_model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {
	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long UPC;
}
