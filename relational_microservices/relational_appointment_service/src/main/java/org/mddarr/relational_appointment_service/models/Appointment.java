package org.mddarr.relational_appointment_service.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="patients")
public class Appointment {


    @Id
    private String appointmentt_id;

    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private Integer age;

    public Appointment() {

    }
}