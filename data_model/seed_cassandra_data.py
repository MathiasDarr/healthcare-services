"""
This script populates an Apache Cassandra database with the data needed for the application.


built in indices are best for tables having many rows that contain the indexed value.  More unique values that exist in a particular column, the more over head you will have on average to query and maintain the index

DO NOT USE AN INDEX
 - high cardinality columns for a query of a huge volume of records for a small number of results
 - tables that youse a counter column
 - frequntly updated or deleted column

High cardinality column w/ many distinct values, a query will incur many seeks for very few results




"""
# !/usr/bin/env python3
import csv
from utilities.cassandra_utilities import createCassandraConnection, createKeySpace


def populate_patients_table():
    create_patients_department_table = """CREATE TABLE IF NOT EXISTS patients(
        patient_id text, 
        first_name text,
        last_name text,
        PRIMARY KEY(patient_id)
    );"""
    dbsession.execute(create_patients_department_table)

    insert_patient = """INSERT INTO patients(patient_id, first_name,last_name) VALUES(%s,%s,%s);"""
    PROVIDERS_CSV_FILE = 'data/patients/patients.csv'
    with open(PROVIDERS_CSV_FILE, newline='') as csvfile:
        reader = csv.DictReader(csvfile)
        for row in reader:
            dbsession.execute(insert_patient, [row['patient_id'], row['first_name'], row['last_name']])


def populate_providers_table():
    create_provider_department_table = """Create table IF NOT EXISTS provider_department(
        provider_id text, 
        provider_first_name text,
        provider_last_name text,
        title text,
        department_name text,
        PRIMARY KEY(department_name, provider_id)
    );"""

    dbsession.execute(create_provider_department_table)

    insert_provider_department = """INSERT INTO provider_department(provider_id, provider_first_name,provider_last_name, title, department_name) VALUES(%s,%s,%s, %s, %s);"""

    dbsession.execute(create_provider_department_table)
    PROVIDERS_CSV_FILE = 'data/providers/providers.csv'
    with open(PROVIDERS_CSV_FILE, newline='') as csvfile:
        reader = csv.DictReader(csvfile)
        for row in reader:
            dbsession.execute(insert_provider_department, [row['provider_id'], row['first_name'], row['last_name'], row['title'], "Neurology"])


def populate_appointments_table():
    create_patient_appointments_table = """CREATE TABLE IF NOT EXISTS patients_appointments (
        patient_id text,
        appointment_time timestamp,
        provider_id text,
        length int,
        PRIMARY KEY(patient_id,appointment_time)
    ); """

    dbsession.execute(create_patient_appointments_table)

    insert_patients_appointment_query = "INSERT INTO patients_appointments(patient_id, appointment_time, provider_id, length) VALUES(%s, %s, %s, %s);"

    PROVIDERS_CSV_FILE = 'data/appointments/patient_appointments.csv'
    with open(PROVIDERS_CSV_FILE, newline='') as csvfile:
        reader = csv.DictReader(csvfile)
        for row in reader:
            print(row['appointment_time'])
            dbsession.execute(insert_patients_appointment_query,
                              [row['patient_id'], row['appointment_time'], row['provider_id'], int(row['length'])])


if __name__ =='__main__':
    dbsession = createCassandraConnection()
    createKeySpace("ks1", dbsession)
    try:
        dbsession.set_keyspace('ks1')
    except Exception as e:
        print(e)

    # populate_patients_table()
    # populate_providers_table()
    populate_appointments_table()