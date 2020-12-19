package org.mddarr.appointment_service.services;


import org.mddarr.appointment_service.models.Appointment;
import org.mddarr.appointment_service.models.Patient;

import org.mddarr.appointment_service.models.Provider;
import org.mddarr.appointment_service.models.reqests.AppointmentRequest;
import org.mddarr.appointment_service.repositories.AppointmentRepository;
import org.mddarr.appointment_service.repositories.PatientRepository;
import org.mddarr.appointment_service.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AppointmentsService implements AppointmentServiceInterface {
    @Autowired
    AppointmentRepository appointmentsRepository;
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    ProviderRepository providerRepository;


//    public AppointmentsService(AppointmentRepository appointmentsRepository, PatientRepository patientRepository, ProviderRepository providerRepository){
//        this.appointmentsRepository = appointmentsRepository;
//        this.patientRepository = patientRepository;
//        this.providerRepository = providerRepository;
//    }

    @Override
    public List<Appointment> getAppointments() {
        return appointmentsRepository.findAll();
    }

    @Override
    public List<Appointment> getPatientAppointments(String patient_id) {
        return appointmentsRepository.getAppointmentsByPatient(patient_id);
    }

    @Override
    public List<Appointment> getProviderAppointments(String provider_id) {
        return appointmentsRepository.getAppointmentsByProvider(provider_id);
    }

    @Override
    public String postAppointment(AppointmentRequest appointmentRequest, String patient_id) {
        Optional<Patient> patient_result = patientRepository.findById(patient_id);
        Optional<Provider> provider_result = providerRepository.findById(appointmentRequest.getProvider_id());

        if(provider_result.isPresent() && patient_result.isPresent()){
            String appointment_id = UUID.randomUUID().toString();
            Provider provider = provider_result.get();
            Patient patient = patient_result.get();
            Appointment appointment = new Appointment();
            appointment.setProvider(provider);
            appointment.setPatient(patient);
            appointment.setAppointment_time(appointmentRequest.getAppointment_time());
            appointment.setAppointment_id(appointment_id);
            appointmentsRepository.save(appointment);
            return appointment_id;
        }
        else{
            return "-1";
        }
    }

    @Override
    public void deleteAppointment(String appointment_id) {

        Optional<Appointment> appointment_result = appointmentsRepository.findById(appointment_id);
        appointment_result.ifPresent(appointmentsRepository::delete);

    }


}
