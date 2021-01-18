package org.mddarr.appointment.service.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="appointments")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Appointment {

    @Id
    private String appointment_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patientid", referencedColumnName = "patientid")
    private Patient patient;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "providerid", referencedColumnName = "providerid")
    private Provider provider;

    @Column
    private Date appointment_time;

}