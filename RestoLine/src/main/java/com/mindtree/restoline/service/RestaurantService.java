package com.mindtree.restoline.service;

import java.util.Set;


import com.mindtree.restoline.entity.Restaurant;

public interface RestaurantService {

	Restaurant addRestaurant(Restaurant restaurant);

	Set<Restaurant> getAllRestaurant();

	Restaurant getRestaurantByID(int id); 

}
