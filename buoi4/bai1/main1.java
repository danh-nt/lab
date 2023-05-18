
package lab.pkg2;


import java.util.Scanner;

public class main1{
	public static void nhap(Product sp) {
                Order o = new Order();
		Scanner sc = new Scanner(System.in);
		OrderDetail od = new OrderDetail(sp, 0); 
		System.out.print("Nhap ma SP : ");
		sp.setProductID(sc.nextLine());
		System.out.print("Nhap mo ta : ");
		sp.setDesciption(sc.nextLine());
		System.out.print("Nhap don gia: ");
		sp.setPrice(sc.nextDouble());
		System.out.print("Nhap so luong : ");
		sp.setQuatity(sc.nextInt());
		
	}
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Product sp = new Product();
		Product s1[] = null;
		OrderDetail od = new OrderDetail(sp, 0); 
		Order o = new Order ();
		System.out.println("So luong can nhap : ");
        int n = sc.nextInt();
        s1 = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Hoa don " + (i + 1)+": ");
            s1[i] = new Product ();
            nhap(s1[i]);
        }
		System.out.printf("%10s | %10s | %16s | %10s | %10s | \n", "Ma SP" , "Mo ta", "Don gia" ,"So Luong" , "Thanh Tien");
		 for (int i = 0; i < n; i++) {
             s1[i].hien(); 
         }
	}
}
	
