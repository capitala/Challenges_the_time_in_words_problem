package com.solution.library.the_time_in_words.integrationTests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.solution.library.the_time_in_words.App;

@RunWith(SpringRunner.class)
@SpringBootTest(
  webEnvironment = WebEnvironment.RANDOM_PORT,
  classes = App.class)
@AutoConfigureMockMvc
public class SolutionControllerIntegrationTests {
@Autowired
MockMvc mockMvc;
@Test
public void convertTimeToStringTest() throws Exception {
mockMvc.perform(get("/convertTimeToString/5:01"))
	       .andExpect(status().isOk())
	       .andExpect(content().string("one minute past five"));
}
}
