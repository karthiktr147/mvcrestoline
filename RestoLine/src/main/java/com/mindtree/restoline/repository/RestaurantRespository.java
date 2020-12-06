package com.mindtree.restoline.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.restoline.entity.Restaurant;

@Repository
public interface RestaurantRespository extends JpaRepository<Restaurant, Integer> {
	Optional<Restaurant> findByRestaurantName(String restaurantName);
}
