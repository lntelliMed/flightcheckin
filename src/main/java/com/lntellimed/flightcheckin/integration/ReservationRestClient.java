package com.lntellimed.flightcheckin.integration;

import com.lntellimed.flightcheckin.integration.dto.Reservation;
import com.lntellimed.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	public Reservation updateReservation(ReservationUpdateRequest request);
}
