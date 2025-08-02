
package com.app.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.todo.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Additional query methods can be defined here
}
