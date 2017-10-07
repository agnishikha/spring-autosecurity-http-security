package org.springpeople.security.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springpeople.security.domain.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
