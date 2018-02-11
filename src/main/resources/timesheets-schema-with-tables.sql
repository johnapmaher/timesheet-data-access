CREATE SCHEMA timesheets

CREATE TABLE timesheets.employee (
  id serial PRIMARY KEY,
  n_number CHAR(8) UNIQUE NOT NULL,
  email VARCHAR(64) UNIQUE NOT NULL,
  admin BOOLEAN NOT NULL,
  created_on TIMESTAMP NOT NULL,
  last_login TIMESTAMP
);

CREATE TABLE timesheets.activity (
  id SERIAL PRIMARY KEY,
  activity_description VARCHAR(64) NOT NULL
);

CREATE TABLE timesheets.timesheet (
  id SERIAL PRIMARY KEY,
  employee_id INT REFERENCES timesheets.employee (id),
  submitted BOOLEAN NOT NULL
);

CREATE TABLE timesheets.day(
  id SERIAL PRIMARY KEY,
  name VARCHAR(9) UNIQUE NOT NULL
);

CREATE TABLE timesheets.timesheet_entry (
  id SERIAL PRIMARY KEY,
  timesheet_id INT REFERENCES timesheets.timesheet (id),
  day_id INT REFERENCES timesheets.day (id),
  activity_id INT REFERENCES timesheets.activity (id),
  hours INT NOT NULL
);

INSERT INTO timesheets.activity(activity_description) VALUES
  ('Regular working hours'),
  ('Flexible time off'),
  ('Sick leave');

INSERT INTO timesheets.day(name) VALUES
  ('Monday'),
  ('Tuesday'),
  ('Wednesday'),
  ('Thursday'),
  ('Friday')