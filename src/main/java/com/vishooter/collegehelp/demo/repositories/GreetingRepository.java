package com.vishooter.collegehelp.demo.repositories;

import com.vishooter.collegehelp.demo.models.Greeting;
import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends CrudRepository<Greeting, Long> {
}
