package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "FoodCatalog" database table.
 * 
 */
@Entity
@Table(name="\"FoodCatalog\"")
public class FoodCatalog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"foodCatalogId\"")
	private String foodCatalogId;

	@Temporal(TemporalType.DATE)
	@Column(name="\"endDate\"")
	private Date endDate;

	@Column(name="\"foodCatalogName\"")
	private String foodCatalogName;

	@Temporal(TemporalType.DATE)
	@Column(name="\"startDate\"")
	private Date startDate;

	@Column(name="\"vendorId\"")
	private String vendorId;

	//bi-directional many-to-one association to Vendor
	@ManyToOne
	@JoinColumns({
		})
	private Vendor vendor;

	//bi-directional many-to-one association to FoodCatalogCategoryBridge
	@OneToMany(mappedBy="foodCatalog")
	private List<FoodCatalogCategoryBridge> foodCatalogCategoryBridges;

	public FoodCatalog() {
	}

	public String getFoodCatalogId() {
		return this.foodCatalogId;
	}

	public void setFoodCatalogId(String foodCatalogId) {
		this.foodCatalogId = foodCatalogId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getFoodCatalogName() {
		return this.foodCatalogName;
	}

	public void setFoodCatalogName(String foodCatalogName) {
		this.foodCatalogName = foodCatalogName;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public Vendor getVendor() {
		return this.vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public List<FoodCatalogCategoryBridge> getFoodCatalogCategoryBridges() {
		return this.foodCatalogCategoryBridges;
	}

	public void setFoodCatalogCategoryBridges(List<FoodCatalogCategoryBridge> foodCatalogCategoryBridges) {
		this.foodCatalogCategoryBridges = foodCatalogCategoryBridges;
	}

	public FoodCatalogCategoryBridge addFoodCatalogCategoryBridge(FoodCatalogCategoryBridge foodCatalogCategoryBridge) {
		getFoodCatalogCategoryBridges().add(foodCatalogCategoryBridge);
		foodCatalogCategoryBridge.setFoodCatalog(this);

		return foodCatalogCategoryBridge;
	}

	public FoodCatalogCategoryBridge removeFoodCatalogCategoryBridge(FoodCatalogCategoryBridge foodCatalogCategoryBridge) {
		getFoodCatalogCategoryBridges().remove(foodCatalogCategoryBridge);
		foodCatalogCategoryBridge.setFoodCatalog(null);

		return foodCatalogCategoryBridge;
	}

}