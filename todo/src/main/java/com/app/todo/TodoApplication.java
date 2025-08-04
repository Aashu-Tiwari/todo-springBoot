package com.app.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.todo.service.TaskService;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(TaskService taskService) {
		return args -> {
			// Add some sample tasks if the database is empty
			if (taskService.getAllTasks().isEmpty()) {
				taskService.createTask("Learn Spring Boot");

				taskService.createTask("Build a Todo App");

				taskService.createTask("Deploy to production");

				System.out.println("Sample tasks initialized!");
			}
		};
	}
}
