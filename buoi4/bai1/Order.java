
package lab.pkg2;


import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
	public int orderID;
	public LocalDate orderDate;
	public OrderDetail[] lineItems;
	public int count;
	
	public Order() {
		
	}
	public Order(int orderID ,LocalDate orderDate ) {
		this.orderID = orderID;
		this.orderDate = orderDate;
	}

	
	public int getCount() {
		return count;
	}
	public OrderDetail[] getLineitems() {
		return lineItems;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public void addLineItem(Product p, int x) {
        lineItems[count] = new OrderDetail(p, x);
        count++;
    }
	public double calcTotalCharge(){
		double tt = 0;
        for (int i = 0; i < count; i++) {
            tt += lineItems[i].calcTotalPrice();
        }
        return tt;
	}
}
