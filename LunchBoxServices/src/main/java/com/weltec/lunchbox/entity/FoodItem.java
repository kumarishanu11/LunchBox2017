package com.weltec.lunchbox.entity;

public class FoodItem {
	private int foodItemId;
	private String foodItemName;
	private String foodItemCode;
	private String description;
	private String ingredient;
	private float price;
	private int calori;
	private int timeToCoock;
	private int numberOfServe;
	public int getFoodItemId() {
		return foodItemId;
	}
	public void setFoodItemId(int foodItemId) {
		this.foodItemId = foodItemId;
	}
	public String getFoodItemName() {
		return foodItemName;
	}
	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}
	public String getFoodItemCode() {
		return foodItemCode;
	}
	public void setFoodItemCode(String foodItemCode) {
		this.foodItemCode = foodItemCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCalori() {
		return calori;
	}
	public void setCalori(int calori) {
		this.calori = calori;
	}
	public int getTimeToCoock() {
		return timeToCoock;
	}
	public void setTimeToCoock(int timeToCoock) {
		this.timeToCoock = timeToCoock;
	}
	public int getNumberOfServe() {
		return numberOfServe;
	}
	public void setNumberOfServe(int numberOfServe) {
		this.numberOfServe = numberOfServe;
	}
	

}
