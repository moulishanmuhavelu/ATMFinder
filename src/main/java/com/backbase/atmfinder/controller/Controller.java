package com.backbase.atmfinder.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backbase.atmfinder.exception.ATMFinderException;
import com.backbase.atmfinder.model.ATMLocation;
import com.backbase.atmfinder.service.ATMFinderService;

@RestController
@RequestMapping("/atmfinder")
public class Controller {

	private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	@Autowired
	private ATMFinderService atmFinderService;
	
	@GetMapping("/atmLocations")
	@ResponseBody
	public List<ATMLocation> getAllATMLocations() throws ATMFinderException {
		List<ATMLocation> atmLocations = null;
		
		try {
			atmLocations = atmFinderService.getAllATMLocations();
		} catch (IOException e) {
			logger.error(e.getMessage(),e);
			throw new ATMFinderException(e.getMessage(), e);
		}
		return atmLocations;
	}

	@GetMapping("/cities")
	@ResponseBody
	public List<String> getAllCities() throws ATMFinderException {
		List<String> cities = null;
		
		try {
			cities = atmFinderService.getAllCities();
		} catch (IOException e) {
			logger.error(e.getMessage(),e);
			throw new ATMFinderException(e.getMessage(), e);
		}
		return cities;
	}

	@GetMapping("/atmLocations/{city}")
	@ResponseBody
	public List<ATMLocation> getATMLocationsForCity(@PathVariable("city") String city) throws ATMFinderException {
		List<ATMLocation> atmLocations = null;
		
		try {
			atmLocations = atmFinderService.getAllATMLocationsForCity(city);
		} catch (IOException e) {
			logger.error(e.getMessage(),e);
			throw new ATMFinderException(e.getMessage(), e);
		}
		return atmLocations;
	}

}
