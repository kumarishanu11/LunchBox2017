package model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "Order" database table.
 * 
 */
@Entity
@Table(name="\"Order\"")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"orderId\"", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderId;

	@Column(name="\"customerId\"")
	private String customerId;

	@Column(name="\"orderStatusId\"")
	private String orderStatusId;

	@Temporal(TemporalType.DATE)
	@Column(name="\"orderTime\"")
	private Date orderTime;

	@Column(name="\"paymentId\"")
	private java.math.BigDecimal paymentId;

	@Column(name="\"total\"")
	private java.math.BigDecimal total;

	//bi-directional many-to-one association to Feedback
	@OneToMany(mappedBy="order",fetch = FetchType.LAZY)
	private List<Feedback> feedbacks;

	//bi-directional many-to-one association to Customer
	@ManyToOne(optional=false)
	@JoinColumn(name="\"customerId\"",referencedColumnName="\"customerId\"")
	private Customer customer;

	//bi-directional many-to-one association to Payment
	@ManyToOne(optional=false)
	@JoinColumn(name="\"paymentId\"",referencedColumnName="\"paymentId\"")
	private Payment payment;

	//bi-directional many-to-one association to OrderItem
	@OneToMany(mappedBy="order", fetch = FetchType.LAZY)
	private List<OrderItem> orderItems;

	public Order() {
	}

	public long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderStatusId() {
		return this.orderStatusId;
	}

	public void setOrderStatusId(String orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public java.math.BigDecimal getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(java.math.BigDecimal paymentId) {
		this.paymentId = paymentId;
	}

	public java.math.BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(java.math.BigDecimal total) {
		this.total = total;
	}

	public List<Feedback> getFeedbacks() {
		return this.feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public Feedback addFeedback(Feedback feedback) {
		getFeedbacks().add(feedback);
		feedback.setOrder(this);

		return feedback;
	}

	public Feedback removeFeedback(Feedback feedback) {
		getFeedbacks().remove(feedback);
		feedback.setOrder(null);

		return feedback;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Payment getPayment() {
		return this.payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public OrderItem addOrderItem(OrderItem orderItem) {
		getOrderItems().add(orderItem);
		orderItem.setOrder(this);

		return orderItem;
	}

	public OrderItem removeOrderItem(OrderItem orderItem) {
		getOrderItems().remove(orderItem);
		orderItem.setOrder(null);

		return orderItem;
	}

}