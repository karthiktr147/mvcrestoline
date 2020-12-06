package com.mindtree.restoline.service;

import java.util.Set;

import com.mindtree.restoline.entity.Reservation;
import com.mindtree.restoline.entity.User;

public interface ReservationService {

	int bookSeat(int noofseat, int restId, User userById);

	Set<Reservation> getAllReservationOfUser(int i);

	void cancleReservation(int reservationId); 
	

} 
