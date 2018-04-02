package com.vishooter.collegehelp.demo.repositories;

import com.vishooter.collegehelp.demo.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
