package com.mindtree.restoline.service.impl;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.mindtree.restoline.entity.Restaurant;
import com.mindtree.restoline.repository.RestaurantRespository;
import com.mindtree.restoline.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private RestaurantRespository restaurantRespository;

	@Override
	public Restaurant addRestaurant(Restaurant restaurant) {

		return restaurantRespository.save(restaurant);

	}

	@Override
	public Set<Restaurant> getAllRestaurant() {

		return new TreeSet<Restaurant>(restaurantRespository.findAll());
	}

	@Override
	public Restaurant getRestaurantByID(int id) {

		return restaurantRespository.findById(id).get();
	}

}
