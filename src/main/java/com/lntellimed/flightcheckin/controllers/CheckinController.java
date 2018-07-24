package com.lntellimed.flightcheckin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lntellimed.flightcheckin.integration.ReservationRestClient;
import com.lntellimed.flightcheckin.integration.dto.Reservation;

@Controller
public class CheckinController {
	
	@Autowired
	ReservationRestClient restClient;

	@RequestMapping("/showStartCheckin")
	public String showStartCheckin() {
		return "startCheckin";
	}
	
	@RequestMapping("/startCheckin")
	public String startCheckin(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {
		Reservation reservation = restClient.findReservation(reservationId);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservationDetails";
	}
}
