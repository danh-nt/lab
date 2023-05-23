
package bai1;
import java.util.Scanner;
public class gdich {
    public String magd;
    public String ngaygd;
    public Double dongia;
    public Double dientich;
    Scanner in = new Scanner(System.in);
    public gdich(){
        
    }
    public gdich(String magd, String ngaygd, Double dongia, Double dientich){
        
        this.dientich=dientich;
        this.magd=magd;
        this.ngaygd=ngaygd;
        this.dongia=dongia;
    }

    public String getMagd() {
        return magd;
    }

    public void setMagd(String magd) {
        this.magd = magd;
    }

    public String getNgaygd() {
        return ngaygd;
    }

    public void setNgaygd(String ngaygd) {
        this.ngaygd = ngaygd;
    }

    public Double getDongia() {
        return dongia;
    }

    public void setDongia(Double dongia) {
        this.dongia = dongia;
    }

    public Double getDientich() {
        return dientich;
    }

    public void setDientich(Double dientich) {
        this.dientich = dientich;
    }
    public void thongtin(){
        System.out.println("nhap Ma giao dich:");
        magd = in.nextLine();
        System.out.println("nhap Ngay giao dich:");
        ngaygd = in.nextLine();
        System.out.println("nhap Don gia:");
        dongia = in.nextDouble();
        System.out.println("nhap Dien tich:");
        dientich = in.nextDouble();
    }
    @Override
    public String toString(){
        return "Ma giao dich: " + magd + "Ngay giao dich:" + ngaygd + "Don gia:" + dongia + "Dien tich:" + dientich;
    }
}
