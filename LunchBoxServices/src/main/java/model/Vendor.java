package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "Vendor" database table.
 * 
 */
@Entity
@Table(name="\"Vendor\"")
public class Vendor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"vendorId\"")
	private String vendorId;

	@Column(name="\"businessAddress\"")
	private String businessAddress;

	@Column(name="\"businessName\"")
	private String businessName;

	@Column(name="\"contactNumber\"")
	private String contactNumber;

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

	@Column(name="\"password\"")
	private String password;

	@Temporal(TemporalType.DATE)
	@Column(name="\"startDate\"")
	private Date startDate;

	//bi-directional many-to-one association to FoodCatalog
	
	@OneToMany(mappedBy="vendor",targetEntity=FoodCatalog.class,
		       fetch=FetchType.LAZY)
	private List<FoodCatalog> foodCatalogs;

	public Vendor() {
	}

	public String getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getBusinessAddress() {
		return this.businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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

	public List<FoodCatalog> getFoodCatalogs() {
		return this.foodCatalogs;
	}

	public void setFoodCatalogs(List<FoodCatalog> foodCatalogs) {
		this.foodCatalogs = foodCatalogs;
	}

	public FoodCatalog addFoodCatalog(FoodCatalog foodCatalog) {
		getFoodCatalogs().add(foodCatalog);
		foodCatalog.setVendor(this);

		return foodCatalog;
	}

	public FoodCatalog removeFoodCatalog(FoodCatalog foodCatalog) {
		getFoodCatalogs().remove(foodCatalog);
		foodCatalog.setVendor(null);

		return foodCatalog;
	}

}