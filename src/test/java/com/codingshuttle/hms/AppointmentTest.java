package com.codingshuttle.hms;

import com.codingshuttle.hms.entities.Appointment;
import com.codingshuttle.hms.services.AppointmentService;
import com.codingshuttle.hms.services.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class AppointmentTest {
    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private PatientService patientService;

    @Test
    void testCreateNewAppointment(){
        Appointment appointment = Appointment.builder()
                .appointmentDateTime(LocalDateTime.of(2026,3,31,15,30))
                .reason("Cough & Cold")
                .build();

        Appointment newAppointment = appointmentService.createANewAppointment(appointment, 1L, 1L);
        System.out.println(newAppointment);

        System.out.println("Trying to delete patient with id:1");
        patientService.deletePatient(1L);
    }
}
