package com.backbase.atmfinder.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.backbase.atmfinder.model.ATMLocation;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service("atmFinderService")
public class ATMFinderService {

	private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	
	@Value("${atmlocator.url}")
	private String atmLocatorURL;
	
    @Autowired
    private RestTemplate restTemplate;
    
	/**
	 * Creates the instance of RestTemplate object
	 * 
	 * @param builder default spring object
	 * @return instance of RestTemplate object
	 */
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.requestFactory(new HttpComponentsClientHttpRequestFactory())
				.setReadTimeout(10000)
				.build();
	}


	public List<ATMLocation> getAllATMLocations() throws IOException {
		return getATMLocations();
	}
    
	public List<String> getAllCities() throws IOException {
		return getATMLocations().stream().map(
											atm->atm.getAddress().getCity()).collect(Collectors.toList());
	}

	public List<ATMLocation> getAllATMLocationsForCity(String city) throws IOException {
		
		List<ATMLocation> allATMlocations = getATMLocations();
		logger.debug("getATMLocations successful");
		allATMlocations = allATMlocations
				.stream()
				.filter(atmLocation -> atmLocation.getAddress().getCity().equalsIgnoreCase(city))
				.collect(Collectors.toList());
		return allATMlocations;
	}

	private List<ATMLocation> getATMLocations() throws IOException {
        String response = restTemplate.getForObject(atmLocatorURL, String.class);
        String atmLocationsString = response.substring(6, response.length()); // remove unwanted characters in the response
		logger.debug("removed garbage characters in response");
        ObjectMapper objectMapper = new ObjectMapper();
        ATMLocation[] atmLocations = objectMapper.readValue(atmLocationsString, ATMLocation[].class);
        List<ATMLocation> atmlocations = Arrays.asList(atmLocations);
		atmlocations.sort((a1,a2)-> a1.getAddress().getCity().compareTo(a2.getAddress().getCity()));
        return atmlocations;
	}

}
