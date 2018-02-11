package com.jmaher.timesheetdataaccess.repository;

import com.jmaher.timesheetdataaccess.model.Timesheet;
import org.springframework.data.repository.CrudRepository;

public interface TimesheetRepository extends CrudRepository <Timesheet, Long> {
}
