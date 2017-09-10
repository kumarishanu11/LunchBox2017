package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "OrderItem" database table.
 * 
 */
@Entity
@Table(name="\"OrderItem\"")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"orderItemId\"")
	private long orderItemId;

	@Column(name="\"foodItemId\"")
	private BigDecimal foodItemId;

	@Column(name="\"orderId\"")
	private BigDecimal orderId;

	@Column(name="\"quantity\"")
	private BigDecimal quantity;

	//bi-directional many-to-one association to FoodItem
	@ManyToOne(optional=false)
	@JoinColumn(name="\"foodItemId\"",referencedColumnName="\"foodItemId\"")
	private FoodItem foodItem;

	//bi-directional many-to-one association to Order
	@ManyToOne(optional=false)
	@JoinColumn(name="\"orderId\"",referencedColumnName="\"orderId\"")
	private Order order;

	public OrderItem() {
	}

	public long getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public BigDecimal getFoodItemId() {
		return this.foodItemId;
	}

	public void setFoodItemId(BigDecimal foodItemId) {
		this.foodItemId = foodItemId;
	}

	public BigDecimal getOrderId() {
		return this.orderId;
	}

	public void setOrderId(BigDecimal orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public FoodItem getFoodItem() {
		return this.foodItem;
	}

	public void setFoodItem(FoodItem foodItem) {
		this.foodItem = foodItem;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}