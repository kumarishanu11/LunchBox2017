package model;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "Payment" database table.
 * 
 */
@Entity
@Table(name="\"Payment\"")
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"paymentId\"")
	private long paymentId;

	@Column(name="\"amount\"")
	private BigDecimal amount;

	@Column(name="\"customerId\"")
	private String customerId;

	@Column(name="\"paymentMode\"")
	private String paymentMode;

	@Temporal(TemporalType.DATE)
	@Column(name="\"paymentTime\"")
	private Date paymentTime;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="payment", fetch = FetchType.LAZY)
	private List<Order> orders;

	//bi-directional many-to-one association to Customer
	@ManyToOne(optional=false)
	@JoinColumn(name="\"customerId\"",referencedColumnName="\"customerId\"")
	private Customer customer;

	public Payment() {
	}

	public long getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Date getPaymentTime() {
		return this.paymentTime;
	}

	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setPayment(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setPayment(null);

		return order;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}