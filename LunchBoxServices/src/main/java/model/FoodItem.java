package model;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "FoodItem" database table.
 * 
 */
@Entity
@Table(name="\"FoodItem\"")
public class FoodItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"foodItemId\"")
	private long foodItemId;

	@Column(name="\"calorie\"")
	private String calorie;

	@Column(name="\"description\"")
	private String description;

	@Temporal(TemporalType.DATE)
	@Column(name="\"endDate\"")
	private Date endDate;

	@Column(name="\"foodCategoryId\"")
	private BigDecimal foodCategoryId;

	@Column(name="\"foodItemName\"")
	private String foodItemName;

	@Column(name="\"ingredient\"")
	private String ingredient;

	@Column(name="\"numberOfServe\"")
	private BigDecimal numberOfServe;

	@Column(name="\"price\"")
	private BigDecimal price;

	@Temporal(TemporalType.DATE)
	@Column(name="\"startDate\"")
	private Date startDate;

	@Column(name="\"timeToServer\"")
	private String timeToServer;

	//bi-directional many-to-one association to FoodCategory
	@ManyToOne(optional=false)
    @JoinColumn(name="\"foodCategoryId\"",referencedColumnName="\"foodCategoryId\"")
	private FoodCategory foodCategory;
	
	//bi-directional many-to-one association to OrderItem
	@OneToMany(mappedBy="foodItem",fetch = FetchType.LAZY)
	private List<OrderItem> orderItems;

	public FoodItem() {
	}

	public long getFoodItemId() {
		return this.foodItemId;
	}

	public void setFoodItemId(long foodItemId) {
		this.foodItemId = foodItemId;
	}

	public String getCalorie() {
		return this.calorie;
	}

	public void setCalorie(String calorie) {
		this.calorie = calorie;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getFoodCategoryId() {
		return this.foodCategoryId;
	}

	public void setFoodCategoryId(BigDecimal foodCategoryId) {
		this.foodCategoryId = foodCategoryId;
	}

	public String getFoodItemName() {
		return this.foodItemName;
	}

	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}

	public String getIngredient() {
		return this.ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public BigDecimal getNumberOfServe() {
		return this.numberOfServe;
	}

	public void setNumberOfServe(BigDecimal numberOfServe) {
		this.numberOfServe = numberOfServe;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTimeToServer() {
		return this.timeToServer;
	}

	public void setTimeToServer(String timeToServer) {
		this.timeToServer = timeToServer;
	}

	public FoodCategory getFoodCategory() {
		return this.foodCategory;
	}

	public void setFoodCategory(FoodCategory foodCategory) {
		this.foodCategory = foodCategory;
	}

	public List<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public OrderItem addOrderItem(OrderItem orderItem) {
		getOrderItems().add(orderItem);
		orderItem.setFoodItem(this);

		return orderItem;
	}

	public OrderItem removeOrderItem(OrderItem orderItem) {
		getOrderItems().remove(orderItem);
		orderItem.setFoodItem(null);

		return orderItem;
	}

}