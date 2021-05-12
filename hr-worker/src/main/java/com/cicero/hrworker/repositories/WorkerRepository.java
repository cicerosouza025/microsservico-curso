package com.cicero.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cicero.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}