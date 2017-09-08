package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "FoodCategory" database table.
 * 
 */
@Entity
@Table(name="\"FoodCategory\"")
public class FoodCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"foodCategoryId\"")
	private String foodCategoryId;

	@Temporal(TemporalType.DATE)
	@Column(name="\"endDate\"")
	private Date endDate;

	@Column(name="\"foodCategoryCode\"")
	private String foodCategoryCode;

	@Column(name="\"foodCategoryName\"")
	private String foodCategoryName;

	@Temporal(TemporalType.DATE)
	@Column(name="\"startDate\"")
	private Date startDate;

	//bi-directional many-to-one association to FoodCatalogCategoryBridge
	@OneToMany(mappedBy="foodCategory")
	private List<FoodCatalogCategoryBridge> foodCatalogCategoryBridges;

	//bi-directional many-to-one association to FoodItem
	@OneToMany(mappedBy="foodCategory")
	private List<FoodItem> foodItems;

	public FoodCategory() {
	}

	public String getFoodCategoryId() {
		return this.foodCategoryId;
	}

	public void setFoodCategoryId(String foodCategoryId) {
		this.foodCategoryId = foodCategoryId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getFoodCategoryCode() {
		return this.foodCategoryCode;
	}

	public void setFoodCategoryCode(String foodCategoryCode) {
		this.foodCategoryCode = foodCategoryCode;
	}

	public String getFoodCategoryName() {
		return this.foodCategoryName;
	}

	public void setFoodCategoryName(String foodCategoryName) {
		this.foodCategoryName = foodCategoryName;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public List<FoodCatalogCategoryBridge> getFoodCatalogCategoryBridges() {
		return this.foodCatalogCategoryBridges;
	}

	public void setFoodCatalogCategoryBridges(List<FoodCatalogCategoryBridge> foodCatalogCategoryBridges) {
		this.foodCatalogCategoryBridges = foodCatalogCategoryBridges;
	}

	public FoodCatalogCategoryBridge addFoodCatalogCategoryBridge(FoodCatalogCategoryBridge foodCatalogCategoryBridge) {
		getFoodCatalogCategoryBridges().add(foodCatalogCategoryBridge);
		foodCatalogCategoryBridge.setFoodCategory(this);

		return foodCatalogCategoryBridge;
	}

	public FoodCatalogCategoryBridge removeFoodCatalogCategoryBridge(FoodCatalogCategoryBridge foodCatalogCategoryBridge) {
		getFoodCatalogCategoryBridges().remove(foodCatalogCategoryBridge);
		foodCatalogCategoryBridge.setFoodCategory(null);

		return foodCatalogCategoryBridge;
	}

	public List<FoodItem> getFoodItems() {
		return this.foodItems;
	}

	public void setFoodItems(List<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}

	public FoodItem addFoodItem(FoodItem foodItem) {
		getFoodItems().add(foodItem);
		foodItem.setFoodCategory(this);

		return foodItem;
	}

	public FoodItem removeFoodItem(FoodItem foodItem) {
		getFoodItems().remove(foodItem);
		foodItem.setFoodCategory(null);

		return foodItem;
	}

}