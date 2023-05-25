package buoi5;

public class ThiNghiem extends phong{
	String ttnganh;
	Long succhua;
	int bonrua;
	public ThiNghiem() {
		
	}
	public ThiNghiem(String ttnganh, Long succhua, int bonrua) {
		this.ttnganh=ttnganh;
		this.succhua=succhua;
		this.bonrua=bonrua;
		
	}
	public void nhap() {
		super.nhap();
		System.out.println("nhap thong tin nganh: ");
		ttnganh = in.nextLine();
		System.out.println("nhap suc chua: ");
		succhua = in.nextLong();
		bonrua = in.nextInt();
		
	}
	public String toString() {
		return super.toString() + "Thong tin nganh: " + ttnganh + "Suc chua: " + succhua + "Bon rua: " + bonrua;
	}
	public void ktra() {
		Double a = dientich/bongden;
		if(bonrua>=1 && a<=10)
			System.out.println("Phong dat chuan");
		System.out.println("Phogn khong dat chuan");
	}

}
