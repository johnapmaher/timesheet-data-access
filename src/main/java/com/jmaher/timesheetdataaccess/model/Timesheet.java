package com.jmaher.timesheetdataaccess.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
public class Timesheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @NotNull
    private Boolean submitted = false;

    @OneToMany(mappedBy = "timesheet")
    private List<TimesheetEntry> timesheetEntries;
}
