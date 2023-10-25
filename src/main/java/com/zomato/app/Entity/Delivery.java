package com.zomato.app.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Delivery",schema="zomato")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    private int deliveryId;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;

    @Column(name = "delivery_address")
    private String deliveryAddress;

    @Column(name = "delivery_status")
    private String deliveryStatus;

    @Column(name = "delivery_person")
    private String deliveryPerson;

	public int getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getDeliveryPerson() {
		return deliveryPerson;
	}

	public void setDeliveryPerson(String deliveryPerson) {
		this.deliveryPerson = deliveryPerson;
	}

	public Delivery(int deliveryId, Order order, String deliveryAddress, String deliveryStatus, String deliveryPerson) {
		super();
		this.deliveryId = deliveryId;
		this.order = order;
		this.deliveryAddress = deliveryAddress;
		this.deliveryStatus = deliveryStatus;
		this.deliveryPerson = deliveryPerson;
	}
	

	public Delivery() {
		super();
	}

	@Override
	public String toString() {
		return "Delivery [deliveryId=" + deliveryId + ", order=" + order + ", deliveryAddress=" + deliveryAddress
				+ ", deliveryStatus=" + deliveryStatus + ", deliveryPerson=" + deliveryPerson + "]";
	}

    

}
