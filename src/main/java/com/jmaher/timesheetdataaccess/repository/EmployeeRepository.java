package com.jmaher.timesheetdataaccess.repository;

import com.jmaher.timesheetdataaccess.model.Employee;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findByNNumber(String nNumber);

    List<Employee> findByAdmin(Boolean admin);
}
