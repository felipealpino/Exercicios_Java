package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	List<OrderItem> list = new ArrayList<>();
	
	private Client cliente;

	public Order(OrderStatus status, Client cliente) {
		this.moment = new Date();
		this.status = status;
		this.cliente = cliente;
	}

	
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCliente() {
		return cliente;
	}
	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public List<OrderItem> getList() {
		return list;
	}
	
	
	public void addItem(OrderItem item) {
		list.add(item);
	}
	public void removeItem(OrderItem item) {
		list.remove(item);
	}
	public Double total() {
		double total = 0;
		for(int i=0; i<list.size(); i++) {
			total += list.get(i).subTotal();
		}
		
		return total;
	}
	
	
	
	
	
}
