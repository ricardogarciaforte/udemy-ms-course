package mx.com.udemy.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.udemy.hrworker.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
