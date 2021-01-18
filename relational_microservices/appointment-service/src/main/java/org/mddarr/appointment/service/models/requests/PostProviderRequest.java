package org.mddarr.appointment.service.models.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostProviderRequest {

    private String first_name;
    private String last_name;
    private String department;
    private String title;

}
