package com.jmaher.timesheetdataaccess.repository;

import com.jmaher.timesheetdataaccess.model.Activity;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<Activity, Long> {
}
