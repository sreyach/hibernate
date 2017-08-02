package com.hibernate.OneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fooditems")
public class Food {
	@Id
	@GeneratedValue
	private int foodId;
	private String item;
	@ManyToOne
	@JoinColumn(name = "customerId")
	Customer customer;

	// private int idx;
	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Food Items [food Id=" + foodId + ", item=" + item + "]";
	}
	
}