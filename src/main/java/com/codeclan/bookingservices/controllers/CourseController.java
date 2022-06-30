package com.codeclan.bookingservices.controllers;

import com.codeclan.bookingservices.models.Course;
import com.codeclan.bookingservices.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity getAllCoursesAndFilters(
            @RequestParam(required = false, name = "rating") Double rating,
            @RequestParam(required = false, name = "customerName") String customerName
    ){

        // if we have the rating double then do the rating query
        if (rating != null){
            List<Course> foundCourses=courseRepository.findByRating(rating);
            return new ResponseEntity(foundCourses, HttpStatus.OK);
        }

        if (customerName != null){
            List<Course> foundCourses = courseRepository.findByName(customerName);
            return new ResponseEntity(foundCourses, HttpStatus.OK);
        }

        // default: we have none of the query strings GET /whiskies
        return new ResponseEntity(courseRepository.findAll(), HttpStatus.OK);
    }
}
