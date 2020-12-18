"""
This script populates a Postgres database with the data needed for the application.
"""
# !/usr/bin/env python3

import psycopg2
import csv

def populate_patients_table():
    create_patients_table = """
            CREATE TABLE patients (
                    patient_id VARCHAR(50) PRIMARY KEY,
                    first_name VARCHAR(30),
                    last_name VARCHAR(30),
                    age int
            );
    """
    cur.execute(create_patients_table)
    conn.commit()

    insert_into_patients_table = """INSERT INTO patients(patient_id, first_name, last_name, age) VALUES(%s,%s,%s, %s);"""
    PATIENTS_CSV_FILE = 'data/patients/patients.csv'
    with open(PATIENTS_CSV_FILE, newline='') as csvfile:
        reader = csv.DictReader(csvfile)

        for row in reader:
            cur.execute(insert_into_patients_table, [row['patient_id'], row['first_name'], row["last_name"], row['age']])
    conn.commit()

def populate_providers_table():
    create_providers_table = """
            CREATE TABLE providers (
                    provider_id VARCHAR(50) PRIMARY KEY,
                    first_name VARCHAR(30),
                    last_name VARCHAR(30),
                    title VARCHAR(30),
                    department VARCHAR(30)
            );
    """
    cur.execute(create_providers_table)
    conn.commit()

    insert_into_providers_table = """INSERT INTO providers(provider_id, first_name, last_name, title, department) VALUES(%s,%s,%s,%s,%s);"""
    PROVIDERS_CSV_FILE = 'data/providers/providers.csv'
    with open(PROVIDERS_CSV_FILE, newline='') as csvfile:
        reader = csv.DictReader(csvfile)
        for row in reader:
            cur.execute(insert_into_providers_table, [row['provider_id'], row['first_name'], row["last_name"], row['title'], row['department']])
    conn.commit()


if __name__ =='__main__':

    conn = psycopg2.connect(host="localhost", port="5432", user="postgres", password="postgres", database="postgresdb")
    cur = conn.cursor()

    populate_patients_table()
    populate_providers_table()