package me.study.reactjs;

import org.springframework.data.repository.CrudRepository;

/**
 * @author : jaehyun
 * <p>
 * Date: 2019-09-03
 * Copyright(©) 2019 by jaehyun.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}