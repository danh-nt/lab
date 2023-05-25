package buoi5;
import java.util.Scanner;
public class Lythuyet extends phong{
	int maychieu;
	Scanner in = new Scanner(System.in);
	public Lythuyet () {
		
	}
	public Lythuyet(int maychieu) {
		this.maychieu=maychieu;
	}
	public void nhap() {
		super.nhap();
		System.out.println("nhap so luong may chieu: ");
		maychieu = in.nextInt();
		
	}
	public String toString() {
		return super.toString() + "May chieu: " + maychieu;
	}
	public void ktra() {
		Double a = dientich/bongden;
		if(maychieu>=1 && a <=10 )
			System.out.println("Phong dat chuan");
		System.out.println("Phong khong dat chuan");
	}

}
