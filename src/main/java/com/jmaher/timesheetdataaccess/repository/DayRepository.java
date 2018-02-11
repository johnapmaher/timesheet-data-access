package com.jmaher.timesheetdataaccess.repository;

import com.jmaher.timesheetdataaccess.model.Day;
import org.springframework.data.repository.CrudRepository;

public interface DayRepository extends CrudRepository <Day, Long> {
}
