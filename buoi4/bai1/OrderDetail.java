
package lab.pkg2;


public class OrderDetail {
	public int quatity;
	public Product product;

	public OrderDetail(){
	}
	public OrderDetail(Product p, int x) {
	}
	public double calcTotalPrice() {
		return quatity * Product.getPrice();
	}
	public Product getProduct() {
		return product;
	}
	public int getQuatity() {
		return quatity;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public void add(OrderDetail orderDetail) {
	}
	public OrderDetail(int quatity, Product product) {
		this.quatity = quatity;
		this.product = product;
	}
}

package lab.pkg2;


public class OrderDetail {
	public int quatity;
	public Product product;

	public OrderDetail(){
	}
	public OrderDetail(Product p, int x) {
	}
	public double calcTotalPrice() {
		return quatity * Product.getPrice();
	}
	public Product getProduct() {
		return product;
	}
	public int getQuatity() {
		return quatity;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public void add(OrderDetail orderDetail) {
	}
	public OrderDetail(int quatity, Product product) {
		this.quatity = quatity;
		this.product = product;
	}
}
