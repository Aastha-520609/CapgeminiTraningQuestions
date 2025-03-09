package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.CourseNotFoundException;
import com.model.Course;
import com.service.CourseService;

@RestController
@RequestMapping("/cms")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/find/{courseId}")
	public ResponseEntity<Course> findCourse(@PathVariable Integer courseId) throws CourseNotFoundException {
	
        Course course = courseService.searchCourse(courseId);
        if(course == null) {
        	throw new CourseNotFoundException("No such course id");
        }
	    return new ResponseEntity<>(course, HttpStatus.OK);
	}
}