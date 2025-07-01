package com.foodies.foodiesapi.service;

import com.foodies.foodiesapi.io.FoodRequest;
import com.foodies.foodiesapi.io.FoodResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FoodService {

    String uploadFile(MultipartFile file);

    FoodResponse addFood(FoodRequest request , MultipartFile file );

    List<FoodResponse> readFoods();

    FoodResponse readFood(String id);

    boolean deleteFiles (String filename);

    void deleteFood(String id);

}
