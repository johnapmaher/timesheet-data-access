package com.jmaher.timesheetdataaccess.repository;

import com.jmaher.timesheetdataaccess.model.TimesheetEntry;
import org.springframework.data.repository.CrudRepository;

public interface TimesheetEntryRepository extends CrudRepository <TimesheetEntry, Long> {
}
