### Relational Microservices ###

In this directory I implement the patient/provider scheduling microservices using a relational data model, postgres and Spring JPA. 

# Healthcare Service #
* CRUD application for posting new patients & providers

# Apointment Service #
* Exposes REST endpoints for scheduling appoinemtns
* Makes use of transactions to prevent double booking 
