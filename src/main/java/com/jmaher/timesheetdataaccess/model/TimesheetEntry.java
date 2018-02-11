package com.jmaher.timesheetdataaccess.model;


import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class TimesheetEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "timesheet_id")
    private Timesheet timesheet;

    @OneToOne
    @JoinColumn(name="day_id")
    @RestResource(path = "timesheetEntryDay", rel = "day")
    private Day day;

    @OneToOne
    @JoinColumn(name="activity_id")
    @RestResource(path = "timesheetEntryActivity", rel = "activity")
    private Activity activity;

    @NotNull
    private long hours;
}
