package com.solution.library.the_time_in_words.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionServiceTest {
	
	public SolutionService service=new SolutionService();
    @Test
	public void getTimeStringTestQuarterPastTToime() {
    	assertEquals(service.getTimeString("1:15"),"quarter past one");
    }
    @Test
   	public void getTimeStringTestQuarterTime() {
    	assertEquals(service.getTimeString("1:45"),"quarter to two");
       }
    @Test
	public void getTimeStringTestHalfPastTime() {
    	assertEquals(service.getTimeString("1:30"),"half past one");	
    }
    @Test
	public void getTimeStringTestPastTime() {
    	assertEquals(service.getTimeString("1:14"),"fourteen minutes past one");
    }
    @Test
	public void getTimeStringTestToTime() {
    	assertEquals(service.getTimeString("1:44"),"sixteen minutes to two");
    }
    @Test
	public void getTimeStringTestExactTime() {
    	assertEquals(service.getTimeString("2:00"),"two o' clock");
    }
    
}
