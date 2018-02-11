CREATE SCHEMA timesheets

CREATE TABLE timesheets.employees (
  employee_id serial PRIMARY KEY,
  n_number CHAR(8) UNIQUE NOT NULL,
  email VARCHAR(64) UNIQUE NOT NULL,
  admin BOOLEAN NOT NULL,
  created_on TIMESTAMP NOT NULL,
  last_login TIMESTAMP
);

CREATE TABLE timesheets.activities (
  activity_id SERIAL PRIMARY KEY,
  activity_code INTEGER NOT NULL,
  activity_description VARCHAR(64) NOT NULL
);

CREATE TABLE timesheets.timesheets (
  timesheet_id SERIAL PRIMARY KEY,
  employee_id INT REFERENCES timesheets.employees (employee_id),
  submitted BOOLEAN NOT NULL
);

CREATE TABLE timesheets.days(
  day_id SERIAL PRIMARY KEY,
  day_name VARCHAR(8) UNIQUE NOT NULL
);

CREATE TABLE timesheets.timesheet_entries (
  timesheet_entry_id SERIAL PRIMARY KEY,
  timesheet_id INT REFERENCES timesheets.timesheets (timesheet_id),
  day_id INT REFERENCES timesheets.days (day_id),
  activity_id INT REFERENCES timesheets.activities (activity_id),
  hours INT NOT NULL
)