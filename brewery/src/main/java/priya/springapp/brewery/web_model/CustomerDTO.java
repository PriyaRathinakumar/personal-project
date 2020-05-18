package priya.springapp.brewery.web_model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CustomerDTO {

	private UUID id;
	private String name;
	
}
