package com.project.ems;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TraineeRepository extends JpaRepository<Trainee, Integer> {
}
