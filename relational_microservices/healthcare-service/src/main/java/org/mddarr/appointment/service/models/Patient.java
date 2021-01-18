package org.mddarr.appointment.service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="patients", schema = "providers")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {

    @Id
    private String patientid;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private Integer age;

}
