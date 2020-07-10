package com.cities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectedCitiesController {
	
	@Autowired
	CitiesDAO citiesdao;
	
	@GetMapping("/connected")
	public Message isConnected(@RequestParam String origin, @RequestParam String destination)
	{
		Message message= new Message();
		int resultCount = citiesdao.isConnected(origin, destination);
		message.setResult(resultCount>0?"yes":"no");
		return message;
		
	}

}

