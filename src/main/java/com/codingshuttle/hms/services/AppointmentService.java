package com.codingshuttle.hms.services;

import com.codingshuttle.hms.entities.Appointment;
import com.codingshuttle.hms.entities.Doctor;
import com.codingshuttle.hms.entities.Patient;
import com.codingshuttle.hms.repositories.AppointmentRepository;
import com.codingshuttle.hms.repositories.DoctorRepository;
import com.codingshuttle.hms.repositories.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;

    @Transactional
    public Appointment createANewAppointment(Appointment appointment,
                                             Long patientId, Long doctorId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        return appointmentRepository.save(appointment);
    }
}
