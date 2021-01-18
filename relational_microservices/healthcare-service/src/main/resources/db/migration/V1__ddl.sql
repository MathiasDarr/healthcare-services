CREATE SCHEMA IF NOT EXISTS providers;

CREATE TABLE IF NOT EXISTS providers.providers(
    providerid VARCHAR(50) PRIMARY KEY,
    first_name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    title VARCHAR NOT NULL,
    department VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS providers.patients(
    patientid VARCHAR(50) PRIMARY KEY,
    first_name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    age INTEGER
);

CREATE TABLE IF NOT EXISTS providers.appointments(
    appointmentid VARCHAR(50) PRIMARY KEY,
    providerid VARCHAR(50) REFERENCES providers.providers(providerid),
    patientid VARCHAR(50) REFERENCES providers.patients(patientid),
    appointment_time timestamp,
    appointment_length int
);

