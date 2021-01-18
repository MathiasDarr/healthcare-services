INSERT INTO providers.providers(providerid, first_name, last_name, title, department) VALUES('provider1','Charles','Dickens','Doctor','Neurology');
INSERT INTO providers.providers(providerid, first_name, last_name, title, department) VALUES('provider2','Erik','Williams','Doctor','Rheumatology');

INSERT INTO providers.patients(patientid, first_name, last_name, age) VALUES('patient1','Donald','Jones',40);

INSERT INTO providers.appointments(appointmentid, providerid, patientid,appointment_time, appointment_length) VALUES('appointment1','provider1','patient1','2015-01-10 00:51:14',60);
