package com.weltec.lunchbox.entity;

import java.util.ArrayList;

public class FoodCatalog {
	private String foodCatalogName;
	private String vendorId;
	private int foodCatalogId;
	private ArrayList<FoodCategory> foodCategoryList;
	public String getFoodCatalogName() {
		return foodCatalogName;
	}
	public void setFoodCatalogName(String foodCatalogName) {
		this.foodCatalogName = foodCatalogName;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public int getFoodCatalogId() {
		return foodCatalogId;
	}
	public void setFoodCatalogId(int foodCatalogId) {
		this.foodCatalogId = foodCatalogId;
	}
	public ArrayList<FoodCategory> getFoodCategoryList() {
		return foodCategoryList;
	}
	public void setFoodCategoryList(ArrayList<FoodCategory> foodCategoryList) {
		this.foodCategoryList = foodCategoryList;
	}

}
