package com.codeclan.bookingservices.repositories;

import com.codeclan.bookingservices.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository <Course, Long> {


}
