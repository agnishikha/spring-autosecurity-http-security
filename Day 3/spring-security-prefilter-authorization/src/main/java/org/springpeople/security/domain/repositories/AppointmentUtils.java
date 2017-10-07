package org.springpeople.security.domain.repositories;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springpeople.security.domain.entities.Appointment;
import org.springpeople.security.domain.entities.AutoUser;

@Component
public class AppointmentUtils {

	public String saveAll(List<Appointment> appointments) {
		StringBuilder sb =new StringBuilder();
		
		for (Appointment appointment : appointments) {
			sb.append(appointment.getUser().getEmail());
			sb.append(" ");
		}
		
		return sb.toString();
	}
	
	public static Appointment createAppointment(AutoUser user) {
		Appointment appointment = new Appointment();
		appointment.setUser(user);
		return appointment;
	}
}
 