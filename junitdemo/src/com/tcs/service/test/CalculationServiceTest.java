package com.tcs.service.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.tcs.service.CalculationService;

class CalculationServiceTest {

	CalculationService calculationService = new CalculationService();
	
	@Test
	public void addTest()
	{
		assertEquals(5, calculationService.add(3, 2));
	}
	
	@Test
	public void eligiblityTest()
	{
		assertTrue(calculationService.checkEligiblity(34));
	}
	

}
