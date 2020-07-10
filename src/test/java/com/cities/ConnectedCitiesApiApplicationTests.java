package com.cities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class ConnectedCitiesApiApplicationTests {
	
	@InjectMocks
	ConnectedCitiesController citiesController;
	
	@Mock
	CitiesDAO citiesdao;
	

	@Test
	void testIsCitiesConnected() {
		
		String origin = "Boston";
		String destination="Albany";
		
		Message result = citiesController.isConnected(origin, destination);		
		assertThat(result.getResult()).isEqualTo("no");
		
		
	}

}
