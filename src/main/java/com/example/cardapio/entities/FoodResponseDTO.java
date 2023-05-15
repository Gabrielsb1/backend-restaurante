package com.example.cardapio.entities;

public record FoodResponseDTO(Long id, String title, String urlimg, Integer price){
	
	public FoodResponseDTO(Food food) {
		this(food.getId(), food.getTitle(), food.getUrlImg(), food.getPrice());
	}
}
