package com.example.Examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Examen.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
