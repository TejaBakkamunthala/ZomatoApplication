package com.zomato.app.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Menu",schema="zomato")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private int menuId;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", referencedColumnName = "restaurant_id")
    private Restaurant restaurant;

    @Column(name = "item_name", nullable = false)
    private String itemName;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "price")
    private double price;

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Menu(int menuId, Restaurant restaurant, String itemName, String description, double price) {
		super();
		this.menuId = menuId;
		this.restaurant = restaurant;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
	}

	
	public Menu() {
		super();
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", restaurant=" + restaurant + ", itemName=" + itemName + ", description="
				+ description + ", price=" + price + "]";
	}


    

}
