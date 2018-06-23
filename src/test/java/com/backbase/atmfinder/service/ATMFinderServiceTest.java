package com.backbase.atmfinder.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.backbase.atmfinder.AtmFinderApplication;
import com.backbase.atmfinder.model.ATMLocation;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AtmFinderApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ATMFinderServiceTest {

	@Autowired
	ATMFinderService atmFinderService;
	
	@Test
	public void getAllATMLocations() {
		List<ATMLocation> atmLocations = null;
		try {
			atmLocations = atmFinderService.getAllATMLocations();
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertNotNull(atmLocations);
	}
	
	@Test
	public void getAllATMLocationsForCity() {
		List<ATMLocation> atmLocations = null;
		try {
			atmLocations = atmFinderService.getAllATMLocationsForCity("Amersfoort");
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertNotNull(atmLocations);
		assertTrue(atmLocations.size() > 0);
	}
}
