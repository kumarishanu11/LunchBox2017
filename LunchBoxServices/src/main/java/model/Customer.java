package model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "Customer" database table.
 * 
 */
@Entity
@Table(name="\"Customer\"")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"customerId\"")
	private String customerId;

	@Column(name="\"contactNumber\"")
	private String contactNumber;

	@Column(name="\"deliveryAddress\"")
	private String deliveryAddress;

	@Column(name="\"emailId\"")
	private String emailId;

	@Temporal(TemporalType.DATE)
	@Column(name="\"endDate\"")
	private Date endDate;

	@Column(name="\"firstName\"")
	private String firstName;

	@Column(name="\"homeAddress\"")
	private String homeAddress;

	@Column(name="\"lastName\"")
	private String lastName;

	@Column(name="\"nickName\"")
	private String nickName;

	@Column(name="\"password\"")
	private String password;

	@Temporal(TemporalType.DATE)
	@Column(name="\"startDate\"")
	private Date startDate;

	//bi-directional many-to-one association to Feedback
	@OneToMany(mappedBy="customer" ,fetch = FetchType.LAZY)
	private List<Feedback> feedbacks;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="customer", fetch = FetchType.LAZY)
	private List<Order> orders;

	//bi-directional many-to-one association to Payment
	@OneToMany(mappedBy="customer", fetch = FetchType.LAZY)
	private List<Payment> payments;

	public Customer() {
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getHomeAddress() {
		return this.homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public List<Feedback> getFeedbacks() {
		return this.feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public Feedback addFeedback(Feedback feedback) {
		getFeedbacks().add(feedback);
		feedback.setCustomer(this);

		return feedback;
	}

	public Feedback removeFeedback(Feedback feedback) {
		getFeedbacks().remove(feedback);
		feedback.setCustomer(null);

		return feedback;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setCustomer(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setCustomer(null);

		return order;
	}

	public List<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public Payment addPayment(Payment payment) {
		getPayments().add(payment);
		payment.setCustomer(this);

		return payment;
	}

	public Payment removePayment(Payment payment) {
		getPayments().remove(payment);
		payment.setCustomer(null);

		return payment;
	}

}