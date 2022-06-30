package com.codeclan.bookingservices.repositories;

import com.codeclan.bookingservices.models.Course;
import com.codeclan.bookingservices.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository <Course, Long> {

    List<Course> findByRating(Double rating);
    List<Course> findByName(String name);
}
