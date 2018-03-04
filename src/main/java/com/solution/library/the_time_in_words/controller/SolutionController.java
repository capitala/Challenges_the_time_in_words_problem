package com.solution.library.the_time_in_words.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solution.library.the_time_in_words.service.SolutionService;

@RestController
public class SolutionController {
@Autowired
public SolutionService service;
@RequestMapping("/convertTimeToString/{time}")
public String convertTimeToString(@PathVariable String time) {
     return service.getTimeString(time);
}

}
