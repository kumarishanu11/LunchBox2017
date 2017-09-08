package com.weltec.lunchbox.entity;

import java.util.ArrayList;

public class FoodCategory {
	private String foodCategoryId;
	private String foodCategoryCode;
	private String foodCategoryName;
	private ArrayList<FoodItem> foodItemList;
	public String getFoodCategoryId() {
		return foodCategoryId;
	}
	public void setFoodCategoryId(String foodCategoryId) {
		this.foodCategoryId = foodCategoryId;
	}
	public String getFoodCategoryCode() {
		return foodCategoryCode;
	}
	public void setFoodCategoryCode(String foodCategoryCode) {
		this.foodCategoryCode = foodCategoryCode;
	}
	public String getFoodCategoryName() {
		return foodCategoryName;
	}
	public void setFoodCategoryName(String foodCategoryName) {
		this.foodCategoryName = foodCategoryName;
	}
	

}
