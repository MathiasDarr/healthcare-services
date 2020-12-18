package org.mddarr.relational_appointment_service.repositories;

import org.mddarr.relational_appointment_service.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, String> {
}
