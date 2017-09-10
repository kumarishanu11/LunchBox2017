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
	@Column(name="\"foodCatalogCategoryBridgeId\"", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long foodCatalogCategoryBridgeId;

	@Temporal(TemporalType.DATE)
	@Column(name="\"endDate\"")
	private Date endDate;

	@Column(name="\"foodCatalogId\"")
	private java.math.BigDecimal foodCatalogId;

	@Column(name="\"foodCategoryId\"")
	private java.math.BigDecimal foodCategoryId;

	@Temporal(TemporalType.DATE)
	@Column(name="\"startDate\"")
	private Date startDate;

	//bi-directional many-to-one association to FoodCatalog
	@ManyToOne(optional=false)
	@JoinColumn(name="\"foodCatalogId\"",referencedColumnName="\"foodCatalogId\"")
	private FoodCatalog foodCatalog;

	//bi-directional many-to-one association to FoodCategory
	@ManyToOne(optional=false)
	@JoinColumn(name="\"foodCategoryId\"",referencedColumnName="\"foodCategoryId\"")
	private FoodCategory foodCategory;

	public FoodCatalogCategoryBridge() {
	}

	public long getFoodCatalogCategoryBridgeId() {
		return this.foodCatalogCategoryBridgeId;
	}

	public void setFoodCatalogCategoryBridgeId(long foodCatalogCategoryBridgeId) {
		this.foodCatalogCategoryBridgeId = foodCatalogCategoryBridgeId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public java.math.BigDecimal getFoodCatalogId() {
		return this.foodCatalogId;
	}

	public void setFoodCatalogId(java.math.BigDecimal foodCatalogId) {
		this.foodCatalogId = foodCatalogId;
	}

	public java.math.BigDecimal getFoodCategoryId() {
		return this.foodCategoryId;
	}

	public void setFoodCategoryId(java.math.BigDecimal foodCategoryId) {
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