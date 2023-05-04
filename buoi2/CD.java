
package lab.pkg2;


public class CD{
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	public CD() {
		
	}
	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}
	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}
	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public int getMaCD() {
		return maCD;
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public String toString() {
		return"Ma CD : " + maCD +", Tua CD : "+ tuaCD+ ", So bai hat : " + soBaiHat + ", Gia thanh : "+giaThanh;  
	}
	public void hienThi(){
        System.out.printf("%-10d %-20s %-10d %-15.3f \n",maCD,tuaCD,soBaiHat,giaThanh);
    }
	
	
}