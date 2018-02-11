package com.jmaher.timesheetdataaccess.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String name;

    @OneToOne(mappedBy = "day")
    private TimesheetEntry timesheetEntry;
}
