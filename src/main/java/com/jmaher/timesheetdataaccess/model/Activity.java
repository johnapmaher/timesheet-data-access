package com.jmaher.timesheetdataaccess.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String activityDescription;

    @OneToOne(mappedBy = "activity")
    private TimesheetEntry timesheetEntry;
}
