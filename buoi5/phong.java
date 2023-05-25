package buoi5;
import java.util.Scanner;
public class phong {
	String maphong;
	String daynha;
	Double dientich;
	int bongden;
	Scanner in = new Scanner(System.in);
	public phong() {
		
	}
	public phong(String maphong, String daynhya, Double dientich, int bongden) {
		this.maphong=maphong;
		this.daynha=daynhya;
		this.dientich=dientich;
		this.bongden=bongden;
	}
	public void nhap() {
		System.out.println("nhap ma phong: ");
		maphong = in.nextLine();
		System.out.println("nhap day nha: ");
		daynha = in.nextLine();
		System.out.println("nhap dien tich: ");
		dientich = in.nextDouble();
		System.out.println("nhap so bong den: ");
		bongden = in.nextInt();
	}
	public String toString() {
		return "Ma phong: " + maphong + "Day nha: " + daynha + "Dien tich: " + dientich + "So bong den: " + bongden;
	}
	
}
