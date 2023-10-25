package com.zomato.app.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Order_Item" ,schema="zomato")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private int orderItemId;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "menu_id", referencedColumnName = "menu_id")
    private Menu menu;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "total_item_price")
    private double totalItemPrice;

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalItemPrice() {
		return totalItemPrice;
	}

	public void setTotalItemPrice(double totalItemPrice) {
		this.totalItemPrice = totalItemPrice;
	}

	public OrderItem(int orderItemId, Order order, Menu menu, int quantity, double totalItemPrice) {
		super();
		this.orderItemId = orderItemId;
		this.order = order;
		this.menu = menu;
		this.quantity = quantity;
		this.totalItemPrice = totalItemPrice;
	}
	
	

	public OrderItem() {
		super();
	}

	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", order=" + order + ", menu=" + menu + ", quantity="
				+ quantity + ", totalItemPrice=" + totalItemPrice + "]";
	}

    
    
}
