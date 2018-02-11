package com.jmaher.timesheetdataaccess.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.List;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String nNumber;

    @NotNull
    private String email;

    @NotNull
    private Boolean admin = false;

    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd")
    private java.sql.Timestamp createdOn;

    @JsonFormat(pattern="yyyy-MM-dd")
    private java.sql.Timestamp lastLogin;

    @OneToMany(mappedBy = "employee")
    private List<Timesheet> timesheets;
}
