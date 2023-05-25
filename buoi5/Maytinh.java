package buoi5;
import java.util.Scanner;
public class Maytinh extends phong{
	int maytinh;
	Scanner in = new Scanner(System.in);
	public Maytinh() {
		
	}
	public Maytinh(int maytinh) {
		this.maytinh=maytinh;
	}
	public void nhap() {
	super.nhap();
	System.out.println("nhap so luong may tinh: ");
	maytinh = in.nextInt();
	}
	public String toString() {
		return super.toString() + "So may tinh: " + maytinh;
	}
	public void ktra() {
		Double t = dientich/maytinh;
		Double a = dientich/bongden;
		if(t<=1.5 && a <=10)
			System.out.println("Phong dat chuan");
		System.out.println("Phong khong dat chuan");
	}

}
