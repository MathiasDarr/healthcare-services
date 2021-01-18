package org.mddarr.provider_service.models;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="providers")
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