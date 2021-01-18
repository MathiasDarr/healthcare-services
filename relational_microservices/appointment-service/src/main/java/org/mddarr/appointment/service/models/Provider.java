package org.mddarr.appointment.service.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="providers", schema = "providers")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Provider {
    @Id
    private String providerid;

    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String title;
    @Column
    private String department;

}