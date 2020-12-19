package org.mddarr.appointment_service.repositories;

import org.mddarr.appointment_service.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, String> {

    @Query(value = "SELECT * FROM appointments WHERE patient_id = ':patient_id'", nativeQuery = true)
    List<Appointment> getAppointmentsByPatient(String patient_id);

    @Query(value = "SELECT * FROM appointments WHERE provider_id = ':provider_id'", nativeQuery = true)
    List<Appointment> getAppointmentsByProvider(String provider_id);

}
