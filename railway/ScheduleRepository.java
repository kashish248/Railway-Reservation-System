package com.example.demo.RepositorySchedule;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.EntitySchedule.schedule;

@Repository
public interface ScheduleRepository extends CrudRepository<schedule, Integer>{

}
