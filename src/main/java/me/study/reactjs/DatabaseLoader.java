package me.study.reactjs;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author : jaehyun
 * <p>
 * Date: 2019-09-03
 * Copyright(©) 2019 by jaehyun.
 */
@Component
@AllArgsConstructor
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }
}
