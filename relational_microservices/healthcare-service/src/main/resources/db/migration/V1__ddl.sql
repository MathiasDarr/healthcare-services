CREATE SCHEMA IF NOT EXISTS providers;

CREATE TABLE IF NOT EXISTS providers.providers(
    providerid VARCHAR(50) PRIMARY KEY,
    first_name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    title VARCHAR NOT NULL,
    department VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS providers.patients(
    patient_id VARCHAR(50) PRIMARY KEY,
    first_name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    age INTEGER
);


