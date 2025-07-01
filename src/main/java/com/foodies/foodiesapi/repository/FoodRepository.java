package com.foodies.foodiesapi.repository;

import com.foodies.foodiesapi.entity.FoodEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodRepository extends MongoRepository<FoodEntity, String> {


}
