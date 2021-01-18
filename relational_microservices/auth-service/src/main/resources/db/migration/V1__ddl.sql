CREATE SCHEMA IF NOT EXISTS providers;
CREATE TABLE IF NOT EXISTS providers.users(
    userid VARCHAR(50) PRIMARY KEY,
    first_name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    email VARCHAR NOT NULL,
    password VARCHAR NOT NULL,
    update_ts timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS providers.providers(
    providerid VARCHAR(50) PRIMARY KEY,
    first_name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    title VARCHAR NOT NULL,
    department VARCHAR NOT NULL
);

