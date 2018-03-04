package com.solution.library.the_time_in_words.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.solution.library.the_time_in_words.service.SolutionService;
@RunWith(SpringRunner.class)
@WebMvcTest(SolutionController.class)
public class SolutionControllerTest {
@Autowired
MockMvc mockMvc;
@MockBean
private SolutionService service;
@Test
public void convertTimeToStringTest() throws Exception {
	Mockito.when(service.getTimeString("5:01")).thenReturn("one minute past five");
	mockMvc.perform(get("/convertTimeToString/5:01"))
	       .andExpect(status().isOk())
	       .andExpect(content().string("one minute past five"));
}
}
