package model;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the "Feedback" database table.
 * 
 */
@Entity
@Table(name="\"Feedback\"")
public class Feedback implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"feedbackId\"", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long feedbackId;

	@Column(name="\"customerId\"")
	private String customerId;

	@Temporal(TemporalType.DATE)
	@Column(name="\"feedbackDate\"")
	private Date feedbackDate;

	@Column(name="\"feedbackText\"")
	private String feedbackText;

	@Column(name="\"foodItemId\"")
	private BigDecimal foodItemId;

	@Column(name="\"orderId\"")
	private BigDecimal orderId;

	@Column(name="\"rating\"")
	private BigDecimal rating;

	@Column(name="\"vendorId\"")
	private String vendorId;

	//bi-directional many-to-one association to Customer
	@ManyToOne(optional=false)
	@JoinColumn(name="\"customerId\"",referencedColumnName="\"customerId\"")
	private Customer customer;

	//bi-directional many-to-one association to Order
	@ManyToOne(optional=false)
	@JoinColumn(name="\"orderId\"",referencedColumnName="\"orderId\"")
	private Order order;

	public Feedback() {
	}

	public long getFeedbackId() {
		return this.feedbackId;
	}

	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Date getFeedbackDate() {
		return this.feedbackDate;
	}

	public void setFeedbackDate(Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}

	public String getFeedbackText() {
		return this.feedbackText;
	}

	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
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

	public BigDecimal getRating() {
		return this.rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}

	public String getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}