package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "FoodCatalogCategoryBridge" database table.
 * 
 */
@Entity
@Table(name="\"FoodCatalogCategoryBridge\"")
public class FoodCatalogCategoryBridge implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"foodCatalogCategoryBridgeId\"")
	private String foodCatalogCategoryBridgeId;

	@Temporal(TemporalType.DATE)
	@Column(name="\"endDate\"")
	private Date endDate;

	@Column(name="\"foodCatalogId\"")
	private String foodCatalogId;

	@Column(name="\"foodCategoryId\"")
	private String foodCategoryId;

	@Temporal(TemporalType.DATE)
	@Column(name="\"startDate\"")
	private Date startDate;

	//bi-directional many-to-one association to FoodCatalog
	@ManyToOne
	@JoinColumns({
		})
	private FoodCatalog foodCatalog;

	//bi-directional many-to-one association to FoodCategory
	@ManyToOne
	@JoinColumns({
		})
	private FoodCategory foodCategory;

	public FoodCatalogCategoryBridge() {
	}

	public String getFoodCatalogCategoryBridgeId() {
		return this.foodCatalogCategoryBridgeId;
	}

	public void setFoodCatalogCategoryBridgeId(String foodCatalogCategoryBridgeId) {
		this.foodCatalogCategoryBridgeId = foodCatalogCategoryBridgeId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getFoodCatalogId() {
		return this.foodCatalogId;
	}

	public void setFoodCatalogId(String foodCatalogId) {
		this.foodCatalogId = foodCatalogId;
	}

	public String getFoodCategoryId() {
		return this.foodCategoryId;
	}

	public void setFoodCategoryId(String foodCategoryId) {
		this.foodCategoryId = foodCategoryId;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public FoodCatalog getFoodCatalog() {
		return this.foodCatalog;
	}

	public void setFoodCatalog(FoodCatalog foodCatalog) {
		this.foodCatalog = foodCatalog;
	}

	public FoodCategory getFoodCategory() {
		return this.foodCategory;
	}

	public void setFoodCategory(FoodCategory foodCategory) {
		this.foodCategory = foodCategory;
	}

}